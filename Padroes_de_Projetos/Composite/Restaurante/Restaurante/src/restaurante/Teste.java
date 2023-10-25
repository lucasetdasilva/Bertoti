package restaurante;

public class Teste {
	
	public static void main(String[] args) {
		Prato p1 = new Prato("Lasanha",9.00);
		Prato p2 = new Prato("Capeletti",12.00);
		
		Prato p3 = new Prato("Filé de frango grelhado", 20.00);
		Prato p4 = new Prato("Parmegiana",29.00);
		
		Prato p5 = new Prato("Rocombole",5.00);
		Prato p6 = new Prato("Pudim", 12.00);
		
		CategoriaMenu cat1 = new CategoriaMenu("Massas");
		cat1.adicionarItem(p1);
		cat1.adicionarItem(p2);
		
		CategoriaMenu cat2 = new CategoriaMenu("Aves");
		cat2.adicionarItem(p3);
		cat2.adicionarItem(p4);
		
		CategoriaMenu cat3 = new CategoriaMenu("Sobremesas");
		cat3.adicionarItem(p5);
		cat3.adicionarItem(p6);
		
		CategoriaMenu cardapio = new CategoriaMenu("Cardápio do Restaurante");
		cardapio.adicionarItem(cat1);
		cardapio.adicionarItem(cat2);
		cardapio.adicionarItem(cat3);
		
		cardapio.imprimirProduto();
		
		
		
	}
	
	

}
