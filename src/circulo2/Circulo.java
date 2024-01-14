package circulo2;

public class Circulo {
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public Circulo() {
	}

	public double calcularArea() {

		double area = 0;

		return area = 2 * Math.PI * Math.pow(this.raio, 2);
	}

	public double calcularPerimetro() {

		double perimetro = 0;

		return perimetro = 2 * Math.PI * this.raio;
	}

	@Override
	public String toString() {
		return "Circulo de raio=" + raio + ", tem área =" + calcularArea() + ", e perímetro=" + calcularPerimetro()
				+ "]";
	}

}
