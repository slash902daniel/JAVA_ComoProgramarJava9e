package cap2.ejercicios;

import java.util.Scanner;

/**
 * El programa calculara el producto de tres enteros.
 */
public class ejercicios_p2_15 {

    /** El programa da el producto de 3 enteros */
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int x, y;

        System.out.print("Inserte 1er entero: ");
        x = entrada.nextInt();

        System.out.print("Inserte 2do entero: ");
        y = entrada.nextInt();

        System.out.printf("La suma es: %d \n", x + y);
        System.out.printf("El producto es: %d \n", x * y);
        System.out.printf("La diferencia es: %d \n", x - y);
        System.out.printf("El cociente es: %d \n", x/y);

    }
}
