package com.sahland;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

public class DrawUtils {

    public static void drawPixels1(Graphics2D gr, Position position, Color c1){
        gr.setColor(c1);
        gr.fillRect(position.getX(), position.getY() + position.getHeight() / 2, position.getHeight()/2 - position.getHeight() /3 - position.getHeight() /7, position.getHeight()/2 - position.getHeight() /3 - position.getHeight() /7);
        gr.fillRect(position.getX(), position.getY() + position.getHeight() / 5, position.getHeight()/2 - position.getHeight() /3 - position.getHeight() /7, position.getHeight()/2 - position.getHeight() /3 - position.getHeight() /7);
    }

    public static void drawTree(Graphics2D gr,Position position, Color c1, Color c2, Color c3){
        gr.setColor(c2);
        gr.fillRect(position.getX() + position.getLength() / 2 - position.getLength() / 24, position.getY() - position.getHeight(), position.getHeight() / 10, position.getHeight());

        gr.setColor(c3);
        gr.fillOval(position.getX() + position.getLength() / 3, position.getY() - position.getHeight() - position.getLength() / 2, position.getLength() / 2 + position.getLength() / 6, position.getLength() / 2 + position.getLength() / 6 );

        gr.setColor(c3);
        gr.fillOval(position.getX() + position.getLength() / 2, position.getY() - position.getHeight() - position.getHeight() / 10, position.getLength() / 3 + position.getLength() / 6, position.getLength() / 3 + position.getLength() / 6 );

        gr.setColor(c3);
        gr.fillOval(position.getX() + position.getLength() / 8, position.getY() - position.getHeight() - position.getHeight() / 10, position.getLength() / 3 + position.getLength() / 6, position.getLength() / 3 + position.getLength() / 6 );

    }

