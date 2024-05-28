package org.example.ColorPentagon;

import javax.swing.*;
import java.awt.*;

public class QuitPanel extends JPanel {
    private JButton quitButton;
    public QuitPanel() {
        super();
        quitButton = new QuitButton();
        this.add(quitButton);
    }
}
