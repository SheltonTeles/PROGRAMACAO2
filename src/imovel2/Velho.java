package imovel2;

public class Velho extends Imovel {

	private double desconto;//valor percentual, ex: desconto de 50% --> 0.5

	public Velho(String endereco, double preco, double desconto) {
		super(endereco, preco);
		// TODO Auto-generated constructor stub

		this.desconto = desconto;
	}

	public double getPrecoDescontado() {

		return preco - (desconto*preco);
	}

	public void imprimirPreco() {
		System.out.println("O preço do imóvel velho é " + getPrecoDescontado());
	}

}
