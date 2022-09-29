package com.sahland.Objects;

import com.sahland.DrawUtils;
import com.sahland.Position;

import java.awt.*;

public class Sun {
    private Position position;
    private Color c1;
    private Color c2;

    public Sun(Position position, Color c1, Color c2){
        this.position = position;
        this.c1 = c1;
        this.c2 = c2;
    }

    public void draw(Graphics2D g2r){
        DrawUtils.drawSun(g2r,position,c1,c2);
    }
    public Position getPosition(){
        return position;
    }
    public Color getC1(){
        return c1;
    }
    public Color setC1(){
        return c1;
    }
    public Color getC2(){
        return c2;
    }
    public Color setC2(){
        return c2;
    }
}
