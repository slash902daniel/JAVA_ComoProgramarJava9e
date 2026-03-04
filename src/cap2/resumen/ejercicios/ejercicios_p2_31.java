package cap2.resumen.ejercicios;

/**
 * El programa calculara el producto de tres enteros.
 */
public class ejercicios_p2_31 {

    /** El programa obtiene los numeros del usuario y calcula el mayor o igual */
    public static void main(String args[]) {
        int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.printf("Numero\t\tcuadrado\tcubo\n");

        for (int n : nums) {
            //System.out.println(n);
            System.out.printf("%d\t\t%d\t\t%d\n", n, n*n, n*n*n);
        }

    }
}
