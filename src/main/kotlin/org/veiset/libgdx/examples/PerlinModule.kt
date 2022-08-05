package org.veiset.libgdx.examples

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import ktx.graphics.color
import ktx.graphics.use
import org.veiset.libgdx.AppModule
import org.veiset.libgdx.AppRunner
import org.veiset.libgdx.config
import org.veiset.libgdx.globals
import org.veiset.libgdx.utils.math.Perlin
import kotlin.random.Random

fun main() {
    LwjglApplication(AppRunner { PerlinModule() }, config)
}

class PerlinModule: AppModule {
    private val shapeRenderer = globals.shapeRenderer
    private val randomness = 5f
    private val xSize = 100
    private val ySize = 150
    private val size = 10f

    private var seed = 500 * Random.nextFloat()

    override fun update(delta: Float) {
        seed += 0.1f * delta
    }

    override fun draw(delta: Float) {
        Gdx.gl.glEnable(GL20.GL_BLEND)
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA)
        shapeRenderer.use(ShapeRenderer.ShapeType.Filled) {
            (1..xSize).map { y ->
                (1..ySize).map { x ->
                    val noise = Perlin.noiseScaled(
                        x = seed + (x / xSize.toDouble()) * randomness,
                        y = seed + (y / ySize.toDouble()) * randomness,
                        z = 0.5
                    ).toFloat()
                    it.color = color(1f, 1f, 1f, noise)
                    it.rect(size * x, size * y, size, size)
                }
            }
        }
        Gdx.gl.glDisable(GL20.GL_BLEND)
    }
}