package parcial3.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Configuracion config = Configuracion.getInstancia();
        config.setUrl("https://mipagina.com");
        config.setUsuario("administrador");
        config.setPassword("mipagina2024");

        System.out.println("USUARIO: "+ config.getUsuario());
        System.out.println("PASSWORD: "+ config.getPassword());
        System.out.println("URL: "+ config.getUrl());
    }
}
