package taller8;

public class EmailGmailImpl implements Iemail{

    @Override
    public void enviarEmail(Email email) {
        EmailGmail gmail = (EmailGmail) email;
        System.err.println("ENVIANDO CORREO POR GMAIL");
    }
    
}
