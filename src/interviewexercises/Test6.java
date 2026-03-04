package interviewexercises;

/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
public class Test6 {

    public static void main(String[] args) {
        Test6 test6 = new Test6();
         System.out.println(test6.reverse("leonardo"));
         System.out.println(test6.recursiveReverse("leonardo", , ""));
    }

    private String reverse(String myStr){
        int myStrSize = myStr.length() - 1;
        //System.out.println("myStrSize: " + myStrSize);

       String myStrReversed = "";

       for (int i = myStrSize; i > -1; i--) {
            myStrReversed = myStrReversed + myStr.charAt(i);
       }

       return myStrReversed;

    }

    private String recursiveReverse(String myStr, int index, String reversedText){

        return "todo";

    }
}
