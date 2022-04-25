package org.veiset.libgdx.debug

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import ktx.graphics.use
import org.veiset.libgdx.EngineConfig.SCALE
import org.veiset.libgdx.globals
import org.veiset.libgdx.utils.component1
import org.veiset.libgdx.utils.component2
import org.veiset.libgdx.utils.fontWithSize
import org.veiset.libgdx.utils.round
import org.veiset.libgdx.utils.scaledPointer


class VisualMouse {
    private val font = fontWithSize(18)
    private val spriteBatch = globals.spriteBatch
    private val shapeRenderer = globals.shapeRenderer

    fun draw() {
        val (x, y) = scaledPointer()
        spriteBatch.use {
            font.draw(spriteBatch, "${(x * SCALE).toInt()}, ${(y * SCALE).toInt()}", (x * SCALE) + 20f, (y * SCALE))
            font.draw(spriteBatch, "(${x.round(2)}, ${y.round(2)})", (x * SCALE) + 20f, (y * SCALE) - 22f)
        }
        shapeRenderer.use(ShapeRenderer.ShapeType.Filled) {
            shapeRenderer.color = Color.RED
            shapeRenderer.circle(x * SCALE, y * SCALE, 0.04f * SCALE)
        }
    }
}