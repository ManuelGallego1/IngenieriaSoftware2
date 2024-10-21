public class Main {
    public static void main(String[] args) {
        Creadora creadora = new CreadoraEnvioExpress();
        ServicioEnvio servicioEnvio = creadora.crearServicioEnvio();
        servicioEnvio.enviar("Paquete");

    }
}
