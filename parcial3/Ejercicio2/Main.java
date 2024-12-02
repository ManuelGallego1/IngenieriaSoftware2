package parcial3.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Hamburguesa hamburguesa = new Hamburguesa.Builder()
            .setTipoCarne("Angus")
            .setTipoTomate("Cheddar")
            .setTipoQueso("Mozzarela")
            .setTipoPan("Artesanal")
            .build();

        System.out.println(hamburguesa);
    }
}
