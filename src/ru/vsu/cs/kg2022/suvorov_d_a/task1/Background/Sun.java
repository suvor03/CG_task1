package ru.vsu.cs.kg2022.suvorov_d_a.task1.Background;

import java.awt.*;

public class Sun {

    private int x;
    private int y;
    private int r;
    private Color colorSun;
    private Color colorRingOfSun;

    public Sun(int x, int y, int r, Color colorSun, Color colorRingOfSun) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.colorSun = colorSun;
        this.colorRingOfSun = colorRingOfSun;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setColorSun(Color colorSun) {
        this.colorSun = colorSun;
    }

    public void setColorRingOfSun(Color colorRingOfSun) {
        this.colorRingOfSun = colorRingOfSun;
    }

    public void drawSun(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(this.colorSun);
        g.fillOval(this.x-this.r, this.y-this.r, 2*this.r, 2*this.r);
        g.setStroke(new BasicStroke(3));
        g.setColor(this.colorRingOfSun);
        g.drawOval(this.x-this.r-1, this.y-this.r-1, 2*this.r+1, 2*this.r+1);
    }
}
