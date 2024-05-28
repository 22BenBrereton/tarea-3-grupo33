package org.example;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EjemploMouseListener2 {
    private JFrame frame;
    private JLabel label;

    public EjemploMouseListener2() {
        frame = new JFrame("Ejemplo MouseListener");
        label = new JLabel("Haz clic dentro de este ventana");
        frame.add(label);
        frame.addMouseListener(new MiMouseListener());
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new EjemploMouseListener2();
    }

    private class MiMouseListener implements MouseListener {
        // Método invocado cuando se hace clic con el mouse
        @Override
        public void mouseClicked(MouseEvent e) {
            label.setText("Clic en (" + e.getX() + ", " + e.getY() + ")");
        }

        // Otros métodos de MouseListener (puedes implementarlos según tus necesidades)
        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }


    }
}
