package com.mygdx.game;

public class World {
	private Pacman pacman;
	private Maze maze;
	private int score;
    // private PacmanGame pacmanGame;
 
    World(PacmanGame pacmanGame) {
    	maze = new Maze();
        pacman = new Pacman(60, 60, this);
        score = 0;
        // this.pacmanGame = pacmanGame;
    }
 
    Pacman getPacman() {
        return pacman;
    }
    
    Maze getMaze() {
        return maze;
    }
    
    public void update(float delta) {
    	pacman.update();
    }
    
    public int getScore() {
        return score;
    }
    
    public void increaseScore() {
        score += 1;
    }
}
