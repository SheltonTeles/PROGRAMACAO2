package bilheteria;

public class CamaroteInferior extends Normal {
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
	public CamaroteInferior(double valorMeticais, String location) {
		super(valorMeticais);
		this.location = location;
		// TODO Auto-generated constructor stub
	}

	public void imprimeLocation() {
		System.out.println("Localização: " + location);
	}

}
