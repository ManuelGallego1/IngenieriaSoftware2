package parcial3.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        NuevoSistema nuevoSistema = new NuevoSistema("Alejandro", "1054857921", "alejo@gmail.com");

        SistemaAntiguo sistemaAntiguo = new Adapter(nuevoSistema);
        sistemaAntiguo.iniciarSesion();
        sistemaAntiguo.validarEmail();
        sistemaAntiguo.autorizarPago();
        sistemaAntiguo.realizarPago();
    }
}
