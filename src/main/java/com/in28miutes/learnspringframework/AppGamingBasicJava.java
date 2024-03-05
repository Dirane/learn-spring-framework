package com.in28miutes.learnspringframework;
import com.in28miutes.learnspringframework.GameRunner;
import com.in28miutes.learnspringframework.MarioGame;
import com.in28miutes.learnspringframework.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] ars)
    {
//    var marioGame = new MarioGame();
    var superContraGame = new SuperContraGame();
    var gameRunner = new GameRunner(superContraGame);
    gameRunner.run();
    }
}
