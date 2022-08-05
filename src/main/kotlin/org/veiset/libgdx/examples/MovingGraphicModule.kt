package org.veiset.libgdx.examples

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import ktx.graphics.rect
import ktx.graphics.use
import org.veiset.libgdx.AppModule
import org.veiset.libgdx.AppRunner
import org.veiset.libgdx.config
import org.veiset.libgdx.globals
import org.veiset.libgdx.utils.TxSize
import org.veiset.libgdx.utils.getGraphic
import org.veiset.libgdx.utils.x
import kotlin.math.cos
import kotlin.math.sin

fun main() {
    LwjglApplication(AppRunner { MovingGraphicModule() }, config)
}
class MovingGraphicModule: AppModule {
    private val spriteBatch = globals.spriteBatch
    private val shapeRenderer = globals.shapeRenderer
    private val tree = getGraphic("graphic/mediumtree.png", TxSize.Grid(0, 0, TxSize.s128))

    override fun update(delta: Float) {
    }

    override fun draw(delta: Float) {
        val xposition = sin(globals.elapsedTime)
        val yposition = cos(globals.elapsedTime)

        spriteBatch.use {
            it.draw(tree, 800f - xposition*50f, 300f + yposition*30f, 300f, 300f)
        }
        shapeRenderer.use(ShapeRenderer.ShapeType.Filled) {
            it.color = Color.RED
            it.rect(500f + xposition*100f x 500f, 20f x 20f)
        }

    }
}