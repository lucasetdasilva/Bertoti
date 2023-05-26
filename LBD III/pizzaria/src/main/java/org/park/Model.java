package org.park;


import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Model {
	
	private List<Cliente> clientes = new LinkedList<Cliente>();
	private List<Pedido> pedidos = new LinkedList<Pedido>();
	
	
	public Model() {
		addCliente(new Cliente("Júlia","176.098.544-98","Rua das Flores","07-01-2003"));
		addCliente(new Cliente("Lucas","456.007.864-22","Rua X","03-02-2004"));
		addCliente(new Cliente("Giuliano","345.079.876-21","Rua Y", "09-02-1976"));
		addCliente(new Cliente("Marcella","123.456.789-10","Rua Z","26-07-2004"));
		addPedido(new Pedido(1,"09/10/2019",3,"Portuguesa", new Cliente("Giuliano","345.079.876-21","Rua Y", "09-02-1976")));
		addPedido(new Pedido(2,"10/12/2019",5,"Chocolate",new Cliente("Lucas","456.007.864-22","Rua X","03-02-2004")));
		addPedido(new Pedido(3,"13/05/2019",2,"Portuguesa",new Cliente("Lucas","456.007.864-22","Rua X","03-02-2004")));
		addPedido(new Pedido(4,"14/02/2019",1,"Nutella", new Cliente("Giuliano","345.079.876-21","Rua Y", "09-02-1976")));
		addPedido(new Pedido(5,"18/07/2019",1,"Frango com Catupiry", new Cliente("Giuliano","345.079.876-21","Rua Y", "09-02-1976")));
		addPedido(new Pedido(6,"21/09/2019",1,"Marguerita", new Cliente("Giuliano","345.079.876-21","Rua Y", "09-02-1976")));
		addPedido(new Pedido(7,"25/03/2019",2,"Peperonni", new Cliente("Marcella","123.456.789-10","Rua Z", "26-07-2004")));
		addPedido(new Pedido(8,"27/08/2019",1,"Vegetariana",new Cliente("Júlia","176.098.544-98","Rua das Flores","07-01-2003")));
		addPedido(new Pedido(9,"22/09/2019",3,"Queijo com Bancon",new Cliente("Júlia","176.098.544-98","Rua das Flores","07-01-2003")));
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
