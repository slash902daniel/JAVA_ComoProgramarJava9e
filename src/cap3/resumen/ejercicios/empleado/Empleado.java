package cap3.resumen.ejercicios.empleado;

/**
 * Ejercicio 3.14
 */
public class Empleado {
    private String primerNombre;
    private String primerApellido;
    private double salarioMensual;

    public Empleado(String primerNombre, String primerApellido, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.checkAndSetSalarioMensual(salarioMensual);
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.checkAndSetSalarioMensual(salarioMensual);
    }

    private void checkAndSetSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0) {
            System.out.println("insideif");
            this.salarioMensual = salarioMensual;
        }
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void mostrarDatos() {
        System.out.printf("Empleado - Nombre Completo: %s %s\nSalario Mensual: $%s\n\n", getPrimerNombre(),
                getPrimerApellido(), getSalarioMensual());
    }

}
