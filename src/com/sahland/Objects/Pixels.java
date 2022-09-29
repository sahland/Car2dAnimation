package com.sahland.Objects;

import com.sahland.DrawUtils;
import com.sahland.Position;

import java.awt.*;

public class Pixels {
    Position position;
    private Color c1;
    private Color c2;

    public Pixels(Position position, Color c1, Color c2) {
        this.position = position;
        this.c1 = c1;
        this.c2 = c2;
    }

    public void drawPixels1(Graphics2D g2r){
        DrawUtils.drawPixels1(g2r, position, c1);
    }
    public void drawPixels2(Graphics2D g2r){
        DrawUtils.drawPixels1(g2r, position, c2);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Color getC1() {
        return c1;
    }

    public void setC1(Color c1) {
        this.c1 = c1;
    }

    public Color getC2() {
        return c2;
    }

    public void setC2(Color c2) {
        this.c2 = c2;
    }
}
