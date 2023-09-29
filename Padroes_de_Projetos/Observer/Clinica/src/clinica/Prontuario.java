package clinica;

public class Prontuario implements Observer{

	
	public void update(double novoPeso, double novaAltura) {
		exibirProntuario(novoPeso, novaAltura);
		
	}
	
	public void exibirProntuario(double peso, double altura) {
		System.out.println("O peso atual é: "+ peso + " quilos");
		System.out.println("A altura atual é: "+ altura + " metros");
		
	}

}
