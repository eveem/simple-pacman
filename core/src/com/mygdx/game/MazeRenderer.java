package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MazeRenderer {

	private Texture wallImg, dotImg;
	private Maze maze;
    private SpriteBatch batch;
 
    public MazeRenderer(SpriteBatch batch, Maze maze) {
        this.maze = maze;
        this.batch = batch;
        wallImg = new Texture("wall.png");
        dotImg = new Texture("dot.png");
    }
 
    public void render() {
    }
	
}
