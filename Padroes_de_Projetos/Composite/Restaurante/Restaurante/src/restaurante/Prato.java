package restaurante;

public class Prato implements Cardapio{

	private String nomePrato;
	private double precoPrato;
	
	public Prato(String nome, double preco) {
		this.nomePrato = nome;
		this.precoPrato = preco;
	}
	
	public void imprimirProduto() {
		System.out.println(nomePrato + "- R$" + precoPrato);
		
	}

	public String getNomePrato() {
		return nomePrato;
	}

	public void setNomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}

	public double getPrecoPrato() {
		return precoPrato;
	}

	public void setPrecoPrato(double precoPrato) {
		this.precoPrato = precoPrato;
	}
	
}
