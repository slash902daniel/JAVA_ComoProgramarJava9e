package cap2.guia;
import java.util.Scanner;

public class Suma {
    
    public static void main (String [] args){
        //fig 2.7   
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int suma;

        System.out.print("Escriba el 1er entero: ");
        numero1 = entrada.nextInt();

        System.out.print("Escriba el 2do entero: ");
        numero2 = entrada.nextInt();
        suma = numero1 + numero2;

        System.out.printf("La suma es %d\n", suma);
    }
}
