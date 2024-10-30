public class Sistema {
    public static void main(String[] args) {
        INotificador notificacionSMS = new NotificacionSMS();
        INotificador notificacionWsp = new NotificacionWsp();

        Tarea tarea = new Tarea("Tarea1","Crear proyecto");

        TareaControlador controlador = new TareaControlador();

        controlador.insertar(tarea);
        controlador.leer(tarea);

        notificacionSMS.enviar();
        notificacionWsp.enviar();
    }
}
