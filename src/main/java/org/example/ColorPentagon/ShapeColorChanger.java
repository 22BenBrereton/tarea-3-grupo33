package org.example.ColorPentagon;

import javax.swing.*;
import java.awt.*;

public class ShapeColorChanger extends JFrame {

    private final ShapePanel shapePanel;
    private final SouthPanel southPanel;

    public ShapeColorChanger(){
        super();
        this.setLayout(new BorderLayout());
        ColorHolder colorHolder = new ColorHolder();
        shapePanel = new ShapePanel(colorHolder);
        this.add(shapePanel,BorderLayout.CENTER);
        southPanel = new SouthPanel(colorHolder);
        this.add(southPanel,BorderLayout.PAGE_END);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
