package taller7_2;

public class procesarOrdenFedEXImpl implements IprocesarOrdenFedEX  {

    @Override
    public void enviarOrden(Orden orden) {
        System.out.println("-----------FedEX-------------");
        System.out.println(orden.getFecha());
        System.out.println(orden.getLugarOrigen());
        System.out.println(orden.getLugarDestino());
    }
    
}
