package interview;

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
public class Test3 {

    public static void main(String[] args) {
        Test3 myTest3 = new Test3();
        myTest3.setFib();
    }

    public void setFib(){
        int n0 = 0;
        int n1 = 1;

        for (int i = 0; i < 50; i++) {
            System.out.println("Iteration: " + i  + ": " + n0);

            int fib = n0 + n1;
            n0 = n1;
            n1 = fib;
            
        }


    }
}
