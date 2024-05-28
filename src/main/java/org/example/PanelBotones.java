package org.example;

import javax.swing.*;
import java.awt.*;
public class PanelBotones extends JPanel {

    public PanelBotones() {
        super();
        this.setLayout(new BorderLayout());
        // se agregan botones no útiles para demostrar las zonas del Layout
        this.add(new JButton("sur"), BorderLayout.SOUTH);
        this.add(new JButton("centro"), BorderLayout.CENTER);
        this.add(new JButton("norte"), BorderLayout.NORTH);
        this.add(new JButton("este"), BorderLayout.EAST);
        this.add(new JButton("oeste"), BorderLayout.WEST);
    }
}

