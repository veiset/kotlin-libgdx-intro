package org.veiset.libgdx.module.gettingStarted

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.utils.TimeUtils
import ktx.graphics.rect
import ktx.graphics.use
import org.veiset.libgdx.*
import org.veiset.libgdx.utils.Rectangle
import org.veiset.libgdx.utils.x

fun main() {
    LwjglApplication(AppRunner { DodgeFallingSqueres() }, config)
}

class DodgeFallingSqueres: AppModule {
    private val shapeRenderer = globals.shapeRenderer
    private var lastBlockSpawnTime = TimeUtils.millis()
    private var player = Rectangle(
        position = EngineConfig.width / 2 x 200,
        size = 20 x 20
    )
    private var blocksToDodge: List<Rectangle> = emptyList()

    /**
     * In this method we will implement player movement.
     * You can check for keypresses using `Gdx.input.isKeyPressed`
     * for instance you can check for UP-arrow: `Gdx.input.isKeyPressed(Input.Keys.UP)`.
     *
     * @param delta The time since last update. This is used to make the movement-speed
     * not dependant of the update-rate.
     */
    private fun handlePlayerMovement(delta: Float) {

    }

    /**
     * Checks if the game should spawn new blocks. You can use the given timeSinceLastBlock
     * to determine wheter to spawn a new block or not.
     *
     * @param timeSinceLastBlock The time since the last block was spawned in milliseconds.
     * @return true if the game should spawn new blocks, false if not
     */
    private fun shouldSpawnNewBlocks(timeSinceLastBlock: Long): Boolean {
        return false
    }

    /**
     * Here we will implement logic for spawning new blocks that the player
     * has to dodge. The blocks should start at top of the screen at a random
     * X-coordinate. The the blocks should be added to the list `blocksToDodge`.
     */
    private fun spawnNewBlock() {

    }

    /**
     * Moves all the blocks in `blocksToDodge` list. This method should also remove
     * blocks that are out of bounds (below the screen) from the list to free up the
     * resources.
     *
     * @param delta The time since last update. This is used to make the movement-speed
     * not dependant of the update-rate.
     */
    private fun handleMoveBlocks(delta: Float) {

    }

    /**
     * Removes all the blocks that are out of bounds. Since the blocks start at the top
     * and fall downwards we can remove any blocks that are below the screen.
     */
    private fun removeBlocksOutOfBounds() {

    }

    /**
     * Checks if the player is colliding with any of the blocks in the `blocksToDodge`-list.
     * `Rectangle` has a utility method `isCollidingWith` that checks if 2 Rectangles are
     * overlapping.
     *
     * @return true if the player is colliding with any blocks, false if not.
     */
    private fun playerIsColliding(): Boolean {
        return false
    }

    /**
     * This function should draw the player in the current position on the screen.
     * Use the utility method `drawRectangle` to draw on the screen.
     */
    private fun drawPlayer() {

    }

    /**
     * This function should draw all the blocks the player has to dodge on the screen.
     * Use the utility method `drawRectangle` to draw on the screen.
     */
    private fun drawAllBlocksToDodge() {

    }

    /**
     * This is called when the player has lost the game. The initial implementation just
     * resets the game to the original state. Maybe you can come up with something more fun?
     * You could have a Score screen that displays how long you lasted etc.
     */
    private fun onGameLost() {
        player = Rectangle(
            position = EngineConfig.width / 2 x 200,
            size = 20 x 20
        )
        blocksToDodge = emptyList()
    }

    /**
     * This is the main-loop of the game. For the workshop you should not need
     * to change this, but rather implement the different methods called here.
     *
     * But if you want you can allways refactor and add as many new features
     * as you want.
     */
    override fun update(delta: Float) {
        handlePlayerMovement(delta)
        if (shouldSpawnNewBlocks(TimeUtils.timeSinceMillis(lastBlockSpawnTime))) {
            lastBlockSpawnTime = TimeUtils.millis()
            spawnNewBlock()
        }

        handleMoveBlocks(delta)
        removeBlocksOutOfBounds()

        if (playerIsColliding()) {
            onGameLost()
        }
    }

    override fun draw(delta: Float) {
        drawPlayer()
        drawAllBlocksToDodge()
    }

    /**
     * Draws a filled rectangle on the screen.
     *
     * @param rectangle The rectangle to draw
     * @param color The color of the rectangle
     */
    private fun drawRectangle(rectangle: Rectangle, color: Color) {
        shapeRenderer.use(ShapeRenderer.ShapeType.Filled) {
            it.color = color
            it.rect(rectangle.position, rectangle.size)
        }
    }
}