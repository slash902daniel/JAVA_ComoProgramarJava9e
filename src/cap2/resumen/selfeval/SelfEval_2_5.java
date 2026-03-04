package cap2.resumen.selfeval;

import java.util.Scanner;
/**
 * El programa calculara el producto de tres enteros.
 */
public class SelfEval_2_5 {

/** El programa da el producto de 3 enteros */    
    public static void main (String args[]){    
        Scanner entrada = new Scanner(System.in);
        int x,y,z,resultado;

        System.out.print("Inserte 1er entero: ");
        x = entrada.nextInt();

        System.out.print("Inserte 2do entero: ");
        y = entrada.nextInt();
        
        System.out.print("Inserte 3er entero: ");
        z = entrada.nextInt();

        resultado = x*y*z;

        System.out.println("El producto es: " + resultado);

    }
}
