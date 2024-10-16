package Taller10_Escritor;

import java.util.ArrayList;
import java.util.List;

class Computadora{
    private String procesador;
    private String tarjetaGrafica;
    private int ram;

    public Computadora(String procesador, String tarjetaGrafica, int ram) {
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public int getRam() {
        return ram;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }
}

class FabricaComputadoras {
    public Computadora crearComputadora(String procesador, String tarjetaGrafica, int ram) {
        return new Computadora(procesador, tarjetaGrafica, ram);
    }
}



class Orden {
    private List<Computadora> computadoras = new ArrayList<>();
    private FabricaComputadoras fabricaComputadoras = new FabricaComputadoras();

    public void agregarComputadora(String procesador, String tarjetaGrafica, int ram) {
        Computadora computadora = fabricaComputadoras.crearComputadora(procesador, tarjetaGrafica, ram);
        computadoras.add(computadora);
    }

    public int calcularTotalComputadoras() {
        return computadoras.size();
    }

    public List<Computadora> getComputadoras() {
        return computadoras;
    }
}

public class Main{
    public static void main(String[] args) {
        Orden orden = new Orden();
        orden.agregarComputadora("Intel i5", "NVIDIA GTX 720", 8);
        orden.agregarComputadora("AMD Ryzen 7", "AMD Radeon RX 580", 16);

        System.out.println("Total de Computadoras: " + orden.calcularTotalComputadoras());
    }
}
    