package org.park;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String endereco;
	private String datanascimento;
	
	public Cliente(String nome, String cpf, String endereco, String datanascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.datanascimento = datanascimento;
	}
	
	public boolean compara(Cliente cliente) {
		
		if(nome.equals(cliente.nome) && cpf.equals(cliente.cpf) && endereco.equals(cliente.endereco) && datanascimento.equals(cliente.datanascimento)) {
			return true;
		}else{
			return false;
		}
		
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

}