    public static void drawCar(Graphics2D gr, Color c1, Color c2, int w, int h){

        int[] xz1 = {196, 110, 102, 196};
        int[] yz1 = {-1, -1, 49, 49};
        for(int i = 0; i < xz1.length; i++){
            xz1[i] += w;
            yz1[i] += h;
        }

        Polygon polygonZX1 = new Polygon( xz1, yz1, xz1.length );
        gr.setColor(Color.darkGray);
        gr.fillPolygon( polygonZX1 );

        int[] xz2 = {-98, -184, -184, -98};
        int[] yz2 = {0, 0, 45, 45};
        for(int i = 0; i < xz2.length; i++){
            xz2[i] += w;
            yz2[i] += h;
        }

        Polygon polygonZX2 = new Polygon( xz2, yz2, xz2.length );
        gr.setColor(Color.darkGray);
        gr.fillPolygon( polygonZX2 );


        //основа
        int[] x1 = {247, 188, 189, 187, 181, 171, 157, 141, 126, 115, 109, 107, 107, -34, -100, -101, -107, -117, -130, -147, -163, -174, -180, -182, -179, -198, -238, -241, -246, -246, -244, -248, -247,
                -249, -249, -248, -243, -242, -240, -241, -235, -230, -227, -227, -231, -235, -236, -234, -221, -206, -205, -206, -212, -207, -203, -174, -141, -98, -93, -68, -33, 2, 33, 33, 44, 71,
                98, 109, 181, 218, 238, 241, 241, 239, 241, 247, 249, 245, 241, 243, 244, 247, 247};

        int[] y1 = {61, 60, 40, 27, 16, 7, 2, 2, 7, 17, 29, 45, 51, 50, 52, 32, 15, 5, 1, 1, 5, 16, 31, 47, 54, 56, 47, 42, 42, 34, 34, 27, 26, 21, 16, 5, 2, -14, -23,
                -25, -33, -34, -38, -47, -48, -53, -57, -58, -56, -54, -52, -50, -48, -40, -36, -36, -49, -65, -68, -71, -72, -71, -65, -63, -57, -42, -27, -29, -19, -11, -2, 0, 2, 3, 15, 17, 24, 25, 45, 47, 58, 59, 61};

        for(int i = 0; i < x1.length; i++){
            x1[i] += w;
            y1[i] += h;
        }
        Polygon polygon1 = new Polygon( x1, y1, 82 );
        gr.setColor(Color.gray);
        gr.fillPolygon( polygon1 );
        gr.setColor(Color.black);
        gr.drawPolyline(x1, y1, 82);

        //фары
        int[] x2 = {237, 219, 207, 204, 204, 208, 218, 228, 231, 237};
        int[] y2 = {12, 10, 10, 1, -1, -4, -3, -1, 0, 10};
        for(int i = 0; i < x2.length; i++){
            x2[i] += w;
            y2[i] += h;
        }

        Polygon polygon2 = new Polygon( x2, y2, 10 );
        gr.setColor(Color.yellow);
        gr.fillPolygon( polygon2 );
        gr.setColor(Color.black);
        gr.drawPolyline(x2, y2, 10);


        //стёкло 1
        int[] x3 = {33, 25, 83, 98, 71, 44};
        int[] y3 = {-63, -61, -24, -27, -42, -57};
        for(int i = 0; i < x3.length; i++){
            x3[i] += w;
            y3[i] += h;
        }

        Polygon polygon3 = new Polygon(x3, y3, 6);
        gr.setColor(Color.CYAN);
        gr.fillPolygon(polygon3);

        //пластик 1
        int[] xb1 = {75, 63, 18, 5, -32, -68, -83, -109, -110, -107, -58, 6, 62};
        int[] yb1 = {-23, -31, -60, -64, -66, -64, -56, -37, -33, -31, -26, -22, -22};
        for(int i = 0; i < xb1.length; i++){
            xb1[i] += w;
            yb1[i] += h;
        }

        Polygon polygonBlack1 = new Polygon(xb1, yb1, xb1.length);
        gr.setColor(Color.DARK_GRAY);
        gr.fillPolygon(polygonBlack1);

        //пластик 2
        int[] xb2 = {-182, -235, -238, -240, -240, -239, -239, -241, -238, -198, -179};
        int[] yb2 = {47, 37, 37, 37, 40, 41, 43, 42, 47, 56, 54};
        for(int i = 0; i < xb2.length; i++){
            xb2[i] += w;
            yb2[i] += h;
        }

        Polygon polygonBlack2 = new Polygon(xb2, yb2, xb2.length);
        gr.setColor(Color.DARK_GRAY);
        gr.fillPolygon(polygonBlack2);

        //пластик 3
        int[] xb3 = {241, 240, 221, 193, 192, 191, 223, 247, 247, 244, 243};
        int[] yb3 = {45, 46, 46, 46, 46, 60, 61, 61, 59, 58, 47};
        for(int i = 0; i < xb3.length; i++){
            xb3[i] += w;
            yb3[i] += h;
        }

        Polygon polygonBlack3 = new Polygon(xb3, yb3, xb3.length);
        gr.setColor(Color.DARK_GRAY);
        gr.fillPolygon(polygonBlack3);

        //выхлоп
        int[] xw1 = {-241, -244, -246, -246, -241, -239, -239, -240, -240};
        int[] yw1 = {34, 34, 34, 42, 43, 43, 41, 40, 37};
        for(int i = 0; i < xw1.length; i++){
            xw1[i] += w;
            yw1[i] += h;
        }

        Polygon polygonGWhite = new Polygon(xw1, yw1, xw1.length);
        gr.setColor(Color.LIGHT_GRAY);
        gr.fillPolygon(polygonGWhite);

        //Задняя фара 1
        int[] xr1 = {-231, -231, -233, -235, -235, -235, -235, -233, -232, -231, -230};
        int[] yr1 = {-28, -28, -25, -19, -14, -10, -8, -10, -16, -19, -24};
        for(int i = 0; i < xr1.length; i++){
            xr1[i] += w;
            yr1[i] += h;
        }

        Polygon polygonRed1 = new Polygon(xr1, yr1, xr1.length);
        gr.setColor(Color.RED);
        gr.fillPolygon(polygonRed1);

        //Задняя фара 2
        int[] xr2 = {-236, -237, -238, -239, -238, -236, -235, -235};
        int[] yr2 = {-23, -20, -17, -12, -8, -12, -17, -20};
        for(int i = 0; i < xr2.length; i++){
            xr2[i] += w;
            yr2[i] += h;
        }

        Polygon polygonRed2 = new Polygon(xr2, yr2, xr2.length);
        gr.setColor(Color.RED);
        gr.fillPolygon(polygonRed2);

        //стёкло 2
        int[] x4 = {-40, -50, -36, 33, 65, 67, 44, 17, 6, -5};
        int[] y4 = {-63, -28, -26, -23, -23, -24, -41, -57, -61, -62, };
        for(int i = 0; i < x4.length; i++){
            x4[i] += w;
            y4[i] += h;
        }

        Polygon polygon4 = new Polygon(x4, y4, 10);
        gr.setColor(Color.CYAN);
        gr.fillPolygon(polygon4);

        //стёкло 3
        int[] x5 = {-54, -63, -71, -87, -99, -100, -97, -63, -62, -53};
        int[] y5 = {-61, -60, -58, -48, -39, -36, -35, -32, -33, -59};
        for(int i = 0; i < x5.length; i++){
            x5[i] += w;
            y5[i] += h;
        }

        Polygon polygon5 = new Polygon(x5, y5, 10);
        gr.setColor(Color.CYAN);
        gr.fillPolygon(polygon5);

        //стёкло 4
        int[] x20 = {-98, -141, -174, -165, -151, -143, -99};
        int[] y20 = {-65, -49, -36, -36, -37, -39, -62};
        for(int i = 0; i < x20.length; i++){
            x20[i] += w;
            y20[i] += h;
        }

        Polygon polygon6 = new Polygon(x20, y20, 7);
        gr.setColor(Color.CYAN);
        gr.fillPolygon(polygon6);

        //облицовка 1
        int[] x6 = {235, 219, 191, 178, 165, 150, 137, 123, 113, 105, 99};
        int[] y6 = {13, 12, 12, -1, -7, -10, -9, -4, 2, 13, 25};
        for(int i = 0; i < x6.length; i++){
            x6[i] += w;
            y6[i] += h;
        }

        gr.setColor(Color.BLACK);
        gr.drawPolyline(x6, y6, 11);

        //облицовка 2
        int[] x7 = {190, 221, 241, 245, 246};
        int[] y7 = {14, 15, 16, 17, 25};
        for(int i = 0; i < x7.length; i++){
            x7[i] += w;
            y7[i] += h;
        }

        gr.setColor(Color.BLACK);
        gr.drawPolyline(x7, y7, 5);

        //облицовка 3
        int[] x8 = {241, 242, 242, 241, 240, 226, 225, 224};
        int[] y8 = {16, 20, 28, 34, 33, 33, 36, 42};
        for(int i = 0; i < x8.length; i++){
            x8[i] += w;
            y8[i] += h;
        }

        gr.setColor(Color.BLACK);
        gr.drawPolyline(x8, y8, 8);

        //облицовка 4
        int[] x9 = {221, 222, 221, 220, 221, 220, 223, 223};
        int[] y9 = {15, 22, 35, 42, 45, 48, 56, 60};
        for(int i = 0; i < x9.length; i++){
            x9[i] += w;
            y9[i] += h;
        }

        gr.setColor(Color.BLACK);
        gr.drawPolyline(x9, y9, 8);

        //облицовка 5
        int[] x10 = {203, 202, 199, 197, 195, 197, 198};
        int[] y10 = {43, 35, 26, 25, 26, 37, 43};
        for(int i = 0; i < x10.length; i++){
            x10[i] += w;
            y10[i] += h;
        }

        gr.setColor(Color.BLACK);
        gr.drawPolyline(x10, y10, 7);

        //облицовка 6
        int[] x11 = {239, 220, 203, 198, 195, 192, 193, 221, 240, 241, 239};
        int[] y11 = {43, 42, 43, 43, 43, 46, 47, 45, 46, 45, 43};
        for(int i = 0; i < x11.length; i++){
            x11[i] += w;
            y11[i] += h;
        }

        gr.setColor(Color.BLACK);
        gr.drawPolyline(x11, y11, 11);

        //облицовка 7
        int[] x12 = {191, 192, 191, 188, 181, 170, 155, 141, 130, 117, 108, 105, 104, 104};
        int[] y12 = {60, 46, 32, 22, 11, 3, -1, -1, 2, 10, 23, 35, 46, 52};
        for(int i = 0; i < x12.length; i++){
            x12[i] += w;
            y12[i] += h;
        }

        gr.setColor(Color.BLACK);
        gr.drawPolyline(x12, y12, 14);

        //облицовка 8
        int[] x13 = {75, 62, 6, -58, -61, -62, -58, -57, -53, -48, -46, -38, 76, 82, 84, 85, 84, 81, 75};
        int[] y13 = {-23, -22, -22, -26, -19, -3, 14, 16, 27, 32, 35, 40, 41, 34, 19, 18, -9, -16, -23};
        for(int i = 0; i < x13.length; i++){
            x13[i] += w;
            y13[i] += h;
        }

        gr.setColor(Color.BLACK);
        gr.drawPolyline(x13, y13, 19);

        //облицовка 9
        int[] x14 = {104, 98, 91, 76, -38, -47, -51, -89, -97, 74, 104};
        int[] y14 = {46, 43, 41, 41, 40, 40, 36, 41, 45, 46, 46};
        for(int i = 0; i < x14.length; i++){
            x14[i] += w;
            y14[i] += h;
        }

        gr.setColor(Color.BLACK);
        gr.drawPolyline(x14, y14, 11);

        //облицовка 7
        int[] x15 = {208, 216, 218, 219, 237, 237, 231, 226, 216};
        int[] y15 = {-4, -1, 5, 10, 12, 10, 0, 0, -1};
        for(int i = 0; i < x15.length; i++){
            x15[i] += w;
            y15[i] += h;
        }


        gr.setColor(Color.BLACK);
        gr.drawPolyline(x15, y15, 9);

        //облицовка 8
        int[] x16 = {-228, -229, -232, -239, -240, -241, -239, -231, -230, -230, -228};
        int[] y16 = {-30, -32, -32, -23, -15, -5, -4, -3, -16, -20, -30};
        for(int i = 0; i < x16.length; i++){
            x16[i] += w;
            y16[i] += h;
        }

        gr.setColor(Color.BLACK);
        gr.drawPolyline(x16, y16, 11);

        //облицовка 9
        int[] x17 = {-228, -226, -100, -58};
        int[] y17 = {-30, -31, -28, -26};
        for(int i = 0; i < x17.length; i++){
            x17[i] += w;
            y17[i] += h;
        }

        gr.setColor(Color.BLACK);
        gr.drawPolyline(x17, y17, 4);

        //облицовка 10
        int[] x18 = {-230, -222, -168, -115, -62, -117, -169, -222, -230};
        int[] y18 = {-16, -16, -15, -11, -3, -6, -9, -14, -16};
        for(int i = 0; i < x18.length; i++){
            x18[i] += w;
            y18[i] += h;
        }

        gr.setColor(Color.BLACK);
        gr.drawPolyline(x18, y18, 8);

        //облицовка 11
        int[] x19 = {-97, -98, -102, -113, -126, -142, -157, -170, -178, -183, -184, -184};
        int[] y19 = {45, 32, 18, 5, 0, -2, 0, 7, 17, 30, 40, 46};
        for(int i = 0; i < x19.length; i++){
            x19[i] += w;
            y19[i] += h;
        }

        gr.setColor(Color.BLACK);
        gr.drawPolyline(x19, y19, 12);

        //облицовка 12
        int[] x21 = {79, 81, 122, 170, 208};
        int[] y21 = {-24, -23, -19, -12, -4};
        for(int i = 0; i < x21.length; i++){
            x21[i] += w;
            y21[i] += h;
        }

        gr.setColor(Color.BLACK);
        gr.drawPolyline(x21, y21, x21.length);

        //облицовка 13
        int[] x22 = {231, 235, 238};
        int[] y22 = {0, -1, -2};
        for(int i = 0; i < x22.length; i++){
            x22[i] += w;
            y22[i] += h;
        }

        gr.setColor(Color.BLACK);
        gr.drawPolyline(x22, y22, x22.length);

        //облицовка 14
        int[] x23 = {-51, -51, -47, -45, -33, -30, -27, -27, -33, -45, -49, -51};
        int[] y23 = {-17, -14, -13, -13, -13, -13, -13, -15, -15, -16, -17, -17};
        for(int i = 0; i < x23.length; i++){
            x23[i] += w;
            y23[i] += h;
        }

        gr.setColor(Color.BLACK);
        gr.drawPolyline(x23, y23, x23.length);

        //облицовка 15
        int[] x24 = {-49, -51, -51, -47, -45, -33, -30, -27, -27, -35, -47, -49};
        int[] y24 = {-17, -17, -14, -13, -10, -9, -12, -13, -15, -19, -19, -17};
        for(int i = 0; i < x24.length; i++){
            x24[i] += w;
            y24[i] += h;
        }

        gr.setColor(Color.BLACK);
        gr.drawPolyline(x24, y24, x24.length);

        //облицовка 16
        int[] x25 = {-84, -58, 11, 85, 96, 85, -57, -84};
        int[] y25 = {15, 14, 15, 18, 19, 19, 16, 15};
        for(int i = 0; i < x25.length; i++){
            x25[i] += w;
            y25[i] += h;
        }

        gr.setColor(Color.BLACK);
        gr.drawPolyline(x25, y25, x25.length);

        //облицовка 17
        int[] x26 = {-231, -232, -237, -238, -236, -236, -235};
        int[] y26 = {-3, 3, 5, 21, 28, 32, 37};
        for(int i = 0; i < x26.length; i++){
            x26[i] += w;
            y26[i] += h;
        }

        //gr.drawLine(-232, 3, -243, 2);
        //gr.drawLine(-237, 5, -248, 5);
        //gr.drawLine(-238, 21, -249, 21);
        gr.setColor(Color.BLACK);
        gr.drawPolyline(x26, y26, x26.length);



    }

