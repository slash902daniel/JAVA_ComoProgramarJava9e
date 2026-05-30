package cap1.guia;


/*
Compilacion por cli:
dir  javac -d . Bienvenido.java 
*genera archivo .class dentro de otra estructura cap1.guia.filename

Ejeucion
dir java cap1.guia.Bienvenido


*si esta dentro de un package.. como este ejemplo.. usar el path enpaquetado..
https://www-freecodecamp-org.translate.goog/news/how-to-execute-and-run-java-code/?_x_tr_sl=en&_x_tr_tl=es&_x_tr_hl=es&_x_tr_pto=tc

*/

public class Bienvenido {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! From package");
    } 
}
