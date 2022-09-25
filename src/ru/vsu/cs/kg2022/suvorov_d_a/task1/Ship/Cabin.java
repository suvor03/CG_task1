package ru.vsu.cs.kg2022.suvorov_d_a.task1.Ship;

import java.awt.*;

public class Cabin {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color colorCabin;
    private Color colorBoard;

    public Cabin(int x, int y, int width, int height, Color colorCabin, Color colorBoard) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.colorCabin = colorCabin;
        this.colorBoard = colorBoard;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColorCabin(Color colorCabin) {
        this.colorCabin = colorCabin;
    }

    public void setColorBoard(Color colorBoard) {
        this.colorBoard = colorBoard;
    }

    public void drawCabin(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(this.colorCabin);
        g.fillRect(this.x, this.y, this.width, this.height);
        g.setColor(this.colorBoard);
        g.fillRect(this.x, this.y - 10, this.width + 10, this.height);
        g.setColor(this.colorCabin);
        g.fillRect(this.x + 220, this.y - 90, this.width - 320, this.height + 70);
    }
}