    public static void drawSun (Graphics2D gr, Position position, Color c1, Color c2){
        gr.setColor(c1);
        gr.fillOval(position.getX(), position.getY(), position.getLength(), position.getHeight());
    }

    public static void drawWheel(Graphics2D gr, int w, int h, int angle){
        /*
        //шина
        int[] x1 = {37, 36, 33, 29, 23, 16, 8, 0, -8, -16, -23, -29, -33, -36, -37, -36, -33, -29, -23, -16, -8, 0, 8, 16, 23, 29, 33, 36, 37};
        int[] y1 = {0, -7, -15, -22, -28, -32, -35, -36, -35, -32, -28, -22, -15, -7, 0, 7, 15, 22, 28, 32, 35, 36, 35, 32, 28, 22, 15, 7, 0};
        for(int i = 0; i < x1.length; i++){
            x1[i] += w;
            y1[i] += h;
        }

        Polygon polygon1 = new Polygon( x1, y1, x1.length );
        gr.setColor(Color.darkGray);
        gr.fillPolygon( polygon1 );
        gr.setColor(Color.black);
        gr.drawPolyline(x1, y1, x1.length);

        //диск1
        int[] x2 = {30, 29, 27, 23, 19, 13, 7, 0, -7, -13, -19, -23, -27, -29, -30, -29, -27, -23, -19, -13, -7, 0, 7, 13, 19, 23, 27, 29, 30};
        int[] y2 = {0, -6, -12, -18, -23, -26, -29, -30, -29, -26, -23, -18, -12, -6, 0, 6, 12, 18, 23, 26, 29, 30, 29, 26, 23, 18, 12, 6, 0};
        for(int i = 0; i < x2.length; i++){
            x2[i] += w;
            y2[i] += h;
        }

        Polygon polygon2 = new Polygon( x2, y2, x2.length );
        gr.setColor(Color.lightGray);
        gr.fillPolygon( polygon2 );
        gr.setColor(Color.black);
        gr.drawPolyline(x2, y2, x2.length);

        //диск2
        int[] x3 = {26, 25, 23, 20, 16, 11, 6, 0, -6, -11, -16, -20 ,-23, -25, -26, -25, -23, -20, -16, -11, -6, 0, 6, 11, 16, 20, 23, 25, 26};
        int[] y3 = {0, -5, -10, -15, -20, -22, -24, -25, -24, -22, -20, -15, -10, -5, 0, 5, 10 ,15, 20, 22, 24, 25, 24, 22, 20, 15, 10, 5, 0};
        for(int i = 0; i < x3.length; i++){
            x3[i] += w;
            y3[i] += h;
        }

        Polygon polygon3 = new Polygon( x3, y3, x3.length );
        gr.setColor(Color.darkGray);
        gr.fillPolygon( polygon3 );
        gr.setColor(Color.black);
        gr.drawPolyline(x3, y3, x3.length);

        //диск3
        int[] x4 = {27, -27, -27, 27};
        int[] y4 = {-2, -2, 2, 2};
        for(int i = 0; i < x4.length; i++){
            x4[i] += w;
            y4[i] += h;
        }

        Polygon polygon4 = new Polygon( x4, y4, x4.length );
        gr.setColor(Color.lightGray);
        gr.fillPolygon( polygon4 );
        gr.setColor(Color.black);
        gr.drawPolyline(x4, y4, x4.length);

        //диск4
        int[] x5 = {2, -2, -2, 2};
        int[] y5 = {-27, -27, 27, 27};
        for(int i = 0; i < x5.length; i++){
            x5[i] += w;
            y5[i] += h;
        }

        Polygon polygon5 = new Polygon( x5, y5, x5.length );
        gr.setColor(Color.lightGray);
        gr.fillPolygon( polygon5 );
        gr.setColor(Color.black);
        gr.drawPolyline(x5, y5, x5.length);

        //диск5
        int[] x6 = {16, -20, -16, 20};
        int[] y6 = {-20, 16, 20, -16};
        for(int i = 0; i < x6.length; i++){
            x6[i] += w;
            y6[i] += h;
        }

        Polygon polygon6 = new Polygon( x6, y6, x6.length );
        gr.setColor(Color.lightGray);
        gr.fillPolygon( polygon6 );
        gr.setColor(Color.black);
        gr.drawPolyline(x6, y6, x6.length);

        //диск6
        int[] x7 = {-16, -20, 16, 20};
        int[] y7 = {-20, -16, 20, 16};
        for(int i = 0; i < x7.length; i++){
            x7[i] += w;
            y7[i] += h;
        }

        Polygon polygon7 = new Polygon( x7, y7, x7.length );
        gr.setColor(Color.lightGray);
        gr.fillPolygon( polygon7 );
        gr.setColor(Color.black);
        gr.drawPolyline(x7, y7, x7.length);

        //диск6
        int[] x8 = {9, 8, 7, 6, 5, 3, 2, 0, -2, -3, -5, -6, -7, -8, -9, -8, -7, -6, -5, -3, -2, 0, 2, 3, 5, 6, 7, 8, 9};
        int[] y8 = {0, -2, -3, -5, -6, -7, -8, -9, -8, -7, -6, -5, -3, -2, 0, 2, 3, 5, 6, 7, 8, 9, 8, 7, 6, 5, 3, 2, 0};
        for(int i = 0; i < x8.length; i++){
            x8[i] += w;
            y8[i] += h;
        }

        Polygon polygon8 = new Polygon( x8, y8, x8.length );
        gr.setColor(Color.lightGray);
        gr.fillPolygon( polygon8 );
        gr.setColor(Color.black);
        gr.drawPolyline(x8, y8, x8.length);

         */
        int centerX = w / 2;
        int centerY = h / 2;

        int x = centerX - 200/2;
        int y = centerY - 100/2;

        gr.setColor(Color.black);
        gr.fillOval(x, y, 100, 100);

        gr.setColor(Color.lightGray);
        gr.fillArc(x, y, w, h, angle, 30);
        gr.fillArc(x, y, w, h, angle + 120, 30);
        gr.fillArc(x, y, w, h, angle + 240, 30);



    }

