package eje3;

public class FacturaElectronica extends Factura {

    private String correo;

    public FacturaElectronica(String codigo, double total, Cliente cliente, String correo) {
        super(codigo, total, cliente);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
