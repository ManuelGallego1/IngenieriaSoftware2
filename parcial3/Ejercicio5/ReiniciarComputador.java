package parcial3.Ejercicio5;

public class ReiniciarComputador implements Command{
    private Computador computador;

    public ReiniciarComputador(Computador computador){
        this.computador = computador;
    }
    
    @Override
    public void execute() {
        computador.reiniciar();
    }
    
}
