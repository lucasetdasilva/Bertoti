package mvc;

public class View implements Observer{
	
	public void update(String mensagem) {
		System.out.println("Visualização de Voo recebeu notificação: " + mensagem);
	}

}
