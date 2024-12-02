package parcial3.Ejercicio5;

public class EncenderComputador implements Command{
    private Computador computador;

    public EncenderComputador(Computador computador){
        this.computador = computador;
    }

    @Override
    public void execute() {
        computador.encender();
    }
    
}
