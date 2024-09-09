package taller8;

public class EmailOutlookImpl implements Iemail{

    @Override
    public void enviarEmail(Email email) {
        EmailOutlook outlook = (EmailOutlook) email;
        System.err.println("ENVIANDO CORREO POR OUTLOOK");
    }
    
}
