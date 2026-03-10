package cap3.resumen.ejercicios.fecha;

/** 
 * Ejercicio 3.15
*/
public class Fecha {
    private int mes;
    private int dia;
    private int año;

    public Fecha(int mes, int dia, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    } 

    public void mostrarFecha() {
        System.out.printf("La fecha es: %d/%d/%d",getMes(), getDia(), getAño()); 
    } 

}
