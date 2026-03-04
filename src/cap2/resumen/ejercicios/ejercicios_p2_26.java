package cap2.resumen.ejercicios;

import java.util.Scanner;

/**
 * El programa calculara el producto de tres enteros.
 */
public class ejercicios_p2_26 {

    /** El programa obtiene los numeros del usuario y calcula el mayor o igual */
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int x, y;

        System.out.print("Inserte 1er entero: ");
        x = entrada.nextInt();

        System.out.print("Inserte 2do entero: ");
        y = entrada.nextInt();

        System.out.println(y / x);
        System.out.println(y % x);

        if (y % x == 0) {
            System.out.println("El 1ro es multiplo del segundo");
        } else {
            System.out.println("El 1ro NO es multiplo del segundo");
        }

    }
}
