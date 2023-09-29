package clinica;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
	
	private double peso;
	private double altura;
	private List<Observer> observers;
	
	public Paciente() {
		observers = new ArrayList<Observer>();
		}
	
	public void notifyObservers(double novoPeso, double novaAltura) {
		for(int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(novoPeso,novaAltura);
			
		}
	}
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void setDados(double pesoAlterado, double alturaAlterado) {
		peso = pesoAlterado;
		altura = alturaAlterado;
		
		notifyObservers(peso,altura);
			
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