    public static void drawGrass(Graphics2D gr, Position position, Color color){
        gr.setColor(color);
        gr.fillPolygon(new int[] {position.getX(), position.getX() + position.getLength() / 2, position.getX() + position.getLength()}, new int[] {position.getY(), position.getY() - position.getHeight(), position.getY()}, 3);
        gr.fillPolygon(new int[] {position.getX() + position.getLength() / 3, position.getX() + position.getLength() / 2 + position.getLength() / 3, position.getX() + position.getLength() + position.getLength() / 3}, new int[] {position.getY(), position.getY() - position.getHeight() * 3 / 2, position.getY()}, 3);
        gr.fillPolygon(new int[] {position.getX() + position.getLength() * 8 / 9, position.getX() + position.getLength() / 2 + position.getLength() * 8 / 9, position.getX() + position.getLength() + position.getLength() * 8 / 9}, new int[] {position.getY(), position.getY() - position.getHeight(), position.getY()}, 3);
    }

    public static void drawCloud(Graphics2D gr, Position position, Color c1, Color c2){
        gr.setColor(c1);
        gr.fillOval(position.getX(), position.getY(), position.getLength(), position.getHeight());
        gr.fillOval(position.getX() + position.getLength() / 3, position.getY() - position.getHeight() / 12, position.getLength(), position.getHeight());
        gr.fillOval(position.getX() + position.getLength(), position.getY() + position.getHeight() / 12, position.getLength() * 2 / 3, position.getHeight() * 2 / 3);
        gr.fillOval(position.getX() + position.getLength(), position.getY() + position.getHeight() / 4, position.getLength() * 2 / 3, position.getHeight() * 2 / 3);
        gr.fillOval(position.getX() + position.getLength() * 9 / 8, position.getY() + position.getHeight() / 6, position.getLength() * 2 / 3, position.getHeight() * 2 / 3);
    }

