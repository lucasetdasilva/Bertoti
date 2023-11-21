package mvc;

public class CompraEspecial implements Compra {
	
	public void comprar(double valor) {
		double desconto = 50;
		
		double valor_descontado = valor - (valor * (desconto / 100));
		System.out.println("Pago R$ " + valor_descontado + " reais");

	}

}
