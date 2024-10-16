package taller6_2;

public class Main {

    public static void probarPaquete(paquete paquete) {
        if (paquete instanceof paquetePequeño) {
            System.out.println("Probando la clase paquetePequeño:");
            ((paquetePequeño) paquete).calcularCosto();
        } else if (paquete instanceof paquetePeligroso) {
            System.out.println("\nProbando la clase paquetePeligroso:");
            ((paquetePeligroso) paquete).verificarContenido();
            ((paquetePeligroso) paquete).asegurarPaquete();
        } else if (paquete instanceof paqueteGrande) {
            System.out.println("\nProbando la clase paqueteGrande:");
            ((paqueteGrande) paquete).calcularCosto();
        } else {
            System.out.println("Tipo de paquete no soportado.");
        }
    }

    public static void main(String[] args) {
        paquetePequeño miPaquetePequeño = new paquetePequeño(2.0, "20x15x10", 100.0);
        paquetePeligroso miPaquetePeligroso = new paquetePeligroso(5.0, "50x40x30", "Explosivo", false);
        paqueteGrande miPaqueteGrande = new paqueteGrande(10.0, "100x50x50", 2.5, "aéreo");

        probarPaquete(miPaquetePequeño);
        probarPaquete(miPaquetePeligroso);
        probarPaquete(miPaqueteGrande);
    }
}
