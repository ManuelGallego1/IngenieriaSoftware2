package taller8;

public class envios {
    private IServicioEmail ServicoEmail;

    public envios(IServicioEmail servicoEmail) {
        ServicoEmail = servicoEmail;
    }

    public void enviarEmail(Email email){
        ServicoEmail.enviarEmail(email);
    }
}
