package cap3.resumen.ejercicios.calificaciones;

/**
 * Ejercicio 3.11
 */
public class LibroCalificaciones {

    private String nombreDelCurso;
    private String nombreDelInstructor;

    public String getNombreDelInstructor() {
        return nombreDelInstructor;
    }

    public void setNombreDelInstructor(String nombreDelInstructor) {
        this.nombreDelInstructor = nombreDelInstructor;
    }

    public LibroCalificaciones(String nombre){
        nombreDelCurso = nombre;
    }

    public LibroCalificaciones(String nombre, String instructor){
        nombreDelCurso = nombre;
        nombreDelInstructor = instructor;
    }

    public void establecerNombreDelCurso(String nombre){
        nombreDelCurso = nombre;
    }

    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }

    public void mostrarMensaje(){
        System.out.printf("Bienvenido al libro de calificaciones para\n%s!\nEste curso es presentado por: %s\n", obtenerNombreDelCurso(),getNombreDelInstructor());
    }

}
