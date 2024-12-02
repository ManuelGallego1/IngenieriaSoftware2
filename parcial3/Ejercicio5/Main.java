package parcial3.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador();
        Celular celular = new Celular();
        Command apagarCelular = new ApagarCelular(celular);
        apagarCelular.execute();
        Command encenderComputador = new EncenderComputador(computador);
        encenderComputador.execute();
        Command reiniciarCelular = new ReiniciarCelular(celular);
        reiniciarCelular.execute();
        Command suspenderComputador = new SuspenderComputador(computador);
        suspenderComputador.execute();
    }
}
