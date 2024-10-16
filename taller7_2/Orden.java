package taller7_2;

public class Orden {
    private String LugarOrigen;
    private String LugarDestino;
    private String Fecha;
    
    public Orden(String lugarOrigen, String lugarDestino, String fecha) {
        LugarOrigen = lugarOrigen;
        LugarDestino = lugarDestino;
        Fecha = fecha;
    }
    public String getLugarOrigen() {
        return LugarOrigen;
    }
    public void setLugarOrigen(String lugarOrigen) {
        LugarOrigen = lugarOrigen;
    }
    public String getLugarDestino() {
        return LugarDestino;
    }
    public void setLugarDestino(String lugarDestino) {
        LugarDestino = lugarDestino;
    }
    public String getFecha() {
        return Fecha;
    }
    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    
}
