/*
Compilacion por cli:
dir  javac name.java
*genera archivo .class

Ejecucion:
dir  java name arg1 arg2
     java App leo dany lucia


*si esta dentro de un package.. NO como este ejemplo.. usar el path enpaquetado..
https://www-freecodecamp-org.translate.goog/news/how-to-execute-and-run-java-code/?_x_tr_sl=en&_x_tr_tl=es&_x_tr_hl=es&_x_tr_pto=tc

*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World APP JAVA!");

        //Print args
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
