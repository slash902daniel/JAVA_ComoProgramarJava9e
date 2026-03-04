package cap3.guia.gui;
import javax.swing.JOptionPane;

// 3.1  
public class Suma {
    
    public static void main (String [] args){
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el 1er entero:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el 2do entero:"));
        int suma = numero1 + numero2;

        String msg = String.format("La suma es %d\n", suma);
        JOptionPane.showMessageDialog(null, msg);
    }
}
