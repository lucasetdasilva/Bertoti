package passagens;

public class Compra_Especial implements Compra {
	
	public double comprar(double valor){
		double desconto = 50;
		
		double valor_descontado = valor - (valor * (desconto / 100));
		return valor_descontado;
	}

}
