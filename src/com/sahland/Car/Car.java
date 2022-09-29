package com.sahland.Car;

import com.sahland.DrawUtils;
import com.sahland.Position;

import java.awt.*;

public class Car {
    Color c1;
    Color c2;
    int w;
    int h;


    public Car(Color c1, Color c2, int w, int h) {
        this.c1 = c1;
        this.c2 = c2;
        this.w = w;
        this.h = h;

    }

    public void draw(Graphics2D gr) {
        DrawUtils.drawCar(gr, c1, c2, w, h);
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

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}

