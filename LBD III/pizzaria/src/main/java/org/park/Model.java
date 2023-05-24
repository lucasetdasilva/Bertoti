package org.park;


import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Model {
	
	private List<Cliente> clientes = new LinkedList<Cliente>();
	private List<Pedido> pedidos = new LinkedList<Pedido>();
	
	
	public Model() {
		addCliente(new Cliente("Lucas","11359240121","Rua X","03-02-2000"));
		addCliente(new Cliente("Giuliano","234325676","Rua Y", "09-02-1976"));
		addPedido(new Pedido(1,"09/07/2019",3,"Portuguesa", new Cliente("Giuliano","234325676","Rua Y", "09-02-1976")));
		addPedido(new Pedido(3,"10/07/2019",5,"Chocolate",new Cliente("Lucas","11359240121","Rua X","03-02-2000")));
		addPedido(new Pedido(3,"13/07/2019",2,"Portuguesa",new Cliente("Lucas","11359240121","Rua X","03-02-2000")));
		addPedido(new Pedido(4,"10/07/2019",1,"Nutella", new Cliente("Giuliano","234325676","Rua Y", "09-02-1976")));
		addPedido(new Pedido(5,"10/07/2019",1,"Marguerita", new Cliente("Giuliano","234325676","Rua Y", "09-02-1976")));
		addPedido(new Pedido(6,"10/07/2019",1,"Gorgonzola", new Cliente("Giuliano","234325676","Rua Y", "09-02-1976")));
	}
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	
	public void addPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	
	public List<Cliente> buscarNome(String nome){
		List<Cliente> clienteEncontrado = new LinkedList<Cliente>();
		for(Cliente cliente: clientes) {
			if(cliente.getNome().equals(nome))  clienteEncontrado.add(cliente);
			
		}
		return clienteEncontrado;
		
	}
	
	
	public List<Pedido> buscarCliente(Cliente cli){
		List<Pedido> pedidosEncontrados = new LinkedList<Pedido>();
		
		for(Pedido pedido: pedidos) {
			if(cli.compara(pedido.getCliente())) {
				pedidosEncontrados.add(pedido);
			}
		}
		
		return pedidosEncontrados;
		
	}
	
	
	public List<Cliente> getClientes(){
		return clientes;
	}
	
	public List<Pedido> getPedidos(){
		return pedidos;
	}
	
}
