package org.veiset.libgdx.examples

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.graphics.Color
import ktx.graphics.use
import org.veiset.libgdx.AppModule
import org.veiset.libgdx.AppRunner
import org.veiset.libgdx.config
import org.veiset.libgdx.globals
import org.veiset.libgdx.utils.fontWithSize

fun main() {
    Lwjgl3Application(AppRunner { InputAndTextModule() }, config)
}

class InputAndTextModule: AppModule {
    private val spriteBatch = globals.spriteBatch

    private val largeFont = fontWithSize(60)
    private val smallFont = fontWithSize(20)

    private val colors = listOf(Color.BLUE, Color.YELLOW, Color.ORANGE, Color.CORAL)
    private var displayHiddenMessage = false
    private var color = Color.WHITE

    private val speed = 60f
    private var xoffset = 0f

    override fun update(delta: Float) {
        if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
            displayHiddenMessage = !displayHiddenMessage
        }

        color = if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
            colors.random()
        } else {
            Color.WHITE
        }

        if (Gdx.input.isKeyPressed(Input.Keys.D) || Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            xoffset += delta * speed
        }
        if (Gdx.input.isKeyPressed(Input.Keys.A) || Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
           xoffset -= delta * speed
        }

    }

    override fun draw(delta: Float) {
        spriteBatch.use {
            val message = if (displayHiddenMessage) "Super secret hello world" else "Hello world"
            largeFont.color = color
            largeFont.draw(it, message, 500f + xoffset, 500f)
            smallFont.draw(it, "Dont press <space>!", 200f, 300f)
        }
    }
}