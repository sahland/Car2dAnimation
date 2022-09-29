package com.sahland;

import com.sahland.Car.Car;
import com.sahland.Car.Wheel;
import com.sahland.Objects.*;

import javax.security.auth.kerberos.KeyTab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.TimerTask;

public class DrawPanel extends JPanel {

    private static final Color GRASS_COLOR1 = new Color(0,254,128);
    private static final Color GRASS_COLOR2 = new Color(90,255,1);
    private static final Color SKY_COLOR = new Color(255,228,196);
    private static final Color MOUNTAIN_COLOR1 = new Color(139,137,137);
    private static final Color MOUNTAIN_COLOR2 = new Color(54,54,54);
    private static final Color MOUNTAIN_COLOR3 = new Color(232,232,232);
    private static final Color TREE_LEAVE_COLOR1 = new Color(255,0,0);
    private static final Color TREE_LEAVE_COLOR2 = new Color(255,52,179);
    private static final Color TREE_STABLE_COLOR = new Color(70, 59, 41);
    private static final Color CLOUD_COLOR1 = new Color(255, 250, 250);
    private static final Color CLOUD_COLOR2 = new Color(255, 240, 230);
    private static final Color BIRD_COLOR = Color.BLACK;
    private static final Color STONE_COLOR = Color.GRAY;
    private static final Color SUN_COLOR1 = new Color(255, 127,0);
    private static final Color SUN_COLOR2 = new Color(255, 69,0);
    private static final Color CAR_COLOR1 = new Color(147, 112,219);
    private static final Color CAR_COLOR2 = new Color(135, 206,235);
    private static final Color WHEEL_COLOR1 = new Color(0, 0,0);
    private static final Color WHEEL_COLOR2 = new Color(205, 201,201);
    private static final Color ROAD_COLOR = new Color(105, 105,105);

    public static Audio a_music;
    public static Audio a_engine1;
    public static Audio a_engine2;
    public static Audio a_engine3;
    public static Audio a_engine4;
    public static Audio a_engine5;
    public static Audio a_engine6;
    public static Audio a_engine7;
    public static Audio a_engine8;

    private static Random rnd = new Random();
    private static Timer timer;

    private static Tree tree;
    private static Pixels pixels;
    private static Car car;
    private static Sun sun;
    private static Mountain mountain;
    private static Grass grass;

    private static GroundStone groundStone;
    private static Cloud cloud;
    private static double angle = 0;
    private static Directions directions = Directions.NONE;
    private static boolean flag = true;

    private final ArrayList<Wheel> w;


    private void rep(){
        this.repaint();
    }

