
package taller8_srp;

public class Producto {
    private String nombre;
    private int stock;
    private String categoria;
    private int impuesto;

    public Producto(String nombre, int stock, String categoria, int impuesto) {
        this.nombre = nombre;
        this.stock = stock;
        this.categoria = categoria;
        this.impuesto = impuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    } 
}


class ProductoDADO {
    
}
