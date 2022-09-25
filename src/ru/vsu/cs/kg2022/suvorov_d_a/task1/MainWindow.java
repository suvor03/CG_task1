package ru.vsu.cs.kg2022.suvorov_d_a.task1;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() throws HeadlessException {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800, 600);
        DrawPanel drawPanel = new DrawPanel(getWidth(), getHeight(), 100);
        this.add(drawPanel);
    }
}