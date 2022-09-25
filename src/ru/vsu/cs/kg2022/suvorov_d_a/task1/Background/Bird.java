package ru.vsu.cs.kg2022.suvorov_d_a.task1.Background;

import java.awt.*;

public class Bird {

    private int x;
    private int y;
    private int width;
    private int height;
    private int startAngle;
    private int arcAngle;
    private Color colorBird;

    public Bird(int x, int y, int width, int height, int startAngle, int arcAngle, Color colorBird) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.startAngle = startAngle;
        this.arcAngle = arcAngle;
        this.colorBird = colorBird;
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

    public void setStartAngle(int startAngle) {
        this.startAngle = startAngle;
    }

    public void setArcAngle(int arcAngle) {
        this.arcAngle = arcAngle;
    }

    public void setColorBird(Color colorBird) {
        this.colorBird = colorBird;
    }

    public void drawBird(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(this.colorBird);
        g.setStroke(new BasicStroke(3));
        g.drawArc(this.x, this.y, this.width, this.height, this.startAngle, this.arcAngle);
        g.drawArc(this.x + this.width, this.y, this.width, this.height, this.startAngle + 360, this.arcAngle);
    }
}