    public static void drawMountain(Graphics2D gr, Position position, Color c1, Color c2, Color c3){
        gr.setColor(c1);
        gr.fillPolygon(new int[] {position.getX(), position.getX() + position.getLength() / 2, position.getX() + position.getLength() / 2}, new int[] {position.getY(), position.getY() - position.getHeight(), position.getY()}, 3);

        gr.setColor(c2);
        gr.fillPolygon(new int[] {position.getX() + position.getLength() / 2, position.getX() + position.getLength() / 2, position.getX() + position.getLength()}, new int[] {position.getY(), position.getY() - position.getHeight(), position.getY()}, 3);

        gr.setColor(c3);
        gr.fillPolygon(new int[] {(int) (position.getX() + position.getLength() / 2 - position.getLength() / 5.7),
                        position.getX() + position.getLength() / 2,
                        (int) (position.getX() + position.getLength() / 2 + position.getLength() / 5.7),
                        position.getX() + position.getLength() / 2 + position.getLength() / 10,
                        position.getX() + position.getLength() / 2 - position.getLength() / 13},
                new int[] {position.getY() - position.getHeight() * 6 / 9,
                        position.getY() - position.getHeight() - position.getHeight() / 49,
                        position.getY() - position.getHeight() * 6 / 9,
                        position.getY() - position.getHeight() * 6 / 9 - position.getHeight() / 10,
                        position.getY() - position.getHeight() * 6 / 9 - position.getHeight() / 13}, 5);

    }

}
