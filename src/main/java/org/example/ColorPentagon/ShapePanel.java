package org.example.ColorPentagon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShapePanel extends JPanel {
   private ColorChangingTriangle colorChangingPentagon;

    public ShapePanel(ColorHolder colorHolder) {
        super();
        this.setPreferredSize(new Dimension(300,300));
        colorChangingPentagon = new ColorChangingTriangle(colorHolder);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        colorChangingPentagon.paintComponent(g,this.getWidth(),this.getHeight());
    }
}
