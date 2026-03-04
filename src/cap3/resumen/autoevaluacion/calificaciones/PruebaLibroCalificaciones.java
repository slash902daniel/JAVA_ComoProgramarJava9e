package cap3.resumen.autoevaluacion.calificaciones;

import java.util.Scanner;

public class PruebaLibroCalificaciones {

    public static void main( String[] args){
        //Scanner entrada = new Scanner(System.in);

        LibroCalificaciones miLibroCalificaciones1 = new LibroCalificaciones("CS101 - Intro...","Teacher1");
        LibroCalificaciones miLibroCalificaciones2 = new LibroCalificaciones("CS102 - Intro...","Teacher2");
        
        miLibroCalificaciones1.mostrarMensaje();
        miLibroCalificaciones2.mostrarMensaje();

    }
}
