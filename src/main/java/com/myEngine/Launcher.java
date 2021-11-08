package com.myEngine;

import com.myEngine.core.EngineManager;
import com.myEngine.core.WindowManager;
import com.myEngine.core.utils.Consts;
import com.myEngine.test.TestGame;
import org.lwjgl.Version;

public class Launcher {

    private static WindowManager window;
    //private static EngineManager engine;
    private static TestGame game;

    public static void main(String[] args) {
        System.out.println(Version.getVersion());

        window = new WindowManager(Consts.TITLE, 1600, 900, false);
        game = new TestGame();

        EngineManager engine = new EngineManager();

        try {
            engine.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WindowManager getWindow() {
        return window;
    }

    public static TestGame getGame() {
        return game;
    }
}
