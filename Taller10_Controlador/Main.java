package Taller10_Controlador;
class Entradas{
    private String tipo;
    private double precio;
    private boolean disponible;

    public Entradas(String tipo, double precio, boolean disponible) {
        this.tipo = tipo;
        this.precio = precio;
        this.disponible = disponible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    

    
}

class Controlador {
    public void comprarEntrada(Entradas entrada){
        if (entrada.isDisponible()) {
            entrada.setDisponible(false);
            System.out.println("Entrada Comprada");
        } else {
            System.out.println("Entrada no disponible");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Entradas entrada = new Entradas("general", 12, true);
        Controlador control = new Controlador();
        control.comprarEntrada(entrada);
        control.comprarEntrada(entrada);
    }
}
