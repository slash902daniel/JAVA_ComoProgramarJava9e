package cap3.resumen.autoevaluacion.cuenta;

import java.util.Scanner;

public class PruebaCuenta {

    public static void main(String[] args){
        Cuenta cuenta1 = new Cuenta(50.00);
        Cuenta cuenta2 = new Cuenta(-7.53);

        System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta2: $%.2f\n\n", cuenta2.obtenerSaldo());

        Scanner entrada = new Scanner(System.in);
        double montoDeposito;
        double montoCargar;

        System.out.print("Escriba el monto para depositar a la cuenta1: ");
        montoDeposito = entrada.nextDouble();
        
        System.out.printf("\nSumando $%.2f al saldo de la cuenta1:\n\n", montoDeposito);
        cuenta1.abonar(montoDeposito);

        System.out.printf("Saldo de la cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
        System.out.printf("Saldo de la cuenta2: $%.2f\n\n", cuenta2.obtenerSaldo());

        System.out.print("Escriba el monto para depositar a la cuenta2: ");
        montoDeposito = entrada.nextDouble();
        
        System.out.printf("\nSumando $%.2f al saldo de la cuenta2:\n\n", montoDeposito);
        cuenta2.abonar(montoDeposito);

        System.out.printf("Saldo de la cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
        System.out.printf("Saldo de la cuenta2: $%.2f\n\n", cuenta2.obtenerSaldo());


        System.out.print("Escriba el monto para cargar a la cuenta1: ");
        montoCargar = entrada.nextDouble();
        cuenta1.cargar(montoCargar);

        System.out.print("Escriba el monto para cargar a la cuenta2: ");
        montoCargar = entrada.nextDouble();
        cuenta2.cargar(montoCargar);

        System.out.printf("Saldo de la cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
        System.out.printf("Saldo de la cuenta2: $%.2f\n\n", cuenta2.obtenerSaldo());
    }
}
