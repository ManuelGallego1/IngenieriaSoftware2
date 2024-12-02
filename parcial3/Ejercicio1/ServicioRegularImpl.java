package parcial3.Ejercicio1;

public class ServicioRegularImpl implements IServicio {

    @Override
    public void enviar(String paquete) {
        System.out.println("ENVIANDO PAQUETE REGULAR: " + paquete);
    }
    
}
