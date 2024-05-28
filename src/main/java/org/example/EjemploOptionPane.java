package org.example;
import javax.swing.JOptionPane;

public class EjemploOptionPane {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre:");
        JOptionPane.showMessageDialog(null, "¡Hola, " + nombre + "!", "Saludo Personalizado", JOptionPane.INFORMATION_MESSAGE);
    }
}
