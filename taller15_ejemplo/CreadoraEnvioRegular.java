public class CreadoraEnvioRegular extends Creadora{

    @Override
    public ServicioEnvio crearServicioEnvio() {
        return new EnvioRegular();
    }
    
}
