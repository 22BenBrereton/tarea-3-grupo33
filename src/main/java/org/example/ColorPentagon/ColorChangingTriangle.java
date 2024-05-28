package org.example.ColorPentagon;

import java.awt.*;

public class ColorChangingTriangle {

    private final ColorHolder colorHolder;

    public ColorChangingTriangle(ColorHolder colorHolder) {
        this.colorHolder = colorHolder;
    }

    protected void paintComponent(Graphics g, int width, int height) {
        int centerX = width / 2;
        int centerY = height / 2;
        int sideLength = width;
        int[] xPoints = {
                centerX,
                centerX - sideLength / 2,
                centerX + sideLength / 2
        };

        int[] yPoints = {
                centerY - sideLength / 2,
                centerY + sideLength / 2,
                centerY + sideLength / 2
        };

        Polygon triangle = new Polygon(xPoints, yPoints, 3);

        g.setColor(colorHolder.getColor());
        g.fillPolygon(triangle);
    }

}
