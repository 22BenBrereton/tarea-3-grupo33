package org.example;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private PanelPrincipal dp;//un panel para objetos gráficos
    private PanelBotones bp;//un panel para botones
    Ventana(){
        super();
        this.setLayout(new BorderLayout());
        dp=new PanelPrincipal();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //cerrar aplicación
        this.add(dp,BorderLayout.CENTER); //se agrega al centro
        bp = new PanelBotones();
        this.add(bp,BorderLayout.SOUTH); //se agrega al sur
        this.setSize(600,400);
        this.setVisible(true);
    }
}
