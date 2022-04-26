package org.veiset.libgdx

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration

object EngineConfig {
    const val SCALE = 120f // game scale: 16f,9f, draw scale: 1920f, 1080f

    const val VIEWPORT_WIDTH = 1920f
    const val VIEWPORT_HEIGHT = 1080f
    const val gameWidth = VIEWPORT_WIDTH / SCALE
    const val gameHeight = VIEWPORT_HEIGHT / SCALE

    var width = 1920
    var height = 1080
    var gutterHeight: Int = 0
    var gutterWidth: Int = 0
}

val config = LwjglApplicationConfiguration().apply {
    title = "kotlin libgdx intro"
    width = EngineConfig.width
    height = EngineConfig.height
    foregroundFPS = 60
    vSyncEnabled = false
    samples = 0
    audioDeviceBufferSize = 1024
    audioDeviceSimultaneousSources = 64
}

fun main(vararg args: String) {
    LwjglApplication(AppRunner { SimpleTestModule() }, config)
}

class SimpleTestModule : AppModule {

    override fun update(delta: Float) {
    }

    override fun draw(delta: Float) {
    }
}

