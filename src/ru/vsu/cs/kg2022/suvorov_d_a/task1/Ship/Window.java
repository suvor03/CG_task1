package ru.vsu.cs.kg2022.suvorov_d_a.task1.Ship;

import java.awt.*;

public class Window {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color colorWindow;
    private Color colorFrame;

    public Window(int x, int y, int width, int height, Color colorWindow, Color colorFrame) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.colorWindow = colorWindow;
        this.colorFrame = colorFrame;
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

    public void setColorWindow(Color colorWindow) {
        this.colorWindow = colorWindow;
    }

    public void setColorFrame(Color colorFrame) {
        this.colorFrame = colorFrame;
    }

    public void drawWindow(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(this.colorWindow);
        g.fillOval(this.x, this.y, this.width, this.height);
        g.setColor(this.colorFrame);
        g.setStroke(new BasicStroke(4));
        g.drawLine(this.x + 30, this.y + 2, this.width + 410, this.height + 288);
        g.drawLine(this.x + 2, this.y + 32, this.width + 438, this.y + 32);
    }
}
