package org.veiset.libgdx.debug

import ktx.graphics.use
import org.veiset.libgdx.EngineConfig
import org.veiset.libgdx.globals
import org.veiset.libgdx.utils.fontWithSize
import org.veiset.libgdx.utils.round

class FPSCounter {
    private val font = fontWithSize(14)
    private val spriteBatch = globals.spriteBatch

    private var frameTimes = Array<Long>(10) { 0 }

    var fpsCounter = 0f
    var frames = 0
    var fps = 0
    val fpsSampleSize = 0.1f
    var frame = 0

    fun update(delta: Float, time: Long) {
        fpsCounter += delta
        frames += 1
        if (fpsCounter >= fpsSampleSize) {
            fps = (frames / fpsSampleSize).toInt()
            frames = 0
            fpsCounter -= fpsSampleSize
        }
        frame += 1
        frame %= 10
        frameTimes[frame] = time
    }

    fun draw() {
        val avgFrame = frameTimes.average()
        val frameTime = (avgFrame.toFloat() / 1_000_000)
        val dt = "%.3f".format(frameTime.round(3))
        spriteBatch.use {
            font.draw(
                it,
                "$dt dt - $fps fps",
                0.03f * EngineConfig.SCALE,
                (EngineConfig.gameHeight - 0.03f) * EngineConfig.SCALE
            )
        }
    }
}