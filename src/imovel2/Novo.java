package imovel2;

public class Novo extends Imovel{
	
	private double valorAdicional;
	
	public Novo(String endereco, double preco, double valorAdicional) {
		
		super(endereco,preco);
		this.valorAdicional = valorAdicional;
	}

	//Metodo para imprimir o preço do imóvel com valorAdicional
	public double getValorAdicionado() {
		
		return valorAdicional + preco;
	}
	
	public void imprimirPreco() {
		System.out.println("O preço do imóvel novo é "+ getValorAdicionado());
	}
}
