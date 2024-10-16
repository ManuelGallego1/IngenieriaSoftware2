package taller13_VariacionesProtegidas;

public class CanalSMS implements INotificacion{
    
    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        System.out.println("ENVIANDO NOTIFICACION POR SMS");
    }
    
}
