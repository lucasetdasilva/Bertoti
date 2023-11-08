package mensageiro;

public class Mensageiro {
	
	private Email email;
	private Notificacao notificacao;
	private Sms sms;
	
	public Mensageiro() {
		email = new Email();
		notificacao = new Notificacao();
		sms = new Sms();
	}
	
	public void enviarMensagem(String remetente, String mensagem, String canalMensagem) {
		
		if(canalMensagem.equals("email")) {
			email.enviarEmail(remetente, mensagem);
		} else if(canalMensagem.equals("notificacao")) {
			notificacao.enviarNotificacao(remetente, mensagem);
		} else if(canalMensagem.equals("sms")) {
			sms.enviarSms(remetente, mensagem);
		}else {
			System.out.println("Canal da mensagem inválida");
		}
		
		
	}

}
