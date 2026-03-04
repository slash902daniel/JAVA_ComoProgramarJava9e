package cap2.resumen.autoevaluacion;

import java.util.Scanner;
/**
 * El programa calculara el producto de tres enteros.
 */
public class SelfEval_2_15 {
    public static void main(String[] args) throws Exception {
        System.out.println("SelfEval 2.8, start!");

        Scanner entrada = new Scanner(System.in);

        int x, y, z, resultado;

        System.out.println("Inserte el 1er entero: ");
        x= entrada.nextInt();

        System.out.println("Inserte el 2nd entero: ");
        y= entrada.nextInt();

        System.out.printf("La Suma es: %s\n", x + y);
        System.out.printf("La Resta es: %s\n", x - y);
        System.out.printf("La Division es: %s\n", x / y);
        System.out.printf("La Reminder es: %s\n que completa el valor faltante de la division", x % y);    
    }
}
