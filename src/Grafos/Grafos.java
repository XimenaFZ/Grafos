package Grafos;

import javax.swing.JFrame;

public class Grafos {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("GRAFO");
        ventana.add(new Lienzo());
        ventana.setSize(600, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
}
