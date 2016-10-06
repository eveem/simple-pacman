package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
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
		world.update(delta);
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
        worldRenderer.render(delta);
    }

	
}
