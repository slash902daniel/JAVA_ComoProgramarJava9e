package interviewexercises;

public class Test1 {

/*
 * Reto #0
 * EL FAMOSO "FIZZ BUZZ"
 * Fecha publicación enunciado: 27/12/21
 * Fecha publicación resolución: 03/01/22
 * Dificultad: FÁCIL
 * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */
    public static void main(String[] args) {
        Test1 test = new Test1();

        for (int i = 0; i <= 100; i++) {
            //System.out.print(i + " ");
            if (test.isDivByThree(i) && test.isDivByFive(i)) {
                System.out.println("fizzbuzz");
            } else if (test.isDivByThree(i)){
                System.out.println("fizz");
            } else if (test.isDivByFive(i)){
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }

    }

    public boolean isDivByThree(int index) {
      boolean divByThree =  (index % 3 == 0 ) ? true : false; 
      //System.out.println("divByThree: " + divByThree );
      return divByThree;
   }

    public boolean isDivByFive(int index) {
      boolean divByFive =  (index % 5 == 0 ) ? true : false; 
      //System.out.println("divByFive: " + divByFive );
      return divByFive;
   }

}
