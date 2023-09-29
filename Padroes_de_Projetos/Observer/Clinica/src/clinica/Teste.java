package clinica;

public class Teste {
	
	public static void main(String[]args) {
		
		Paciente lucas = new Paciente();
		lucas.setPeso(87.0);
		lucas.setAltura(1.76);
		
		Prontuario pront = new Prontuario();
		Imc imc = new Imc();
		
		lucas.addObserver(pront);
		lucas.addObserver(imc);
		
		lucas.setDados(79, 1.90);
		
		
		
		
		
		
	}

}
