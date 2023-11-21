package mvc;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	
	private Model model;
	private List<Observer> observers = new ArrayList<>();

	public Controller(Model model) {
		this.model = model;
	}
	
	public void adicionarObservador(Observer observer) {
        observers.add(observer);
    }

    public void removerObservador(Observer observer) {
        observers.remove(observer);
    }

    public void notificarObservadores(String mensagem) {
        for (Observer observer : observers) {
            observer.update(mensagem);
        }
    }

    public void processarPagamento(double valor, String nomePassageiro) {
        model.processarPagamento(valor,nomePassageiro);
    }
	
}
