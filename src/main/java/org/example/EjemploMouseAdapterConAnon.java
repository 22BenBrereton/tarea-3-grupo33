package org.example;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EjemploMouseAdapterConAnon {
    private JFrame frame;
    private JLabel label;

    public EjemploMouseAdapterConAnon() {
        frame = new JFrame("Ejemplo MouseAdapter");
        label = new JLabel("Haz clic dentro de este ventana");
        frame.add(label);
        frame.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Clic en (" + e.getX() + ", " + e.getY() + ")");
            }
        });
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new EjemploMouseAdapterConAnon();
    }
}
