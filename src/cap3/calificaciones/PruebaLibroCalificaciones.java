package cap3.calificaciones;

import java.util.Scanner;

/**
 * Fig 3.11?
 */
public class PruebaLibroCalificaciones {

    public static void main( String[] args){
        //Scanner entrada = new Scanner(System.in);

        LibroCalificaciones miLibroCalificaciones1 = new LibroCalificaciones("CS101 - Intro...");
        LibroCalificaciones miLibroCalificaciones2 = new LibroCalificaciones("CS102 - Intro...", "Sue Green");

        System.out.printf("El nombre inicial del curso1 es: %s\nEl instructor es %s\n", miLibroCalificaciones1.obtenerNombreDelCurso(),"");
        System.out.printf("El nombre inicial del curso2 es: %s\nEl instructor es %s\n", miLibroCalificaciones2.obtenerNombreDelCurso(),"");

        //System.out.println("Escribe el nombre del curso:");
        //String nombreDelCurso = entrada.nextLine();
        //System.out.println();

        //miLibroCalificaciones1.establecerNombreDelCurso(nombreDelCurso);
        //miLibroCalificaciones1.mostrarMensaje();
    }
}
