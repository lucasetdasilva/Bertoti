package DTO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas Emanoel
 */
public class Funcionario {

    private int id;
    private String nome;
    private String funcao;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Funcionario(int id, String nome, String funcao) {
        this.id = id;
        this.nome = nome;
        this.funcao = funcao;
    }

    public void CadastrarFuncionario(Funcionario f) {

        funcionarios.add(f);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String Funcao) {
        this.funcao = Funcao;
    }

}
