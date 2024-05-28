package org.example;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EjemploMouseAdapterConInner  {
    private JFrame frame;
    private JLabel label;

    public EjemploMouseAdapterConInner() {
        frame = new JFrame("Ejemplo MouseAdapter");
        label = new JLabel("Haz clic dentro de este ventana");
        frame.add(label);
        frame.addMouseListener(new MiMouseAdapter());
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private class MiMouseAdapter extends MouseAdapter {
        // Método invocado cuando se hace clic con el mouse
        @Override
        public void mouseClicked(MouseEvent e) {
            label.setText("Clic en (" + e.getX() + ", " + e.getY() + ")");
        }
    }

    public static void main(String[] args) {
        new EjemploMouseAdapterConInner();
    }
}
