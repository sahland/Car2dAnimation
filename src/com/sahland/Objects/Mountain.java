package com.sahland.Objects;

import com.sahland.DrawUtils;
import com.sahland.Position;

import java.awt.*;

public class Mountain {
    Position position;
    private Color c1;
    private Color c2;
    private Color c3;

    public Mountain(Position position, Color c1, Color c2, Color c3) {
        this.position = position;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public void draw(Graphics2D g2d){
        DrawUtils.drawMountain(g2d, position, c1, c2, c3);
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

    public Color getC3() {
        return c3;
    }

    public void setC3(Color c3) {
        this.c3 = c3;
    }
}
