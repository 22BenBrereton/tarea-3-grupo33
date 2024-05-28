package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploListenerBoton {
    private JButton button;
    private JFrame frame;
    public EjemploListenerBoton() {
        frame = new JFrame("Ejemplo de Listener para Botón");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("Haz clic aquí");
        button.addActionListener(new MiActionListener()); // Agregamos la clase interna como oyente
        frame.add(button);
        frame.setVisible(true);
        frame.pack(); //ajustar automáticamente el tamaño de un contenedor para que todos sus componentes estén al menos en sus tamaños preferidos
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new EjemploListenerBoton();
    }

    // Clase interna que implementa ActionListener
    private class MiActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Acción a realizar cuando se hace clic en el botón
            button.setText("¡Botón clickeado!");
            System.out.println("¡Botón clickeado!");
        }
    }
}