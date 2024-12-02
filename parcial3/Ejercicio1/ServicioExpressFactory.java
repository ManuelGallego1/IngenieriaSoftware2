package parcial3.Ejercicio1;

public class ServicioExpressFactory implements AbstractFactory {
    public IServicio crearServicio() {
        return new ServicioExpressImpl();
    }
}
