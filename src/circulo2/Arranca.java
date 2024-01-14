package circulo2;

import java.util.Scanner;

import aluno1.Aluno;

public class Arranca {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circulo c1 = new Circulo();
		
		System.out.println("Insira o valor do raio do círculo para cálculo da área e perímetro");
		c1.setRaio(scanner.nextDouble());
		
		c1.calcularArea();
		c1.calcularPerimetro();
		System.out.println(c1.toString());
		
	}

}
