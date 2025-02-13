package cap2.selfeval;

import java.util.Scanner;
/**
 * El programa calculara el producto de tres enteros.
 */
public class SelfEval_2_5 {
    public static void main(String[] args) throws Exception {
        System.out.println("SelfEval 2.5, start!");

        Scanner entrada = new Scanner(System.in);

        int x, y, z, resultado;

        System.out.println("Inserte el 1er entero: ");
        x= entrada.nextInt();

        System.out.println("Inserte el 2nd entero: ");
        y= entrada.nextInt();

        System.out.println("Inserte el 3ro entero: ");
        z= entrada.nextInt();

        resultado =  x*y*z;
        System.out.printf("El producto es: %s", resultado);
    }
}
