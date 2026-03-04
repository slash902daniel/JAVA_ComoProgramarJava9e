package cap3.gui;

import javax.swing.JOptionPane;

public class DialogoNombre {

    /**
     * Fig 3.18
     * @param args
     */
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog("Cual es su nombre");

        String mensaje = String.format("Bienvenido %s a la programacion Java!", nombre);

        JOptionPane.showMessageDialog(null, mensaje);
    }

}
