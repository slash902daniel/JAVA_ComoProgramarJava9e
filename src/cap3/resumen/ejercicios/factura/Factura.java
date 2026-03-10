package cap3.resumen.ejercicios.factura;

/** 
 * Ejercicio 3.13
*/
public class Factura {
    private String numeroDePieza;
    private String descripcionDePieza;
    private int cantidad;
    private double precioUnitario;

    public Factura(String numeroDePieza, String descripcionDePieza, int cantidad, double precioUnitario) {
        this.numeroDePieza = numeroDePieza;
        this.descripcionDePieza = descripcionDePieza;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getNumeroDePieza() {
        return numeroDePieza;
    }

    public void setNumeroDePieza(String numeroDePieza) {
        this.numeroDePieza = numeroDePieza;
    }

    public String getDescripcionDePieza() {
        return descripcionDePieza;
    }

    public void setDescripcionDePieza(String descripcionDePieza) {
        this.descripcionDePieza = descripcionDePieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double obtenerMontoFactura() {
        int newcantidad;
        double newprecioUnitario;

        if (cantidad < 0) {
            newcantidad = 0;
        } else {
            newcantidad = cantidad;
        }

        if (precioUnitario < 0) {
            newprecioUnitario = 0.0;
        } else {
            newprecioUnitario = precioUnitario;
        }

        return newcantidad * newprecioUnitario;
    }
    
    public void mostrarDatos() {
        System.out.printf("El monto de la factura es: $%.2f\n\n",obtenerMontoFactura());
    }

}
