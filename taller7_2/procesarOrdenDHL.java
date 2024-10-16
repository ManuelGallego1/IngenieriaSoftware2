package taller7_2;

public class procesarOrdenDHL implements IprocesarOrdenDHL{

    @Override
    public void EnviarOrden(Orden orden) {
        System.out.println("-----------DHL-------------");
        System.out.println(orden.getFecha());
        System.out.println(orden.getLugarOrigen());
        System.out.println(orden.getLugarDestino());
    }

    @Override
    public void CancelarOrden() {
        System.err.println("PEDIDO CANCELADO");
    }
    
}
