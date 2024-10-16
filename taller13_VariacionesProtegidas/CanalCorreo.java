package taller13_VariacionesProtegidas;

public class CanalCorreo implements INotificacion {

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        System.out.println("ENVIANDO NOTIFICACION POR CORREO");
    }
    
}
