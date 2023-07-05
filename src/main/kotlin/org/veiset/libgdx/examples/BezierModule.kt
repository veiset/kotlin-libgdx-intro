package org.veiset.libgdx.examples

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import ktx.graphics.circle
import ktx.graphics.use
import org.veiset.libgdx.*
import org.veiset.libgdx.utils.math.Bezier
import org.veiset.libgdx.utils.x

fun main() {
    launchApp { BezierModule() }
}

class BezierModule : AppModule {
    private val shapeRenderer = globals.shapeRenderer

    private val bezier = Bezier(
        200f x 200f,
        550f x 200f,
        320f x 600f,
        700f x 500f,
    )
    var position = 0.0f

    override fun update(delta: Float) {
        position = (position + (delta * 0.2f)) % 1f
    }

    override fun draw(delta: Float) {
        drawBezierOutline(bezier)
        shapeRenderer.use(ShapeRenderer.ShapeType.Filled) {
            it.color = Color.WHITE
            it.circle(bezier.point(position), 6f)
        }
    }

    private fun drawBezierOutline(bezier: Bezier) {
        val debugPoints = bezier.debugPoints()
        val debugLine = bezier.debugline()
        shapeRenderer.use(ShapeRenderer.ShapeType.Filled) {
            val colors = listOf(Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW)
            debugPoints.mapIndexed { i, p ->
                it.color = colors[i]
                it.circle(p, 5f)
            }
        }
        shapeRenderer.use(ShapeRenderer.ShapeType.Line) {
            it.color = Color.LIGHT_GRAY
            debugLine.zipWithNext { p0, p1 ->
                it.line(p0, p1)
            }
        }
    }
}