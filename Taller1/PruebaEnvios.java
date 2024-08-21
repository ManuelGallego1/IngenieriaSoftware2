interface envio {

    double calcularCosto(double peso, double distancia);
    
}

class envioEstandar implements envio {
    public double calcularCosto(double peso, double distancia){
        return peso * 0.5 + distancia * 0.1;
    }
}

class envioExpress implements envio {
    public double calcularCosto(double peso, double distancia){
        return peso * 0.5 + distancia * 0.2;
    }
}

class envioInternacional implements envio {
    public double calcularCosto(double peso, double distancia){
        return peso * 0.5 + distancia * 0.5 + 500;
    }
}

public class PruebaEnvios {
    public static void main(String[] args) {
        envio envioEstandar = new envioEstandar();
        envio envioExpress = new envioExpress();
        envio envioInternacional = new envioInternacional();

        double peso = 10; // en kg
        double distancia = 200; // en km

        System.out.println("Costo del envío estándar: $" + envioEstandar.calcularCosto(peso, distancia));
        System.out.println("Costo del envío express: $" + envioExpress.calcularCosto(peso, distancia));
        System.out.println("Costo del envío internacional: $" + envioInternacional.calcularCosto(peso, distancia));
    }
}