package cap3.resumen.ejercicios.empleado;

public class PruebaEmpleado {
    public static void main(String[] args) {

        Empleado emp0 = new Empleado("leo", "sanchez0", 0);
        System.out.println("Empleado0:");
        emp0.mostrarDatos();

        Empleado emp0neg = new Empleado("leo", "sanchez0neg", -1);
        System.out.println("emp0neg:");
        emp0neg.mostrarDatos();

        Empleado emp1 = new Empleado("leo", "sanchez1", 1);
        System.out.println("Empleado1:");
        emp1.mostrarDatos();

        Empleado emp2 = new Empleado("leo", "sanchez2", 10);
        System.out.println("Empleado2:");
        emp2.mostrarDatos();

        System.out.println("--------------------------- Modificar salarios-aumento");
        emp0.setSalarioMensual(-1);
        System.out.println("Empleado0: set salario -1");
        emp0.mostrarDatos();

        emp0neg.setSalarioMensual(0);
        System.out.println("Empleado0: set salario 0");
        emp0neg.mostrarDatos();

        emp1.setSalarioMensual(emp1.getSalarioMensual() * 1.1);
        System.out.println("Empleado1: set salario + 10%");
        emp1.mostrarDatos();

        emp2.setSalarioMensual(emp2.getSalarioMensual() * 1.1);
        System.out.println("Empleado2: set salario + 10%");
        emp2.mostrarDatos();
    }
}
