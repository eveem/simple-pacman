package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;

public class GameScreen extends ScreenAdapter {
	
	private WorldRenderer worldRenderer;
	private World world;
	
	public GameScreen(PacmanGame pacmanGame) {
        world = new World(pacmanGame);
        worldRenderer = new WorldRenderer(pacmanGame, world);
	}
	
	@Override
    public void render(float delta) {
		updatePacmanDirection();
		world.update(delta);
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
        worldRenderer.render(delta);
    }

	public void updatePacmanDirection() {
		Pacman pacman = world.getPacman();
		if(Gdx.input.isKeyPressed(Keys.UP)) {
            pacman.setNextDirection(Pacman.DIRECTION_UP);
        }
		else if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
        	pacman.setNextDirection(Pacman.DIRECTION_RIGHT);
        }
		else if(Gdx.input.isKeyPressed(Keys.DOWN)) {
        	pacman.setNextDirection(Pacman.DIRECTION_DOWN);
        }
		else if(Gdx.input.isKeyPressed(Keys.LEFT)) {
        	pacman.setNextDirection(Pacman.DIRECTION_LEFT);
        }
		else {
			pacman.setNextDirection(Pacman.DIRECTION_STILL);
		}
	}
}
