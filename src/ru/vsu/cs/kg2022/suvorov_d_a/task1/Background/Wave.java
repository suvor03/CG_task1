package ru.vsu.cs.kg2022.suvorov_d_a.task1.Background;

import java.awt.*;
import java.util.Random;

public class Wave {
    private static final Random rnd = new Random();
    private int x;
    private int y;
    private Color colorWave;

    public Wave(int x, int y, Color colorWave) {
        this.x = x;
        this.y = y;
        this.colorWave = colorWave;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColorWave(Color colorWave) {
        this.colorWave = colorWave;
    }

    public void drawWave(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(this.colorWave);
        g.setStroke(new BasicStroke(2));
        g.drawLine(this.x, this.y, this.x + rnd.nextInt(11, 26), this.y);
    }
}
