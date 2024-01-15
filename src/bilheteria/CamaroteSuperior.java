package bilheteria;

public class CamaroteSuperior extends VIP {

	private String location;

	// getters and setters, nestes exercícios não terão utilidade, é só para criar
	// boas práticas
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	// construtores
	public CamaroteSuperior(double valorMeticais, double valorAdicional, String location) {
		super(valorMeticais, valorAdicional);
		this.location = location;
		// TODO Auto-generated constructor stub
	}

	public void imprimeLocation() {
		System.out.println("Localização: " + location);
	}

}
