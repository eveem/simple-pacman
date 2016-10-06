package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class World {
	private Pacman pacman;
    private PacmanGame pacmanGame;
 
    World(PacmanGame pacmanGame) {
        this.pacmanGame = pacmanGame;
        pacman = new Pacman(100,100);
    }
 
    Pacman getPacman() {
        return pacman;
    }
    
    public void update(float delta) {
		if(Gdx.input.isKeyPressed(Keys.UP)) {
            pacman.move(Pacman.DIRECTION_UP);
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
        	pacman.move(Pacman.DIRECTION_RIGHT);
        }
        if(Gdx.input.isKeyPressed(Keys.DOWN)) {
        	pacman.move(Pacman.DIRECTION_DOWN);
        }
        if(Gdx.input.isKeyPressed(Keys.LEFT)) {
        	pacman.move(Pacman.DIRECTION_LEFT);
        }  
    }
}