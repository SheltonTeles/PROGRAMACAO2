package bilheteria;

public class Bilhete {

	protected double valorMeticais;// visibilidade protected para que as outras classes tenham acesso

	// getters and setters, nestes exercícios não terão utilidade, é só para criar
	// boas práticas
	public double getValorMeticais() {
		return valorMeticais;
	}

//Construtores
	public void setValorMeticais(double valorMeticais) {
		this.valorMeticais = valorMeticais;
	}

	public Bilhete(double valorMeticais) {

		this.valorMeticais = valorMeticais;
	}

	public Bilhete() {

	}

	public void imprimeValor() {

		System.out.println("Valor em meticais do bilhete normal " + (valorMeticais));
	}

}
