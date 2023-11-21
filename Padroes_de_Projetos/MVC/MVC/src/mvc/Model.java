package mvc;

import java.util.ArrayList;
import java.util.List;

public class Model {
	
	private ComponenteComposto itinerario;
	private Compra compra;
	private List<Observer> observers = new ArrayList<>();
	
	public Model(ComponenteComposto itinerario) {
        this.itinerario = itinerario;
    }
	
	public void setCompra(Compra comp) {
        this.compra = comp;
    }
	
	 public void adicionarObservador(Observer observador) {
	        observers.add(observador);
	    }

	    public void removerObservador(Observer observador) {
	        observers.remove(observador);
	    }

	    private void notificarObservadores(String mensagem) {
	        for (Observer observador : observers) {
	            observador.update(mensagem);
	        }
	    }

	    public void processarPagamento(double valor, String nomePassageiro) {
	        compra.comprar(valor);
	        itinerario.exibir();
	        notificarObservadores("Reserva de voo para " + nomePassageiro + " e pagamento processados com sucesso");
	    }
}
