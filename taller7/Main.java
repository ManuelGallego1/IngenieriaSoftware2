package taller7;

public class Main {
    public static void main(String[] args) {
        IservicioNotificacion serviceImpl = new servicioNotificacionImpl();
        usuarioFuncionalidad user = new usuarioFuncionalidad(serviceImpl);
        user.EnviarNotificacion();
    }
}
