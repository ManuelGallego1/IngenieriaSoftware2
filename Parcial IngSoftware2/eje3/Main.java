package eje3;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1054857921, "Alejandro Gallego");
        Factura facturaFisica = new Factura("001", 100, cliente);
        Factura facturaElectronica = new FacturaElectronica("002", 200, cliente, "alejo@gmail.com" );

        System.out.println(facturaFisica.getCodigo());
        System.out.println(facturaElectronica.getCodigo());
    }
}
