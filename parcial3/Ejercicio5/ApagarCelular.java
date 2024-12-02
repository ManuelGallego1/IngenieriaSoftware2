package parcial3.Ejercicio5;

public class ApagarCelular implements Command {
    private Celular celular;

    public ApagarCelular(Celular celular){
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.apagar();
    }
}
