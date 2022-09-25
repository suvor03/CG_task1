package ru.vsu.cs.kg2022.suvorov_d_a.task1.Ship;

import java.awt.*;

public class Tube {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color colorTube;

    public Tube(int x, int y, int width, int height, Color colorTube) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.colorTube = colorTube;
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

    public void setColorTube(Color colorTube) {
        this.colorTube = colorTube;
    }

    public void drawTube(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(this.colorTube);
        g.fillRect(this.x, this.y, this.width, this.height);
        g.fillRect(this.x + 40, this.y, this.width, this.height);
        g.fillRect(this.x + 195, this.y - 103, this.width - 3, this.height + 23);

        g.fillOval(this.x + 180, this.y + 90, this.width + 5, this.height - 10);
        g.fillOval(this.x + 288, this.y + 47, this.width + 5, this.height - 10);
    }
}
