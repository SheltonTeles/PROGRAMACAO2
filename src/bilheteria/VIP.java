package bilheteria;

public class VIP extends Bilhete {

	private double valorAdicional;

	// getters and setters, nestes exercícios não terão utilidade, é só para criar
	// boas práticas
	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	public VIP(double valorMeticais, double valorAdicional) {
		// chamada explícita do construtor da superclasse (Clase Bilhete)
		super(valorMeticais);
		this.valorAdicional = valorAdicional;
	}

	public void imprimeValor() {

		System.out.println("O valor do bilhete vip é " + (valorAdicional + valorMeticais));
	}

}
