package vendaViaturas;

public class Vendedor extends Trabalhador {

	private double comissao;

	public Vendedor(String nome, String BI, String passaporte, double salario, double comissao) {
		super(nome, BI, passaporte, salario);
		this.comissao = comissao;
	}

	public double getComissao() {
		return comissao;
	}

	// Getters and Setters não serão usados, mas pelas boas práticas de programação,
	// estarão aqui abaixo
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	// método para calcular o salário com comissão
	public double salarioTotal() {

		return (salario * comissao) + salario;
	}

	@Override
	public String toString() {
		return "Vendedor [comissao=" + comissao + ", salario=" + salario + ", getComissao()=" + getComissao()
				+ ", salarioTotal()=" + salarioTotal() + ", getBI()=" + getBI() + ", getPassaporte()=" + getPassaporte()
				+ ", getNome()=" + getNome() + ", getSalario()=" + getSalario() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	/*
	 * Recomendo retirem alguns campos e colocar o que eles pediram no enunciado
	 * (Empresa deseja saber de todos o nome e nümero-do-BI/Passaporte e salario)
	 * 
	 */

}
