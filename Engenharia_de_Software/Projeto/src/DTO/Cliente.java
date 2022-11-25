/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Emanoel
 */
public class Cliente {

    private String nome;
    private String cpf;
    private String endereco;
    private String datanascimento;
    private List<Pedido> listapedidos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

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

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String Endereco) {
        this.endereco = Endereco;
    }

    public String getDataNascimento() {
        return datanascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.datanascimento = DataNascimento;
    }

    public List<Pedido> getListaPedidos() {
        return listapedidos;
    }

    public void setListaPedidos(List<Pedido> ListaPedidos) {
        this.listapedidos = ListaPedidos;
    }

}
