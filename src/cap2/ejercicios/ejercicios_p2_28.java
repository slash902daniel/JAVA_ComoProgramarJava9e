package cap2.ejercicios;

import java.util.Scanner;

/**
 * El programa calculara el producto de tres enteros.
 */
public class ejercicios_p2_28 {

    /** El programa obtiene los numeros del usuario y calcula el mayor o igual */
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int radio;

        System.out.print("Inserte el radio del circulo: ");
        radio = entrada.nextInt();

        System.out.printf("El diametro es: %d \n", 2 * radio);
        System.out.printf("la circunferencia es: %2f \n", 2 * Math.PI * radio);
        System.out.printf("El area es: %2f \n", Math.PI * radio * radio);

    }
}
