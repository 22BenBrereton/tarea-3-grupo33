package org.example.ColorPentagon;

import javax.swing.*;
import java.awt.*;

public class ColorButtonRow extends JPanel {
    private ColorButton greenButton;
    private ColorButton blueButton;
    private ColorButton redButton;

    public ColorButtonRow(ColorHolder colorHolder) {
        super();
        //botones diferenciados por colores de valor diferente y diferentes rótulos
        greenButton = new ColorButton("Green", colorHolder, Color.GREEN);
        blueButton = new ColorButton("Blue", colorHolder, Color.BLUE);
        redButton = new ColorButton("Red", colorHolder, Color.RED);
        /* hacer buttons mutuamente exclusivos */
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(greenButton);
        buttonGroup.add(blueButton);
        this.add(greenButton);
        this.add(blueButton);
        this.add(redButton);
    }
}
