package taller8;

public class EmailYahooImpl implements Iemail {

    @Override
    public void enviarEmail(Email email) {
        EmailYahoo yahoo = (EmailYahoo) email;
        System.err.println("ENVIANDO CORREO GMAIL");
    }
    
}
