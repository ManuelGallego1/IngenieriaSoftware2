package taller8;

public class Main {
    public static void main(String[] args) {
        IServicioEmail yahoo = new EmailYahooImpl();
        IServicioEmail gmail = new EmailGmailImpl();
        IServicioEmail outlook = new EmailOutlookImpl();

        Email emailyahoo = new EmailYahoo("YAHOO","Alejo","Email","File");
        envios enviosYahoo = new envios(yahoo);
        enviosYahoo.enviarEmail(emailyahoo);

        Email emailGmail = new EmailGmail("GMAIL", "Alejo", "Email", "IMG");
        envios enviosGmail = new envios(gmail);
        enviosGmail.enviarEmail(emailGmail);

        Email emailOutlook = new EmailOutlook("Outlook", "Alejo", "Email");
        envios enviosOutlook = new envios(outlook);
        enviosOutlook.enviarEmail(emailOutlook);


    }
}
 