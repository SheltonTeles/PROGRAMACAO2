package vendaViaturas;

public class Arranca {

	public static void main(String[] args) {
		Vendedor v = new Vendedor("Shelton Teles", "110105006704I", "12A3", 20000, 0.5);
		Administrador a = new Administrador("Cássia Lara", "110106796704I", "15C3", 30000, 5);

		System.out.println(v);
		System.out.println(a.toString());
	}
}
