package mvc;

public class CompraEstudante implements Compra{
	
	public void comprar(double valor) {
		
		double desconto = 35;
		
		double valor_desconto = valor - (valor * (desconto / 100));
		System.out.println("Pago R$ " + valor_desconto + " reais");
	}

}
