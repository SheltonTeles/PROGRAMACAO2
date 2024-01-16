package vendaViaturas;

public class Trabalhador {
	/*
	 * Criou-se classe trabalhador que representa de forma geral dos trabalhadores
	 */

	private String BI, passaporte, nome;
	protected double salario;

	public Trabalhador(String nome, String BI, String passaporte, double salario) {
		this.nome = nome;
		this.BI = BI;
		this.passaporte = passaporte;
		this.salario = salario;
	}

	// Getters and Setters não serão usados, mas pelas boas práticas de programação,
	// estarão aqui abaixo
	public String getBI() {
		return BI;
	}

	public void setBI(String bI) {
		BI = bI;
	}

	public String getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Trabalhador [BI=" + BI + ", passaporte=" + passaporte + ", nome=" + nome + ", salario=" + salario + "]";
	}

}
