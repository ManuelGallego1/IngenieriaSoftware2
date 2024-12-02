package parcial3.Ejercicio3;

public class Adapter implements SistemaAntiguo {

    private final NuevoSistema nuevoSistema;

    public Adapter(NuevoSistema nuevoSistema){
        this.nuevoSistema = nuevoSistema;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("Creando una sesion para: " + nuevoSistema.getNombre());
    }

    @Override
    public void validarEmail() {
        System.out.println("Validando el email: " + nuevoSistema.getCorreo());
    }

    @Override
    public void autorizarPago() {
        System.out.println("Autorizando pago: " + nuevoSistema.getIdentificacion());
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago realizado con exito " + nuevoSistema.getNombre());
    }
    
}
