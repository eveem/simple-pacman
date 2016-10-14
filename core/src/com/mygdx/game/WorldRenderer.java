package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {

	// private PacmanGame pacmanGame;
	private Texture pacmanImg;
	private World world;
	private SpriteBatch batch;
	private MazeRenderer mazeRenderer; 
	public static final int BLOCK_SIZE = 40;
	private BitmapFont font;
	
	public WorldRenderer(PacmanGame pacmanGame, World world) {
        // this.pacmanGame = pacmanGame;
        batch = pacmanGame.batch;
 
        this.world = world;
 
        mazeRenderer = new MazeRenderer(pacmanGame.batch, world.getMaze());
        pacmanImg = new Texture("pacman.png");
        font = new BitmapFont();
    }
	
	public void render(float delta) {
		mazeRenderer.render();
		batch.begin();
        Pacman pacman = world.getPacman();
        Vector2 pos = pacman.getPosition();
        batch.draw(pacmanImg, pos.x - BLOCK_SIZE/2, PacmanGame.HEIGHT - pos.y - BLOCK_SIZE/2);
        font.draw(batch, "" + world.getScore(), 700, 60);
        batch.end();
    }
	
}
