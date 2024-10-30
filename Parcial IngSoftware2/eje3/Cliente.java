package eje3;

public class Cliente {
    private int cc;
    private String nombre;

    public Cliente(int cc, String nombre) {
        this.cc = cc;
        this.nombre = nombre;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
