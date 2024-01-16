package vendaViaturas;

public class Administrador extends Trabalhador {

	private double horasExtras;

	public Administrador(String nome, String BI, String passaporte, double salario, double horasExtras) {
		super(nome, BI, passaporte, salario);
		this.horasExtras = horasExtras;
	}

	public double getHorasExtras() {
		return horasExtras;
	}

	// Getters and Setters não serão usados, mas pelas boas práticas de programação,
	// estarão aqui abaixo
	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double salarioHorasExtras() {

		return (salario * 1.5 * horasExtras) + salario;
	}

	@Override
	public String toString() {
		return "Administrador [horasExtras=" + horasExtras + ", salario=" + salario + ", getHorasExtras()="
				+ getHorasExtras() + ", salarioHorasExtras()=" + salarioHorasExtras() + ", getBI()=" + getBI()
				+ ", getPassaporte()=" + getPassaporte() + ", getNome()=" + getNome() + ", getSalario()=" + getSalario()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	/*
	 * Recomendo retirem alguns campos e colocar o que eles pediram no enunciado
	 * (Empresa deseja saber de todos o nome e nümero-do-BI/Passaporte e salario)
	 * 
	 */

}
