package org.example;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    public PanelPrincipal(){
        super();
        this.setSize(600,400);
        this.setBackground(Color.blue);
    }

    @Override
    public void paintComponent(Graphics g){
        //g define el contexto en el que se dibuja
        super.paintComponent(g);
        g.setColor(Color.green);
        g.fillOval(100,100,100,100);



    }

}
