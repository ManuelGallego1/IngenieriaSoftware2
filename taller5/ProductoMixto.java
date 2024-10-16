package taller5;

public class ProductoMixto extends Producto{

    public ProductoMixto(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    @Override
    public double calcularCosto() {
        throw new UnsupportedOperationException("Unimplemented method 'calcularCosto'");
    }
    
}
