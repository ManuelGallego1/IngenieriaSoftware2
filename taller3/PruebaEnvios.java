package taller3;
interface Envio {
    double calcularCosto();
}

class EnvioEstandar implements Envio {
    private double peso;
    private double distancia;

    public EnvioEstandar(double peso, double distancia) {
        this.peso = peso;
        this.distancia = distancia;
    }

    public double calcularCosto() {
        return peso * 0.5 + distancia * 0.1;
    }

    // Getters y Setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}

class EnvioExpress implements Envio {
    private double peso;
    private double distancia;

    public EnvioExpress(double peso, double distancia) {
        this.peso = peso;
        this.distancia = distancia;
    }

    public double calcularCosto() {
        return peso * 0.5 + distancia * 0.2;
    }

    // Getters y Setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}

class EnvioInternacional implements Envio {
    private double peso;
    private double distancia;

    public EnvioInternacional(double peso, double distancia) {
        this.peso = peso;
        this.distancia = distancia;
    }

    public double calcularCosto() {
        return peso * 0.5 + distancia * 0.5 + 500;
    }

    // Getters y Setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}



public class PruebaEnvios {
    public double calcular(Envio envio){
        return envio.calcularCosto();
    }
    public static void main(String[] args) {
        PruebaEnvios calculo = new PruebaEnvios();
        Envio envioEstandar = new EnvioEstandar(10, 102);
        Envio envioExpress = new EnvioExpress(10, 102);
        Envio envioInternacional = new EnvioInternacional(10, 102);
        
        System.out.println("Resultado 1 : " + calculo.calcular(envioEstandar));
        System.out.println("Resultado 2 : " + calculo.calcular(envioExpress));
        System.out.println("Resultado 3 : " + calculo.calcular(envioInternacional));

    }
}
