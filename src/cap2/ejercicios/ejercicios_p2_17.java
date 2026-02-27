package cap2.ejercicios;

import java.util.Scanner;

/**
 * El programa calculara el producto de tres enteros.
 */
public class ejercicios_p2_17 {

    /** El programa obtiene los numeros del usuario y calcula el mayor o igual */
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int x, y, z;

        System.out.print("Inserte 1er entero: ");
        x = entrada.nextInt();

        System.out.print("Inserte 2do entero: ");
        y = entrada.nextInt();

        System.out.print("Inserte 3er entero: ");
        z = entrada.nextInt();

        System.out.printf("La suma es: %d \n", x + y + z);
        System.out.printf("El Promedio es: %d \n", (x + y + z) / 3);
        System.out.printf("El producto es: %d \n", x * y * z);

        if (x == y) {
            System.out.printf("Estos numeros son iguales");
        }
        // mayor
        else if (x > y && x > z) {
            System.out.printf("Es mas grande %d", x);
        } else if (y > x && y > z) {
            System.out.printf("Es mas grande %d", y);
        } else if (z > x && z > y) {
            System.out.printf("Es mas grande %d", z);
        } 

        // menor
        if (x < y && x < z) {
            System.out.printf("Es menor %d", x);
        } else if (y < x && y < z) {
            System.out.printf("Es menor %d", y);
        } else if (z < y && z < x) {
            System.out.printf("Es menor %d", z);
        } 

    }
}
