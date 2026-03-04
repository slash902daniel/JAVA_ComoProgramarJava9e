package interviewexercises;

/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
public class Test5 {

    public static void main(String[] args) {
            Test5 test5 = new Test5();

            Polygon triangleP = new Triangle(5, 10);
            Polygon squareP = new Square(10);
            Polygon rectangleP = new Rectangle  (10, 5);

            test5.area(triangleP);
            test5.area(squareP);
            test5.area(rectangleP);

    }


    private double area (Polygon polygon){
        polygon.printArea();
        return polygon.area();
    }

    public interface Polygon {
        double area();
        void printArea();
    }

    public static class Triangle implements Polygon{
        double base;
        double height;

        public Triangle(double base, double height){
            this.base = base;
            this.height = height;

        }

        @Override
        public double area() {
            return this.base * this.height / 2;
        }

        @Override
        public void printArea() {
            System.out.println("El area del triangulo es: " + area() );
        }

    }

    public static class Square implements Polygon{
        double side;

        public Square(double side){
            this.side = side;

        }

        @Override
        public double area() {
            return this.side * this.side;
        }

        @Override
        public void printArea() {
            System.out.println("El area del Square es: " + area() );
        }

    }


    public static class Rectangle implements Polygon{
        double lenght;
        double width;

        public Rectangle(double lenght, double width){
            this.lenght = lenght;
            this.width = width;

        }

        @Override
        public double area() {
            return this.lenght * this.width;
        }

        @Override
        public void printArea() {
            System.out.println("El area del Rectangulo es: " + area() );
        }

    }

}

