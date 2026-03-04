package cap3.resumen.autoevaluacion.empleado;

public class PruebaEmpleado {
    public static void main(String[] args) {

        Empleado emp0 = new Empleado("leo", "sanchez0", -1);
        System.out.println("Empleado0:");
        emp0.mostrarDatos();

        Empleado emp1 = new Empleado("leo", "sanchez1", 0);
        System.out.println("Empleado1:");
        emp1.mostrarDatos();

        Empleado emp2 = new Empleado("leo", "sanchez2", 1);
        System.out.println("Empleado2:");
        emp2.mostrarDatos();

        System.out.println("---------------------------");
        emp0.setSalarioMensual(-1);
        System.out.println("Empleado2: set salario -1");
        emp2.mostrarDatos();

        emp0.setSalarioMensual(0);
        System.out.println("Empleado2: set salario 0");
        emp2.mostrarDatos();

        emp0.setSalarioMensual(1);
        System.out.println("Empleado2: set salario 1");
        emp2.mostrarDatos();

    }
}
