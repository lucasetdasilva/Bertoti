package passagens;

public class Compra_Estudante implements Compra{
	
	public double comprar(double valor) {
		
		double desconto = 35;
		
		double valor_desconto = valor - (valor * (desconto / 100));
		return valor_desconto;
	}

}
