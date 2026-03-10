package cap3.resumen.ejercicios.factura;

public class PruebaFactura {
    public static void main(String[] args) {
        Factura mifactura1 = new Factura("a100", "algunapza1", 1, 100);
        System.out.println("Factura 1:");
        mifactura1.mostrarDatos();

        Factura mifactura2 = new Factura("a200", "algunapza2", 0, 100);
        System.out.println("Factura 2:");
        mifactura2.mostrarDatos();

        Factura mifactura3 = new Factura("a200", "algunapza3", -1, 100);
        System.out.println("Factura 3:");
        mifactura3.mostrarDatos();

        Factura mifactura4 = new Factura("a200", "algunapza4", 10, 0);
        System.out.println("Factura 4:");
        mifactura4.mostrarDatos();

        Factura mifactura5 = new Factura("a200", "algunapza5", 10, -1);
        System.out.println("Factura 5:");
        mifactura5.mostrarDatos();

    }


}
