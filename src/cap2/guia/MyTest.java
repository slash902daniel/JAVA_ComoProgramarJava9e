package cap2.guia;

import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) throws Exception {
        System.out.println("MyTest, Cap2!");

        Scanner entrada = new Scanner(System.in);

        int numero1, 
        numero2;

        System.out.print("Insert el 1er numero: ");
        numero1 = entrada.nextInt();

        System.out.print("Insert el 2do numero: ");
        numero2 = entrada.nextInt();

        if(numero1 == numero2){
            System.out.printf("%d == %d\n", numero1, numero2);
        }

        if(numero1 != numero2){
            System.out.printf("%d != %d\n", numero1, numero2);
        }

        if(numero1 < numero2){ //menor que
            System.out.printf("%d < %d\n", numero1, numero2);
        }

        if(numero1 > numero2){ //mayor que
            System.out.printf("%d > %d\n", numero1, numero2);
        }

        if(numero1 <= numero2){ //menor igual que
            System.out.printf("%d <= %d\n", numero1, numero2);
        }

        if(numero1 >= numero2){ //mayor igual que
            System.out.printf("%d >= %d\n", numero1, numero2);
        }

    }
}
