package parcial3.Ejercicio5;

public class ApagarComputador implements Command {
    private Computador computador;

    public ApagarComputador(Computador computador){
        this.computador = computador;
    }

    @Override
    public void execute() {
        computador.apagar();
    }
    
}
