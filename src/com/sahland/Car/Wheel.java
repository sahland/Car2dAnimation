package com.sahland.Car;


import java.awt.*;

public class Wheel {


    private int x, y;
    private int angle;
    private final int fanWidth = 60, fanHeight = 60;

    private int centerX, centerY;
    public Wheel(int w, int h, int angle) {


        this.centerX = w / 2;
        this.centerY = h / 2;

        this.x = centerX - fanWidth / 2 - fanHeight / 50;
        this.y = centerY - fanHeight / 2 + fanHeight / 6;

        this.angle = angle;
    }
    public void draw(Graphics2D g) {


        g.setColor(Color.black);
        g.fillOval(centerX - fanWidth / 2 - fanHeight / 7 - fanHeight / 200, centerY - fanHeight / 3 - fanHeight / 10, 75, 75);

       g.setColor(Color.lightGray);
       g.fillOval(centerX - fanWidth / 2 - fanHeight / 38, centerY - fanHeight / 4 - fanHeight / 12, 62, 62);

        g.setColor(Color.darkGray);
        g.fillOval(centerX - fanWidth / 3 - fanHeight / 7, centerY - fanHeight / 4 - fanHeight / 40, 55, 55);

        g.setColor(Color.lightGray);
        g.fillArc(x, y, fanWidth, fanHeight, angle, 30);
        g.fillArc(x, y, fanWidth, fanHeight, angle + 60, 30);
        g.fillArc(x, y, fanWidth, fanHeight, angle + 120, 30);
        g.fillArc(x, y, fanWidth, fanHeight, angle + 180, 30);
        g.fillArc(x, y, fanWidth, fanHeight, angle + 240, 30);
        g.fillArc(x, y, fanWidth, fanHeight, angle + 300, 30);



    }
    public void setAngle(int angle) {
        this.angle = angle;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }
    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getCenterX() {
        return centerX;
    }
    public int getCenterY() {
        return centerY;
    }
    public int getAngle() {
        return this.angle;
    }


}
