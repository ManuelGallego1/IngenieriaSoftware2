package taller6;

public class dvd implements libreriaDVD{
    private String titulo;
    private int stock;

    
    public dvd(String titulo, int stock) {
        this.titulo = titulo;
        this.stock = stock;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getStock() {
        return stock;
    }


    public void setStock(int stock) {
        this.stock = stock;
    }


    @Override
    public void prestar() {
        if (stock > 0) {
            stock--;
            System.out.println("Libro prestado. Stock restante: " + stock);
        } else {
            System.out.println("No hay stock disponible para prestar.");
        }
    }

    @Override
    public void devolver() {
        stock++;
        System.out.println("Libro devuelto. Stock actual: " + stock);
    }

    
}
