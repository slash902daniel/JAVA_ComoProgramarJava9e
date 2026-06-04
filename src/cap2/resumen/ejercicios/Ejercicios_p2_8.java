package cap2.resumen.ejercicios;

import java.util.Scanner;
/**
 * Inicia en pagina 102
 */
public class Ejercicios_p2_8 {
    public static void main(String[] args) throws Exception {
        System.out.println("SelfEval 2.8, start!");

        Scanner entrada = new Scanner(System.in);

        int a, b, c;

        System.out.println("Escriba un numero entero: ");
        
        a=1;
        b=2;

        //int 3g;

        c = 7+3*6/2-1;
        System.out.println("c: " + c); //15

        c = 2%2+2*2-2/2; 
            
        System.out.println("c: " + c); //3

        c = ( 3 * 9 * ( 3 + ( 9 * 3 / ( 3 ) ) ) ); 
        System.out.println("c: " + c); //324
             
    }
}
