
package proyectofinal;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class ProyectoFinal {

    public static void main(String[] args) {
        // SwingUtilities.invokeLater inicia la ventana en el hilo de Swing.
        SwingUtilities.invokeLater(() -> crearVentana());
    }

    private static void crearVentana() {
        JFrame ventana = new JFrame("Mi primer programa con Swing");
        JLabel mensaje = new JLabel("Presiona el botón");
        JButton boton = new JButton("Saludar");

        // Esta acción ocurre cada vez que el usuario pulsa el botón.
        boton.addActionListener(evento -> mensaje.setText("¡Hola! Ya usaste Swing"));

        ventana.setLayout(new FlowLayout());
        ventana.add(mensaje);
        ventana.add(boton);
        ventana.setSize(360, 120);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
