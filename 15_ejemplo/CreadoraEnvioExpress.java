public class CreadoraEnvioExpress extends Creadora {

    @Override
    public ServicioEnvio crearServicioEnvio() {
        return new EnvioExpress();
    }
    
}
