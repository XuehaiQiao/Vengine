package com.myEngine.core;

import com.myEngine.Launcher;
import jade.Window;
import org.lwjgl.opengl.GL11;

public class RenderManager {
    private final WindowManager window;

    public RenderManager() {
        window = Launcher.getWindow();
    }

    public void init() throws Exception {

    }

    private void render() {

    }

    public void clear() {
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
    }

    public void cleanup() {

    }
}
