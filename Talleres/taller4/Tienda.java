package taller4;

// Clase abstracta Calculo
abstract class Calculo {
    private String producto;
    private int cantidad;
    private int precio;
   
    // Constructor
    public Calculo(String producto, int cantidad, int precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
   
    // Getters
    public String getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
    public int getPrecio() { return precio; }

    // Métodos abstractos para cálculo de impuestos y nombre del impuesto
    abstract double calcularImpuesto();
    abstract String obtenerNombreImpuesto();
}

// Clase para calcular IVA
class CalculoImpuesto extends Calculo {
    private static final double IVA = 0.19;

    public CalculoImpuesto(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }

    @Override
    public double calcularImpuesto() {
        return getPrecio() * getCantidad() * IVA;
    }

    @Override
    public String obtenerNombreImpuesto() {
        return "IVA (19%)";
    }
}

// Clase para calcular Rete IVA
class CalculoImpuestoRelativa extends Calculo {
    private static final double RETE_IVA = 0.10;

    public CalculoImpuestoRelativa(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }

    @Override
    public double calcularImpuesto() {
        return getPrecio() * getCantidad() * RETE_IVA;
    }

    @Override
    public String obtenerNombreImpuesto() {
        return "Rete IVA (10%)";
    }
}

// Clase para calcular Impuesto Saludable
class CalculoImpuestoSaludable extends Calculo {
    private static final double SALUD = 0.05;

    public CalculoImpuestoSaludable(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }

    @Override
    public double calcularImpuesto() {
        return getPrecio() * getCantidad() * SALUD;
    }

    @Override
    public String obtenerNombreImpuesto() {
        return "Impuesto Saludable (5%)";
    }
}

// Clase Factura que procesa el cálculo de impuestos
class Factura {
    public void procesarImpuesto(Calculo calculo) {
        double impuesto = calculo.calcularImpuesto();
        String nombreImpuesto = calculo.obtenerNombreImpuesto();
        System.out.println("Producto: " + calculo.getProducto());
        System.out.println("Cantidad: " + calculo.getCantidad());
        System.out.println("Precio unitario: " + calculo.getPrecio());
        System.out.println("El " + nombreImpuesto + " calculado es: " + impuesto);
        System.out.println("Total con impuesto: " + (calculo.getPrecio() * calculo.getCantidad() + impuesto));
        System.out.println("-------------------------------------------");
    }
}

// Clase principal Tienda
public class Tienda {
    public static void main(String[] args) {
        String producto = "Celular";
        int cantidad = 10;
        int precio = 250;

        Factura factura = new Factura();

        // Instancias de las diferentes implementaciones de Calculo
        Calculo calculoIva = new CalculoImpuesto(producto, cantidad, precio);
        factura.procesarImpuesto(calculoIva);

        Calculo calculoReteIva = new CalculoImpuestoRelativa(producto, cantidad, precio);
        factura.procesarImpuesto(calculoReteIva);

        Calculo calculoSaludable = new CalculoImpuestoSaludable(producto, cantidad, precio);
        factura.procesarImpuesto(calculoSaludable);
    }
}
