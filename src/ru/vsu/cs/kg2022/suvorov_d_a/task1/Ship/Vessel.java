package ru.vsu.cs.kg2022.suvorov_d_a.task1.Ship;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Vessel {
    private int x;
    private int y;
    private int xString;
    private int yString;
    private String name;
    private Color colorVessel;

    public Vessel(int x, int y, int xString, int yString, String name, Color colorVessel) {
        this.x = x;
        this.y = y;
        this.xString = xString;
        this.yString = yString;
        this.name = name;
        this.colorVessel = colorVessel;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setxString(int xString) {
        this.xString = xString;
    }

    public void setyString(int yString) {
        this.yString = yString;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColorVessel(Color colorVessel) {
        this.colorVessel = colorVessel;
    }

    public void drawVessel(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        int[] arrayX = {this.x, this.x + 430, this.x + 360, this.x};
        int[] arrayY = {this.y, this.y, this.y + 100, this.y + 100};
        Polygon poly = new Polygon(arrayX, arrayY, 4);
        g.setColor(this.colorVessel);
        g.fill(poly);
        GeneralPath genPath = new GeneralPath();
        genPath.moveTo(arrayX[0], arrayY[0]);
        genPath.closePath();
        g.setColor(Color.WHITE);
        Font f = new Font("Arial", Font.ITALIC, 30);
        g.setFont(f);
        g.drawString(this.name, this.xString, this.yString);
    }
}
