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
public class Cliente {

    private String nome;
    private String cpf;
    private String endereco;
    private String datanascimento;
    private List<Pedido> listapedidos = new LinkedList<>();
    private List<Cliente> clientes = new LinkedList<>();

    public void Cadastro(Cliente c) {
        clientes.add(c);

    }


    public Cliente(String Nome, String Cpf, String Endereco, String DataNascimento) {
        this.nome = Nome;
        this.cpf = Cpf;
        this.endereco = Endereco;
        this.datanascimento = DataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getData() {
        return datanascimento;
    }

    public void setData(String DataNascimento) {
        this.datanascimento = DataNascimento;
    }

    public List<Pedido> getListaPedidos() {
        return listapedidos;
    }

    public void setListaPedidos(List<Pedido> listapedidos) {
        this.listapedidos = listapedidos;
    }

}
