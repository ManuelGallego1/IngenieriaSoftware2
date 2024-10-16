public class Main {
    public void condicion(String email){
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Email Invalido");
        } else {
            System.out.println("Email Valido");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.condicion("Alejo@gmail.com");
    }
}
