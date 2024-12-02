package parcial3.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factoryExpress = new ServicioExpressFactory();
        IServicio servicioExpress = factoryExpress.crearServicio();
        servicioExpress.enviar("Paquete 1");

        AbstractFactory factoryRegular = new ServicioRegularFactory();
        IServicio servicioRegular = factoryRegular.crearServicio();
        servicioRegular.enviar("Paquete 2");
    }
}