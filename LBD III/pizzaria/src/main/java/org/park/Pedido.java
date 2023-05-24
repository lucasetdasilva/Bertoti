package org.park;

public class Pedido {
	
	private int id;
	private String data;
	private int quantidade;
	private String nomePizza;
	private Cliente cliente;
	
	public Pedido(int id, String data, int quantidade, String nomePizza, Cliente cliente) {
		this.id = id;
		this.data = data;
		this.quantidade = quantidade;
		this.nomePizza = nomePizza;
		this.cliente = cliente;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public int getId() {
		return id;
	}

	public String getData() {
		return data;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public String getNomePizza() {
		return nomePizza;
	}
	
	

}
