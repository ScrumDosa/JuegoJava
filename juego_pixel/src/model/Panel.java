package model;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel
extends JPanel {
    public Panel() {
        this.setSize(800, 600);
    }

    @Override
    public void paintComponent(Graphics g) {
        Dimension tamanio = this.getSize();
        ImageIcon imagenFondo = new ImageIcon(this.getClass().getResource("anillos.jpg"));
        g.drawImage(imagenFondo.getImage(), 0, 0, tamanio.width, tamanio.height, null);
        this.setOpaque(false);
        super.paintComponent(g);
    }
}