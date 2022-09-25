package ru.vsu.cs.kg2022.suvorov_d_a.task1;

import ru.vsu.cs.kg2022.suvorov_d_a.task1.Background.*;
import ru.vsu.cs.kg2022.suvorov_d_a.task1.Ship.*;
import ru.vsu.cs.kg2022.suvorov_d_a.task1.Ship.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DrawPanel extends JPanel implements ActionListener {

    private static final Random rnd = new Random();
    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private final Timer timer;
    private int ticksFromStart = 0;

    private final SkyAndSea nature;
    private final Sun sun;
    private final Bird bird;
    private final Cloud cloud;
    private final Wave wave;

    private final Vessel vessel;
    private final Cabin cabin;
    private final Rope rope;
    private final Tube tube;
    private final Mast mast;
    private final Window window;

    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();

        this.nature = new SkyAndSea(0, 0, width, height, new Color(148, 187, 192), new Color(17, 115, 140));
        this.sun = new Sun(ticksFromStart, 100, 75, new Color(239, 164, 19), Color.ORANGE);
        this.bird = new Bird(width, height, 25, 10, 0, 170, new Color(26, 54, 76));
        this.cloud = new Cloud(105, 160, 125, 35, new Color(228,224,225));
        this.wave = new Wave(width, height, new Color(124,182,196));

        this.vessel = new Vessel(190, 370, 230, 430, "Titanic", new Color(28,40,80));
        this.cabin = new Cabin(180, 370, 450, 10, new Color(234,235,226), new Color(116,79,50));
        this.rope = new Rope(260, 240, 170, 100, 0, 170, new Color(151,157,171));
        this.tube = new Tube(220, 325, 20, 35, new Color(185,109,60));
        this.mast = new Mast(380, 355, new Color(28,40,80));
        this.window = new Window(440, 290, 60, 60, new Color(112,117,137), new Color(111,75,53));
    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);

        nature.setWidth(getWidth());
        nature.setHeight(getHeight());
        nature.drawSkyAndSea(gr);

        sun.setX(ticksFromStart);
        sun.drawSun(gr);

        for (int i = 0; i < 5; i++) {
            bird.setX(rnd.nextInt(0, getWidth()));
            bird.setY(rnd.nextInt(0, getHeight()/3));
            bird.setWidth(rnd.nextInt(15, 35));
            bird.drawBird(gr);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        cloud.setX(ticksFromStart);
        cloud.drawCloud(gr);

        for (int j = 0; j < 50; j++) {
            wave.setX(rnd.nextInt(0, getWidth()));
            wave.setY(rnd.nextInt(getHeight()/3, getHeight()));
            wave.drawWave(gr);
        }

        vessel.drawVessel(gr);
        cabin.drawCabin(gr);
        rope.drawRope(gr);
        tube.drawTube(gr);
        mast.drawMast(gr);
        window.drawWindow(gr);

    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ticksFromStart+=5;
        }
    }

}