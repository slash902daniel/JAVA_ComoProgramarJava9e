package cap2.resumen.ejercicios;

public class Ejercicios_p2_14 {
    public static void main(String[] args) {
        ejercicio_2_14_a();
        System.out.println("-------------------------------------------");
        ejercicio_2_14_b();
        System.out.println("-------------------------------------------");
        ejercicio_2_14_c();
        System.out.println("-------------------------------------------");

    }

    // Ejercicio 2_14
    public static void ejercicio_2_14_a() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println(a + " " + b + " " + c + " " + d);
    }

    public static void ejercicio_2_14_b() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
        System.out.print(d + " ");
        System.out.println();

    }

    public static void ejercicio_2_14_c() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.printf("%d %d %d %d", a, b, c, d);
        System.out.println();
    }

}
