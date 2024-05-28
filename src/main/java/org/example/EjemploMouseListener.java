package org.example;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EjemploMouseListener implements MouseListener {
    private JFrame frame;
    private JLabel label;

    public EjemploMouseListener() {
        frame = new JFrame("Ejemplo MouseListener");
        label = new JLabel("Haz clic dentro de este ventana");
        frame.add(label);
        frame.addMouseListener(this);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    // Método invocado cuando se hace clic con el mouse
    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Clic en (" + e.getX() + ", " + e.getY() + ")");
    }

    // Otros métodos de MouseListener (puedes implementarlos según tus necesidades)
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) {
        new EjemploMouseListener();
    }
}
