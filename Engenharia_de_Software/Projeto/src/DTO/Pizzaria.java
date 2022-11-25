
package DTO;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Emanoel
 */
public class Pizzaria {

    private int id;
    private List<Pedido> pedidos = new LinkedList<>();
    private List<Cliente> clientes = new LinkedList<>();
    private List<Funcionario> funcionarios = new LinkedList<>();
    private List<Pizza> pizzas = new LinkedList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPedidos(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void setClientes(Cliente cliente) {
        clientes.add(cliente);
    }

    public void setFuncionarios(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void setPizzas(Pizza pizza) {
        pizzas.add(pizza);
    }
    
     public Cliente BuscarCliente(String nome) {

        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(nome)) {
                JOptionPane.showMessageDialog(null, "Cliente Encontrado !");
                return cliente;
            } else {
                JOptionPane.showMessageDialog(null, "Sem registro !");
            }
        }
        return null;

    }
    

    public List<Pedido> getPedidos() {
        return this.pedidos;
    }

    public List<Cliente> getClientes() {
        return this.clientes;
    }

    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public List<Pizza> getPizzas() {
        return this.pizzas;
    }
}
