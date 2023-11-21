package mvc;

public class ReservaPassagem implements Observer {

	private String nomePassageiro;
	
	public ReservaPassagem(String nomePassageiro) {
		this.nomePassageiro = nomePassageiro;
	}
	
	public void update(String mensagem) {
		System.out.println(nomePassageiro + " recebeu notificação: " + mensagem);
	}
	
	
}
