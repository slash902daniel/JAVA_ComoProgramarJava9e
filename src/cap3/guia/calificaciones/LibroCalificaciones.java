package cap3.guia.calificaciones;

public class LibroCalificaciones {

    private String nombreDelCurso;

    public LibroCalificaciones(String nombre){
        nombreDelCurso = nombre;
    }

    public LibroCalificaciones(String nombre, String instructor){
        nombreDelCurso = nombre;
        nombreDelCurso = instructor;
    }

    public void establecerNombreDelCurso(String nombre){
        nombreDelCurso = nombre;
    }

    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }

    public void mostrarMensaje(){
        System.out.printf("Bienvenido al libro de calificaciones para\n%s!\n", obtenerNombreDelCurso());
    }

}
