package parcial3.Ejercicio5;

public class ReiniciarCelular implements Command {
    private Celular celular;

    public ReiniciarCelular(Celular celular){
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.reiniciar();
    }
    
}
