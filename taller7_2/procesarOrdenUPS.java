package taller7_2;

public class procesarOrdenUPS implements IprocesarOrdenUPS {

    @Override
    public void EnviarOrden(Orden orden) {
        System.out.println("-----------UPS-------------");
        System.out.println(orden.getFecha());
        System.out.println(orden.getLugarOrigen());
        System.out.println(orden.getLugarDestino());
    }

    @Override
    public void VerificarPedido() {
        System.out.println("VERIFICANDO PEDIDO");
    }
    
}
