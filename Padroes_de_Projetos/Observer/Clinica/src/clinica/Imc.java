package clinica;

public class Imc implements Observer{

	
	public void update(double novoPeso, double novaAltura) {
		System.out.println("O IMC é: " + calcularImc(novoPeso, novaAltura));
		
	}
	
	public double calcularImc(double peso, double altura) {
		
		double imc;
		
		imc = (peso) / (altura * altura);
			
		return imc;
	}

}
