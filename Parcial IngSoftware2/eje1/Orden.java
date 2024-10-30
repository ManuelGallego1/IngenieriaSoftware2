package eje1;
public class Orden {
    public double calcularImpuesto(double precio){
        double impuesto = precio * 0.1;
        return impuesto;
    }

    public double calcularDescuento(double precio, double descuento){
        double precioDescuento = precio - descuento;
        return precioDescuento + calcularImpuesto(precioDescuento);
    }
}
