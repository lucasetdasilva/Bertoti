/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Lucas Emanoel
 */
public class Pizza {
    
    private String nome;
    private String ingredientes;
    
    
    private List<Pizza> pizzas = new LinkedList<>();

    public void CadastrarPizzas(Pizza p) {
        pizzas.add(p);
            
    }

    public List<Pizza> MostrarPizzas() {
        return pizzas;
    }

    public Pizza BuscarPizza(String nome) {
        for (Pizza pizza : pizzas) {
            if (pizza.getNome().equals(nome)) {
                return pizza;
            } else {
                return null;
            }
        }
        return null;

    }

    public void ExcluirPizza(String nome) {
        for (Pizza pizza : pizzas) {
            if (pizza.getNome().equals(nome)) {
                pizzas.remove(pizza);

            } else{
                System.out.println("Não existe pizza com este nome");
            }
        }
    }

    public Pizza(String Nome, String Ingredientes) {
        this.nome = Nome;
        this.ingredientes = Ingredientes;
    }
    public Pizza(){
        
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String Ingredientes) {
        this.ingredientes = Ingredientes;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> Pizzas) {
        this.pizzas = Pizzas;
    }
    
}