    public DrawPanel() {
        a_music = new Audio("audio/a2.wav", 0.7);
        a_music.sound();
        a_music.setVolume();

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if(e.getKeyChar()=='a'){
                    directions = Directions.LEFT;
                    angle -= 6;
                    if(angle < 0){
                        angle += 360;
                    }

                }

                if(e.getKeyChar()=='d'){
                    directions = Directions.RIGHT;
                    angle -= 6;
                    if(angle < 0){
                        angle += 360;
                    }
                } else {
                    a_engine1 = new Audio("audio/engine1.wav", 0.7);
                    a_engine1.sound();
                    a_engine1.setVolume();
                }
            }
        });



        timer = new Timer(70, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (timer.isRunning()){
                    timer.stop();
                }
                else{
                    timer.start();
                }
            }
        });


        w = new ArrayList<>(Arrays.asList(
                new Wheel(1630,  1200, 0),
                new Wheel(2200,  1200, 0)));
    }


    @Override
    protected void paintComponent(Graphics gr) {
        Graphics2D g2r = (Graphics2D) gr;

        ((Graphics2D) gr).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        ((Graphics2D) gr).setStroke(new BasicStroke(1));

        int rgb = 10;
        int currHeight = 0;
        for (int i = 0; i < 15; i++) {
            gr.setColor(new Color(96 + rgb, 163, 192));
            gr.fillRect(0, currHeight, width, currHeight + height / 18);
            currHeight = currHeight + height / 18;
            rgb+=10;
        }


        g2r.setColor(SKY_COLOR);
        g2r.fillRect(0, 0, width, height/2 - height/16);

        Position parameters = new Position(width / 2 - width / 10, height / 6, width * 2 / 10, (int)(height * 3.5 / 10));
        sun = new Sun(parameters, SUN_COLOR1, SUN_COLOR2);
        sun.draw(g2r);


       for (int i = 0; i < 23; i++) {
            int l1 = rnd.nextInt(getWidth() / 5) + width / 15;
            int h1 = rnd.nextInt(getHeight() / 2) + height / 5;
            Position position1 = new Position(rnd.nextInt(getWidth() - l1 ),height / 2 + height / 16,l1, h1);
            mountain = new Mountain(position1, MOUNTAIN_COLOR1, MOUNTAIN_COLOR2, MOUNTAIN_COLOR3);
            mountain.draw((Graphics2D) gr);
        mountain = new Mountain(position1, MOUNTAIN_COLOR1, MOUNTAIN_COLOR2, MOUNTAIN_COLOR3);
        mountain.draw((Graphics2D) gr);
        mountain = new Mountain(position1, MOUNTAIN_COLOR1, MOUNTAIN_COLOR2, MOUNTAIN_COLOR3);
        mountain.draw((Graphics2D) gr);
       }

        for (int i = 0; i < 5; i++) {
            int l = rnd.nextInt(getWidth() / 10) + width / 15;
            int h = rnd.nextInt(getHeight() / 100) + height / 8;
            Position p = new Position(rnd.nextInt(getWidth() - l / 2),height / 2 + height / 16,l, h);
            tree = new Tree(p, TREE_LEAVE_COLOR1,TREE_STABLE_COLOR, TREE_LEAVE_COLOR2);
            tree.drawTypeOne((Graphics2D) gr);
        }


        for (int i = 0; i < 4; i++) {
            int l = rnd.nextInt(getWidth() / 15) + width / 30;
            int h = rnd.nextInt(getHeight() / 15) + height / 27;
            Position position = new Position(rnd.nextInt(getWidth() - l / 2),  height / 8 - rnd.nextInt(height / 40),width / 25, height / 10);
            cloud = new Cloud(position,CLOUD_COLOR1);
            cloud.draw((Graphics2D) gr);
        }

        for (int i = 0; i < 6; i++) {
            int l = rnd.nextInt(getWidth() / 10) + width / 15;
            int h = rnd.nextInt(getHeight() / 10) + height / 13;
            Position position = new Position(rnd.nextInt(getWidth() - l),  height / 4 - rnd.nextInt(height / 300),width / 20, height / 8);
            cloud = new Cloud(position,CLOUD_COLOR2);
            cloud.draw(g2r);
        }



        g2r.setColor(GRASS_COLOR1);
        g2r.fillRect(0,height / 2 - height / 16, width, height / 2 + height/16);

        g2r.setColor(ROAD_COLOR);
        g2r.fillRect(0,height / 2 + height / 16, width, height / 6);

        for(int i = 0; i < 200; i++){
            int l = rnd.nextInt(getWidth() / 10) + width / 15;
            int h = rnd.nextInt(getHeight() / 100) + height /8;
            int flag = rnd.nextInt(2);
            Position p = new Position(rnd.nextInt(getWidth() - l / 2),height / 2 + height / 16,l, h);
            pixels = new Pixels(p, MOUNTAIN_COLOR1, MOUNTAIN_COLOR2);
            if(flag == 1){
                pixels.drawPixels1(g2r);
            }
            else{
                pixels.drawPixels2(g2r);
            }
        }

        for (int i = 0; i < 150; i++) {
            int l = rnd.nextInt(getWidth() / 25) + width / 35;
            Position p = new Position(rnd.nextInt(getWidth() - l / 2), height / 2 + height / 16 - rnd.nextInt(height / 8) ,width / 80, height / 50);
            grass = new Grass(p,GRASS_COLOR2);
            grass.draw((Graphics2D) gr);

        }

        car = new Car(CAR_COLOR1, CAR_COLOR2, getWidth() / 2, getHeight() / 2 + getHeight() / 20);
        car.draw((Graphics2D) gr);

        for (Wheel h: w) {
            h.draw(g2r);
            h.setAngle((h.getAngle() + 30) % 360);
        }



        for (int i = 0; i < 150; i++) {
            int l = rnd.nextInt(getWidth() / 25) + width / 35;
            Position p = new Position(rnd.nextInt(getWidth() - l / 2), height / 2 + height / 2 - height / 14 - rnd.nextInt(height / 5) ,width / 80, height / 50);
            grass = new Grass(p,GRASS_COLOR2);
            grass.draw((Graphics2D) gr);

        }

        for (int i = 0; i < 150; i++) {
            int l = rnd.nextInt(getWidth() / 2) + width / 30;
            Position p = new Position(rnd.nextInt(getWidth() - l / 2), height / 2 + height / 2 - height / 14 - rnd.nextInt(height / 5) ,width / 80, height / 50);
            grass = new Grass(p,GRASS_COLOR2);
            grass.draw((Graphics2D) gr);

        }

    }

}
