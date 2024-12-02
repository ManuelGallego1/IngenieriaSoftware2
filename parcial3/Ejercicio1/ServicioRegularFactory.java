package parcial3.Ejercicio1;

public class ServicioRegularFactory implements AbstractFactory {
    public IServicio crearServicio() {
        return new ServicioRegularImpl();
    }
}
