package taller6_2;

public class paquetePequeño extends paquete implements Ipaquete {

    private double valorDeclarado;

    public paquetePequeño(double peso, String dimension, double valorDeclarado) {
        super(peso, dimension);
        this.valorDeclarado = valorDeclarado;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    @Override
    public void calcularCosto() {
        double costoBase = 5.0;  
        double costoPorPeso = getPeso() * 2.0;  
        double costoPorValor = valorDeclarado * 0.01;
        double costoTotal = costoBase + costoPorPeso + costoPorValor;
        
        System.out.println("El costo de envío del paquete pequeño es: $" + costoTotal);
    }
}
