package passagens;

public class Teste {
	
	public static void main(String[] args) {
		
		Passageiro lucas = new Passageiro();
		
		lucas.setCompra(new Compra_Estudante());
		lucas.setNome("Lucas");
		
		System.out.println("O estudante "+ lucas.getNome() + " irá pagar " + lucas.comprar(1500) + " reais");
		
		Passageiro julia = new Passageiro();
		
		julia.setCompra(new Compra_Aniversariante());
		julia.setNome("Júlia");
		
		System.out.println("O aniversariante " + julia.getNome() + " irá pagar " + julia.comprar(1500) + " reais");
		
		Passageiro maria = new Passageiro();
		
		maria.setCompra(new Compra_Especial());
		maria.setNome("Maria");
		
		System.out.println("O idoso(a) " + maria.getNome() + " irá pagar " + maria.comprar(1500) + " reais");
		
		
	}

}
