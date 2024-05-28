package org.example.ColorPentagon;

import javax.swing.*;
import java.awt.*;

public class SouthPanel extends JPanel {
    public SouthPanel(ColorHolder colorHolder) {
        super();
        this.setLayout(new GridLayout(2,1));
        this.add(new ColorButtonRow(colorHolder));
        this.add(new QuitPanel());
    }
}
