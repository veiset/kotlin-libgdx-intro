# kotlin-libgdx-intro
Introduction to libgdx in Kotlin.
The goal of this project is to make it easy to start running small snippets of libgdx code.

# Installation
Clone and import the project in intellij (as a gradle project)

# What should I do?

Start by running the example under module/example and explore the example code.

## Create some cool graphics using Bezier
Experiment with how Bezier-curves work. Check out `BezierModule.kt` for an example. 
Modify the code and make something cool using Bezier. 
Try making the curve change based on the mouse pointer. 
You can use `scaledPointer()` to get the coordinates of the mouse.

## Explore the noise
Perlin noise is cool. 
Modify the values in `PerlinModule.kt` to see what happens. 
Can you think of anything cool you can apply this noise to?

## Make a maze game

Create a simple maze game where the objective is to get through a maze with the mouse pointer. 
Use `scaledPointer()` to get the mouse coordinates and `pointerWithinSquare(v1, v2)` to check if the mouse pointer is inside a box. 

## Can you dodge?
Improve upon the maze by adding moving objects to avoid

## Implement boids



