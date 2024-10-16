package taller7_2;

public class Main {
    public static void main(String[] args) {
        IprocesarOrdenFedEX FedEX = new procesarOrdenFedEXImpl();
        IprocesarOrdenDHL DHL = new procesarOrdenDHL();
        IprocesarOrdenUPS UPS = new procesarOrdenUPS();
        
        sistemaEnvios sistema = new sistemaEnvios(FedEX, UPS, DHL);

        Orden orden = new Orden("Manizales", "Pereira", "04/09/2024");

        sistema.EnviarOrdenFedEX(orden);

        sistema.EnviarOrdenDHL(orden);
        sistema.CancelarOrdenDHL();

        sistema.EnviarOrdenUPS(orden);
        sistema.VerificarPedido();


    }
}
