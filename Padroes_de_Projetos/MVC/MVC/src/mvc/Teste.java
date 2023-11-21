package mvc;

public class Teste {

	 public static void main(String[] args) {
		 
	        Compra compra = new CompraEspecial();
	        Compra compra2 = new CompraEstudante();

	        ComponenteComposto itinerarioVoo = new ItinerarioVoo();
	        Model modeloVoo = new Model(itinerarioVoo);
	        View visualizacaoVoo = new View();

	        modeloVoo.adicionarObservador(visualizacaoVoo);

	        modeloVoo.setCompra(compra);
	        modeloVoo.setCompra(compra2);

	        Controller controladorVoo = new Controller(modeloVoo);
	        
	        modeloVoo.processarPagamento(1000.0,"Lucas");
	        modeloVoo.processarPagamento(1700.0,"Julia");
	        
	        
	        
	    }
	
}
