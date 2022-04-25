package org.veiset.libgdx.module

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import org.veiset.libgdx.AppModule
import org.veiset.libgdx.AppRunner
import org.veiset.libgdx.config

fun main() {
    LwjglApplication(AppRunner { MyModule() }, config)
}

class MyModule : AppModule {
    override fun update(delta: Float) {
    }

    override fun draw(delta: Float) {
    }
}
