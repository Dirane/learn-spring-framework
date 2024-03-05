package com.in28miutes.learnspringframework;

public class GameRunner {
    SuperContraGame game;
    public GameRunner(SuperContraGame game){
        this.game = game;
    }
    public void run(){
        System.out.println("Running the game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
