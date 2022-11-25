
package DTO;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Emanoel
 */
public class Pizzaria {

    private int id;
    private List<Pedido> pedidos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Pizza> pizzas = new ArrayList<>();

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
