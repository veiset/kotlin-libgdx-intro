package org.veiset.libgdx.debug

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import ktx.graphics.use
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
            font.draw(spriteBatch, "${x.toInt()}, ${y.toInt()}", x + 20f, y)
            font.draw(spriteBatch, "(${x.round(2)}, ${y.round(2)})", x  + 20f, y - 22f)
        }
        shapeRenderer.use(ShapeRenderer.ShapeType.Filled) {
            shapeRenderer.color = Color.RED
            shapeRenderer.circle(x, y , 3f)
        }
    }
}