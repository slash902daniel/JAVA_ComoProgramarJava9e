package cap3.selfeval.cuenta;

public class Cuenta {

    private double saldo;

    public Cuenta(double saldoInicial){
        if (saldoInicial>0.0) {
            saldo = saldoInicial;
        }
    }

    public void abonar(double monto){
        saldo = saldo + monto;
    }

    public double obtenerSaldo(){
        return saldo;
    }

    public void cargar(double monto){
        if (saldo < monto) {
            System.out.printf("El monto a cargar excede el saldo de la cuenta: $%.2f\n", monto);
            return;
        }

        saldo = saldo - monto;
    }
}
