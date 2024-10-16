package taller13_VariacionesProtegidas;

public class Main {
    public static void main(String[] args) {
        Notificacion notificacion = new Notificacion("Hola", "Mundo");
        INotificacion Inotificacion = new CanalSMS();
        ServicioNotificacion servico = new ServicioNotificacion(Inotificacion);
        servico.Notificador(notificacion);
    }
}
