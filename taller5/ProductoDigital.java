package taller5;

public class ProductoDigital extends Producto{
    private double tamañoArchivo;

    public ProductoDigital(String nombre, double precio, int cantidad, double tamañoArchivo) {
        super(nombre, precio, cantidad);
        this.tamañoArchivo = tamañoArchivo;
    }

    

    @Override
    public double calcularCosto() {
        throw new UnsupportedOperationException("Unimplemented method 'calcularCosto'");
    }



    public double getTamañoArchivo() {
        return tamañoArchivo;
    }



    public void setTamañoArchivo(double tamañoArchivo) {
        this.tamañoArchivo = tamañoArchivo;
    }
    
}
