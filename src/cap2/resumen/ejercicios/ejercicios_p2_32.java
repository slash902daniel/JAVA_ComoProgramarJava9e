package cap2.resumen.ejercicios;

import java.util.Scanner;

/**
 * El programa calculara el producto de tres enteros.
 */
public class Ejercicios_p2_32 {

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

        int[] numeros = { x, y, z, za, zb };
        int index_zero = 0;
        int index_pos = 0;
        int index_neg = 0;

        for (int n : numeros) {
            if (n == 0) {
                index_zero++;
            } else if (n > 0) {
                index_pos++;
            } else if (n < 0) {
                index_neg++;
            }

        }

        System.out.printf("Cantidad de CEROS: %d\n", index_zero);
        System.out.printf("Cantidad de POSITIVOS: %d\n", index_pos);
        System.out.printf("Cantidad de NEGATIVOS: %d\n", index_neg);

    }
}
