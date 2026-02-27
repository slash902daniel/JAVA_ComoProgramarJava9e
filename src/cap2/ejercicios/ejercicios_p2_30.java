package cap2.ejercicios;

import java.util.Scanner;

/**
 * El programa calculara el producto de tres enteros.
 */
public class ejercicios_p2_30 {

    /** El programa obtiene los numeros del usuario y calcula el mayor o igual */
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("Inserte numero entero: ");
        numero = entrada.nextInt();

        String temp = String.valueOf(numero);
        char[] caracteres = temp.toCharArray();

        // Resultado: ['1', '2', '3', '4', '5']
        for (char c : caracteres) {
            System.out.println(c);
        }

    }
}
