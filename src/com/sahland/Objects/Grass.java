package com.sahland.Objects;

import com.sahland.DrawUtils;
import com.sahland.Position;

import java.awt.*;

public class Grass {
    private Position position;
    private Color color;

    public Grass(Position position, Color color) {
        this.position = position;
        this.color = color;
    }

    public void draw(Graphics2D g2d){
        DrawUtils.drawGrass(g2d, position, color);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
