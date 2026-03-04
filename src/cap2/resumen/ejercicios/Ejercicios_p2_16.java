package cap2.resumen.ejercicios;

import java.util.Scanner;

/**
 * El programa calculara el producto de tres enteros.
 */
public class Ejercicios_p2_16 {

    /** El programa obtiene los numeros del usuario y calcula el mayor o igual */
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int x, y;

        System.out.print("Inserte 1er entero: ");
        x = entrada.nextInt();

        System.out.print("Inserte 2do entero: ");
        y = entrada.nextInt();

        if (x == y) {
            System.out.printf("Estos numeros son iguales");
        } else if (x > y) {
            System.out.printf("Es mas grande %d", x);
        } else if (y > x) {
            System.out.printf("Es mas grande %d", y);
        }

    }
}
