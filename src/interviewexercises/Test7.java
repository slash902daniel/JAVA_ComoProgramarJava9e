package interviewexercises;

import java.util.HashMap;
import java.util.Map;

/*
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 *   lo resuelvan automáticamente.
 */
public class Test7 {

    public static void main(String[] args) {
        Test7 test7 = new Test7();
        test7.countDuplicatedWords("my text. has text AND TEXT and Text");
    }

    private void countDuplicatedWords(String inputstr) {
        // Remove any dots
        inputstr = inputstr.replace(".", "");

        // convert to uppercase
        inputstr = inputstr.toUpperCase();

        // Split per spaces to an array
        String[] myArray = inputstr.split("\\s+");

        // Create a Map using HashMap
        Map<String, Integer> m = new HashMap<>();


        for (String item : myArray) { //iterate the items and add to map
            System.out.println(item);

            if (!m.containsKey(item)) {
                 System.out.println("enter new");
                m.put(item, 1 ); // Adding key-value pairs to the map
            } else{
                 System.out.println("update");
                int val = m.get(item);
                System.out.println(val);
               m.put(item, ++val ); //update the value (note the pre-increment)
            }

            System.out.println("---------------------");
        }

        System.out.println("*****************************************");
        System.out.println(m);
        

    }

}
