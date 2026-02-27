package cap2.ejercicios;

import java.util.Scanner;

/**
 * El programa calculara el producto de tres enteros.
 */
public class ejercicios_p2_24 {

    /** El programa obtiene los numeros del usuario y calcula el mayor o igual */
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int x, y, z, za, zb;

        System.out.print("Inserte 1er entero: ");
        x = entrada.nextInt();

        System.out.print("Inserte 2do entero: ");
        y = entrada.nextInt();

        System.out.print("Inserte 3er entero: ");
        z = entrada.nextInt();

        System.out.print("Inserte 4to entero: ");
        za = entrada.nextInt();

        System.out.print("Inserte 5to entero: ");
        zb = entrada.nextInt();

        // mayor
        if (x > y && x > z && x > za && x > zb) {
            System.out.printf("Es mas grande %d", x);
        } else if (y > x && y > z && y > za && y > zb) {
            System.out.printf("Es mas grande %d", y);
        } else if (z > x && z > y && z > za && z > zb) {
            System.out.printf("Es mas grande %d", z);
        } else if (za > x && za > y && za > z && za > zb) {
            System.out.printf("Es mas grande %d", za);
        } else if (zb > x && zb > y && zb > z && zb > za) {
            System.out.printf("Es mas grande %d", zb);
        }

        // menor
        if (x < y && x < z && x < za && x < zb) {
            System.out.printf("Es menor %d", x);
        } else if (y < x && y < z && y < za && y < zb) {
            System.out.printf("Es menor %d", y);
        } else if (z < y && z < x && z < za && z < zb) {
            System.out.printf("Es menor %d", z);
        } else if (za < y && za < x && za < z && za < zb) {
            System.out.printf("Es menor %d", za);
        } else if (zb < y && zb < x && zb < z && zb < za) {
            System.out.printf("Es menor %d", zb);
        }

    }
}
