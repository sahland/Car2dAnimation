package com.sahland;

public class Position {
    private int x;
    private int y;
    private int height;
    private int length;

    public Position(int x, int y, int height, int length){
        this.x = x;
        this.y = y;
        this.height = height;
        this.length = length;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
