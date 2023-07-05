package org.veiset.libgdx.utils

import com.badlogic.gdx.scenes.scene2d.utils.UIUtils
import org.lwjgl.system.macosx.LibC
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.lang.management.ManagementFactory

class StartOnFirstThreadHelper private constructor() {
    init {
        throw UnsupportedOperationException()
    }

    companion object {
        private const val JVM_RESTARTED_ARG = "jvmIsRestarted"

        @JvmOverloads
        fun startNewJvmIfRequired(redirectOutput: Boolean = true): Boolean {
            if (!UIUtils.isMac) {
                return false
            }
            val pid = LibC.getpid()

            // check whether -XstartOnFirstThread is enabled
            if ("1" == System.getenv("JAVA_STARTED_ON_FIRST_THREAD_$pid")) {
                return false
            }

            // check whether the JVM was previously restarted
            // avoids looping, but most certainly leads to a crash
            if ("true" == System.getProperty(JVM_RESTARTED_ARG)) {
                System.err.println(
                    "There was a problem evaluating whether the JVM was started with the -XstartOnFirstThread argument."
                )
                return false
            }

            // Restart the JVM with -XstartOnFirstThread
            val jvmArgs = ArrayList<String?>()
            val separator = System.getProperty("file.separator")
            // TODO Java 9: ProcessHandle.current().info().command();
            val javaExecPath = (System.getProperty("java.home") + separator
                    + "bin" + separator + "java")
            if (!File(javaExecPath).exists()) {
                System.err.println(
                    "A Java installation could not be found. If you are distributing this app with a bundled JRE, be sure to set the -XstartOnFirstThread argument manually!"
                )
                return false
            }
            jvmArgs.add(javaExecPath)
            jvmArgs.add("-XstartOnFirstThread")
            jvmArgs.add("-D" + JVM_RESTARTED_ARG + "=true")
            jvmArgs.addAll(
                ManagementFactory.getRuntimeMXBean().inputArguments
            )
            jvmArgs.add("-cp")
            jvmArgs.add(System.getProperty("java.class.path"))
            var mainClass = System.getenv("JAVA_MAIN_CLASS_$pid")
            if (mainClass == null) {
                val trace = Thread.currentThread().stackTrace
                mainClass = if (trace.size > 0) {
                    trace[trace.size - 1].className
                } else {
                    System.err.println("The main class could not be determined.")
                    return false
                }
            }
            jvmArgs.add(mainClass)
            try {
                if (!redirectOutput) {
                    val processBuilder = ProcessBuilder(jvmArgs)
                    processBuilder.start()
                } else {
                    val process = ProcessBuilder(jvmArgs)
                        .redirectErrorStream(true).start()
                    val processOutput = BufferedReader(
                        InputStreamReader(process.inputStream)
                    )
                    var line: String?
                    while (processOutput.readLine().also { line = it } != null) {
                        println(line)
                    }
                    process.waitFor()
                }
            } catch (e: Exception) {
                System.err.println("There was a problem restarting the JVM")
                e.printStackTrace()
            }
            return true
        }

        fun executeIfJVMValid(mainMethodCode: Runnable) {
            if (startNewJvmIfRequired()) {
                return
            }
            mainMethodCode.run()
        }
    }
}