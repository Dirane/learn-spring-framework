package com.in28miutes.learnspringframework;

public class AppGamingBasicJava {
    public static void main(String[] ars)
    {
    var game = new MarioGame();
//    var game = new SuperContraGame();
    var gameRunner = new GameRunner(game);
    gameRunner.run();
    }
}
