package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {

	private PacmanGame pacmanGame;
	private Texture pacmanImg;
	private World world;
	private SpriteBatch batch;
	
	public WorldRenderer(PacmanGame pacmanGame, World world) {
        this.pacmanGame = pacmanGame;
        batch = pacmanGame.batch;
 
        this.world = world;
 
        pacmanImg = new Texture("pacman.png");
    }
	
	public void render(float delta) {
        batch.begin();
        Pacman pacman = world.getPacman();
        Vector2 pos = pacman.getPosition();
        batch.draw(pacmanImg, pos.x, pos.y);
        batch.end();
    }
	
}
