package aluno1;

public class Aluno {
	private String nome, matricula;
	private short idade;
	private double nota1, nota2, media;

//Construtor using fields (atributos da classe)
	public Aluno(String nome, String matricula, short idade, double nota1, double nota2, double media) {
//		super();
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
	}

	// Construtor sem atributos, usado para poder se aceder aos métodos sem precisar
	// de receber os parâmetros do construtor acima
	public Aluno() {
	}

//	Getters and setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public short getIdade() {
		return idade;
	}

	public void setIdade(short idade) {
		this.idade = idade;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	// outros métodos

	double calcularMedia(double nota1, double nota2) {

		return this.media = (nota1 + nota2) / 2;

	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", idade=" + idade + ", nota1=" + nota1 + ", nota2="
				+ nota2 + ", media=" + media + "]";
	}

	
	
}
