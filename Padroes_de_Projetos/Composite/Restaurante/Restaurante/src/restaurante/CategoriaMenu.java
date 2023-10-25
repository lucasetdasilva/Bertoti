package restaurante;

import java.util.ArrayList;
import java.util.List;

public class CategoriaMenu implements Cardapio{

	private String nome;
	private List<Cardapio> itens = new ArrayList<Cardapio>();
	
	public CategoriaMenu(String nome) {
		this.nome = nome;
	}
	
	public void adicionarItem(Cardapio item) {
		itens.add(item);
	}
	
	public void imprimirProduto() {
		System.out.println("Categoria do Menu: " + nome);
		for(Cardapio item: itens) {
			item.imprimirProduto();
		}
		
	}

}
