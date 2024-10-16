package taller7;

public class usuarioFuncionalidad {
    private IservicioNotificacion Iservicio;

    public usuarioFuncionalidad(IservicioNotificacion Iservicio) {
        this.Iservicio = Iservicio;
    }

    public void EnviarNotificacion(){
        Iservicio.EnviarCorreo();
    }
}
