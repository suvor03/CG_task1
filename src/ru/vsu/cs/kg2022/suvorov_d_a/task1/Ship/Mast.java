package ru.vsu.cs.kg2022.suvorov_d_a.task1.Ship;

import java.awt.*;

public class Mast {
    private int x;
    private int y;
    private Color colorMast;

    public Mast(int x, int y, Color colorMast) {
        this.x = x;
        this.y = y;
        this.colorMast = colorMast;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColorMast(Color colorMast) {
        this.colorMast = colorMast;
    }

    public void drawMast(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(this.colorMast);
        g.setStroke(new BasicStroke(9));
        g.drawLine(this.x, this.y, this.x, this.y - 215);
        g.drawLine(this.x, this.y - 15, this.x - 120, this.y - 115);
        g.drawLine(this.x - 30, this.y - 175, this.x + 30, this.y - 175);
        g.drawLine(this.x - 70, this.y - 75, this.x + 5, this.y - 75);
        g.drawLine(this.x - 15, this.y - 55, this.x - 10, this.y - 55);
    }
}
