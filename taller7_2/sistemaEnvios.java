package taller7_2;

public class sistemaEnvios {
    private IprocesarOrdenFedEX IordenFedEX;
    private IprocesarOrdenUPS IordenUPS;
    private IprocesarOrdenDHL IordenDHL;

    

    public sistemaEnvios(IprocesarOrdenFedEX iordenFedEX, IprocesarOrdenUPS iordenUPS, IprocesarOrdenDHL iordenDHL) {
        IordenFedEX = iordenFedEX;
        IordenUPS = iordenUPS;
        IordenDHL = iordenDHL;
    }
    
    public void EnviarOrdenFedEX(Orden orden){
        IordenFedEX.enviarOrden(orden);
    }

    public void EnviarOrdenDHL(Orden orden){
        IordenDHL.EnviarOrden(orden);
    }

    public void CancelarOrdenDHL(){
        IordenDHL.CancelarOrden();
    }

    public void EnviarOrdenUPS(Orden orden){
        IordenUPS.EnviarOrden(orden);
    }

    public void VerificarPedido(){
        IordenUPS.VerificarPedido();
    }


}
