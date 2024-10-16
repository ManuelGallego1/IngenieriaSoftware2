package taller6;


public class Main {
    public static void main(String[] args) {
        libro miLibro = new libro("Cien Años de Soledad", "imagen1.jpg", 500, 1, 3);

        System.out.println("Probando la clase libro:");
        System.out.println("Título: " + miLibro.getTitulo());
        miLibro.prestar();
        miLibro.devolver();
        miLibro.renovarPortada();
        miLibro.mantenimientoHojas();
        miLibro.solicitarVersion();

        dvd miDVD = new dvd("Inception", 5);

        System.out.println("\nProbando la clase dvd:");
        System.out.println("Título: " + miDVD.getTitulo());
        miDVD.prestar();
        miDVD.devolver();

        cartilla miCartilla = new cartilla("Manual de Java", 100, 2);

        System.out.println("\nProbando la clase cartilla:");
        System.out.println("Título: " + miCartilla.getTitulo());
        miCartilla.prestar();
        miCartilla.devolver();
        miCartilla.mantenimientoHojas();
    }
}
