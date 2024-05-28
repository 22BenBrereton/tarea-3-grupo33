package org.example.ColorPentagon;

import java.awt.*;

public class ColorChangingPentagon{
    private final ColorHolder colorHolder;

    public ColorChangingPentagon(ColorHolder colorHolder) {
        this.colorHolder = colorHolder;
    }

    protected void paintComponent(Graphics g,int width, int height) {
        int centerX = width / 2;
        int centerY = height / 2;
        int r = width / 2;

        int[] xPoints = new int[5];
        int[] yPoints = new int[5];
        for (int i = 0; i < 5; i++) {
            double angle = Math.toRadians(72 * i);
            xPoints[i] = (int) (centerX + r * Math.cos(angle));
            yPoints[i] = (int) (centerY + r * Math.sin(angle));
        }

        g.setColor(colorHolder.getColor());
        g.fillPolygon(xPoints, yPoints, 5);
    }
}
