package com.mygdx.game.desktop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Launcher
{
    public static void main (String[] args)
    {
        // To start a LibGDX program, this method:
        // (1) creates an instance of the game
        // (2) creates a new application with game instance and window settings as argument
        LwjglApplicationConfiguration configuration = new LwjglApplicationConfiguration();
        configuration.title = "Starfish Collector";
        configuration.width = 800;
        configuration.height = 600;
        configuration.forceExit = false;
        Game myGame = new StarfishGame();
        LwjglApplication launcher = new LwjglApplication(myGame, configuration);
    }
}