package parcial3.Ejercicio5;

public class SuspenderComputador implements Command{
    private Computador computador;

    public SuspenderComputador(Computador computador){
        this.computador = computador;
    }

    @Override
    public void execute() {
        computador.suspender();
    }
    
}
