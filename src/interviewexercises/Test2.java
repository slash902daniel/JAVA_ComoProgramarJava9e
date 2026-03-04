package interviewexercises;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
public class Test2 {
    public static void main(String[] args) {
        Test2 myclass= new Test2(); 
        System.out.println(myclass.isAnagram("leo","oel"));
    }

    public boolean isAnagram(String valueA, String valueB){
        StringBuilder valueARevert = new StringBuilder(valueA);
        valueARevert = valueARevert.reverse();
        //System.out.println("valueARevert: " + valueARevert);
        //System.out.println("valueB: " + valueB);

        if(valueARevert.toString().equals(valueB) ){
            return true;
        }
        
        return false;
    }
}
