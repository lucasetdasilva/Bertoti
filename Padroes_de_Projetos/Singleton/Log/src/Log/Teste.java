package Log;

public class Teste {
	
	public static void main(String[] args) {
		
		Log log = Log.getInstance();
		
		log.escreveLog("A aplicação foi iniciada");
		
		log.escreveLog("Processo 1 realizado com sucesso!");
		log.escreveLog("Processo 2 foi realizado com sucesso!");
		log.escreveLog("Processo 3 executado com falhas!");
		log.escreveLog("Processo 5 parou de funcionar");
		
		for (int i = 6; i <= 100; i++) {
			log.escreveLog("Processo " + i + " executado com sucesso");
		}
		
		log.fechaLog();
	}

}
