package imovel2;

public class Arranca {

	public static void main(String[] args) {
		
		double desconto = 0.5, preco = 15000, valorAdicional = 5000;
		String endereco1 = "Maputo", endereco2 = "Boane";
		
		Novo n = new Novo(endereco1, preco, valorAdicional);
		Velho v = new Velho (endereco2, preco, desconto);
		
		n.imprimirPreco();
		v.imprimirPreco();
		
	}
}
