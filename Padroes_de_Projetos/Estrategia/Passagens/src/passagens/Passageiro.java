package passagens;

public class Passageiro implements Compra{

	private String nome;
	private Compra compra;
	
	public void setCompra(Compra comp){
		compra = comp;
	}
	
	public double comprar(double valor) {
		return compra.comprar(valor);	
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
