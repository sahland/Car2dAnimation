package com.sahland;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame{
    private DrawPanel dp;

    public MainWindow() throws HeadlessException {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GraphicsDevice graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        DisplayMode displayMode = graphicsDevice.getDisplayMode();
        int width = displayMode.getWidth();
        int height = displayMode.getHeight();
        setSize(width, height);
        dp = new DrawPanel();
        this.add(dp);

    }
}
