package taller5;

abstract class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public abstract double calcularCosto();

    public Producto(String nombre,double precio, int cantidad){
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}
