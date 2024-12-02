package parcial3.Ejercicio5;

public class SuspenderCelular implements Command {
    private Celular celular;

    public SuspenderCelular(Celular celular){
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.suspender();
    }
    
}
