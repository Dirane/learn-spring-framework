package com.in28miutes.learnspringframework;

public class AppGamingBasicJava {
    public static void main(String[] args)
    {
//    var game = new MarioGame();
//    var game = new SuperContraGame();
    var game = new PacManGame();
    var gameRunner = new GameRunner(game);
    gameRunner.run();
    }
}
