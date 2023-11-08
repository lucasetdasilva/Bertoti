package mensageiro;

public class Teste {
	
	public static void main(String[] args) {
		
		Mensageiro m = new Mensageiro();
		
		m.enviarMensagem("Lucas", "Olá, tudo bem?", "email");
		System.out.println();
		m.enviarMensagem("Júlia", "Me responde!", "notificacao");
		System.out.println();
		m.enviarMensagem("Silas", "E o pix? Nada ainda?", "sms");
		System.out.println();
		m.enviarMensagem("Emanoel", "Teste 1, 2, 3...", "instagram");
		
	}

}
