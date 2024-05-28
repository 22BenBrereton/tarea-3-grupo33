package org.example.ColorPentagon;

import javax.swing.*;
import java.awt.*;

public class ColorButton extends JRadioButton {
    private final ColorHolder colorHolder;
    private final Color thisColor;

    public ColorButton(String label,ColorHolder colorHolder, Color color) {
        super(label);
        this.colorHolder = colorHolder;
        thisColor = color;
        this.addActionListener(new ColorListener());
    }

    private class ColorListener implements java.awt.event.ActionListener {
        public void actionPerformed( java.awt.event.ActionEvent e) {
            colorHolder.setColor(thisColor);
        }
    }
}

