package parcial3.Ejercicio5;

public class EncenderCelular implements Command{
    private Celular celular;

    public EncenderCelular(Celular celular){
        this.celular = celular; 
    }

    @Override
    public void execute() {
        celular.encender();
    }
    
}
