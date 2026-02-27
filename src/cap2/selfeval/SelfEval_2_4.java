package cap2.selfeval;


public class SelfEval_2_4 {
    public static void main(String[] args) {
        baseFix();


    }

    public static void base(){
        int c = 5;

        if (c<7) ;
        System.out.println("C es menor que 7");

        if(c => 7)
        System.out.println("c es igual o mayor que 7");
    }

    public static void baseFix(){
        int c = 8;

        if (c<7) //remover ;
        System.out.println("C es menor que 7");

        if(c >= 7) //orden de comparacion erroneo
        System.out.println("c es igual o mayor que 7");
    }
}
