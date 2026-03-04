package cap2.guia;

public class Bienvenido1 {
   
    //Simple comment

    /*multiple
    line
    comment */

    /**
     * Javadoc comment
     * @param args
     * @throws Exception
     */
        public static void main(String[] args) throws Exception {
        System.out.println("1 Bienvenido a la programacion en java!");

        //fig 2.3 mix
        System.out.println("2Bienvenido a la");
        System.out.println("2programacion en java!"); 

        System.out.print("3Bienvenido a la");
        System.out.print("3programacion en java!"); 
        
        //fig 2.4
        System.out.println();
        System.out.println("4Bienvenido\na\nla programacion\nen java!");

        //fig 2.6
        System.out.printf("%s\n%s", "5Bienvenido a", "la programacionen java!");

    }
}
