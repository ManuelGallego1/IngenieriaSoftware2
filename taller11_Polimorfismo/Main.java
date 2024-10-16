package taller11_Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Chevrolet", "Onix Rs");
        Avion avion = new Avion("Delta", "Boeing 737");
        Bicicleta bicicleta = new Bicicleta("Specialited", "Ruta");

        Garaje garaje = new Garaje();

        garaje.estacionar(coche);
        garaje.estacionar(avion);
        garaje.estacionar(bicicleta);
    }
}
