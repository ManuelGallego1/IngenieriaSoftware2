package taller13_VariacionesProtegidas;

public class ServicioNotificacion {
    INotificacion Inotificacion;

    public ServicioNotificacion(INotificacion Inotificacion) {
        this.Inotificacion = Inotificacion;
    }

    public void Notificador(Notificacion notificacion){
        Inotificacion.enviarNotificacion(notificacion);
    }

}
