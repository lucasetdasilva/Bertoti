package DTO;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Lucas Emanoel
 */
public class Pedido {

    private String datapedido;
    private String clientes;
    private int quantidadepizza;
    private List<Pizza> pizzas = new LinkedList<>();

    public Pedido(String datapedido, String clientes, int quantidadepizza) {
        this.datapedido = datapedido;
        this.clientes = clientes;
        this.quantidadepizza = quantidadepizza;
    }

    public String getDataPedido() {
        return datapedido;
    }

    public void setDataPedido(String DataPedido) {
        this.datapedido = DataPedido;
    }

    public int getQuantidadePizza() {
        return quantidadepizza;
    }

    public void setQuantidadePizza(int QuantidadePizza) {
        this.quantidadepizza = QuantidadePizza;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> Pizzas) {
        this.pizzas = Pizzas;
    }

    public String getClientes() {
        return clientes;
    }

    public void setClientes(String Clientes) {
        this.clientes = Clientes;
    }

}
