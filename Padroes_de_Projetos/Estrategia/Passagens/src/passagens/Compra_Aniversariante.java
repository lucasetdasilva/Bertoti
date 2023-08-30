package passagens;

public class Compra_Aniversariante implements Compra{
	
	public double comprar(double valor){
		
		double valor_desconto = valor - valor;
		
		return valor_desconto;
	}
}
