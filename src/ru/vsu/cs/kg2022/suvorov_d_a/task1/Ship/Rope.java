package ru.vsu.cs.kg2022.suvorov_d_a.task1.Ship;

import java.awt.*;

public class Rope {
    private int x;
    private int y;
    private int width;
    private int height;
    private int startAngle;
    private int arcAngle;
    private Color colorRope;

    public Rope(int x, int y, int width, int height, int startAngle, int arcAngle, Color colorRope) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.startAngle = startAngle;
        this.arcAngle = arcAngle;
        this.colorRope = colorRope;
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

    public void setColorRope(Color colorRope) {
        this.colorRope = colorRope;
    }

    public void drawRope(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(this.colorRope);
        g.setStroke(new BasicStroke(4));
        g.drawLine(this.x, this.y, this.x - 70, this.y + 120);
        g.drawLine(this.x, this.y, this.x - 15, this.y + 120);

        g.drawLine(this.x, this.y, this.x + 123, this.y - 103);
        g.drawLine(this.x , this.y + 20, this.x + 123, this.y - 80);

        g.drawLine(this.x + 120, this.y - 100, this.x + 348, this.y + 120);

        g.drawArc(this.x + 90, this.y + 90, this.width, this.height, this.startAngle - 180, this.arcAngle);
        g.drawArc(this.x + 90 + this.width, this.y + 90, this.width - 110, this.height, this.startAngle + 180, this.arcAngle);
    }
}
