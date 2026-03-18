public class Main {
    public static void main(String[] args) {

        NotificacaoFactory factory;

        String tipo = "email"; 

        if (tipo.equalsIgnoreCase("email")) {
            factory = new EmailFactory();
        } else if (tipo.equalsIgnoreCase("sms")) {
            factory = new SMSFactory();
        } else if (tipo.equalsIgnoreCase("push")) {
            factory = new PushFactory();
        } else {
            throw new IllegalArgumentException("Tipo de notificação inválido");
        }

        Notificacao notificacao = factory.criarNotificacao();
        notificacao.enviar("Olá, cliente!");
    }
}