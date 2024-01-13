package aluno1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aluno a1 = new Aluno();
		
		System.out.println("Insira os seguintes dados:");
		
		System.out.println("Insira o nome do aluno");
		a1.setNome(scanner.next());
		
		System.out.println("Insira a idade de "+a1.getNome());
		a1.setIdade(scanner.nextShort());
		
		System.out.println("Insira os as notas 1 e 2 respectivamente do aluno "+a1.getNome());
		a1.setNota1(scanner.nextDouble());
		a1.setNota2(scanner.nextDouble());
		a1.calcularMedia(a1.getNota1(), a1.getNota2());
		
		System.out.println(a1.toString());
		
		
		
		
	}
}
