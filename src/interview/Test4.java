package interview;

/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
public class Test4 {
    public static void main(String[] args) {
        Test4  myTest4 = new Test4();

        for (int i = 0; i <= 100; i++) {
            myTest4.isPrime(i); 
        }
    }

    public boolean isPrime(int num){
        if (num <= 1) {
            return false;
        } else {
            for (int j = 2; j < Math.sqrt(num); j++) {
                //PORQUE HASTA EL CUADRADRO? La respuesta corta es por eficiencia: después de la raíz cuadrada, los factores simplemente se repiten en orden inverso, por lo que no encuentras información nueva.
                //System.out.println("sqt of " + num + ": " + Math.sqrt(num));
                if (num % j == 0) { //significa que el número tiene un divisor distinto de 1 y de sí mismo.
                    //System.out.println(num + " % " + j + " ==0" );
                    return false;
                }
            }

        System.out.println(num);
        return true;   
        }
    }
}
