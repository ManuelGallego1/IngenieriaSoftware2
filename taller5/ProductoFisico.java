package taller5;

class ProductoFisico extends Producto{

    public ProductoFisico(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    @Override
    public double calcularCosto() {
        throw new UnsupportedOperationException("Unimplemented method 'calcularCosto'");
    }
}
