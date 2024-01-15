package bilheteria;

public class Arranca {
	public static void main(String[] args) {

		double valorNormal = 200;
		double valorAdicional = 100;
		String locationNormal = "Rés-do-chão";
		String locationVIP = "Quinto andar";

		Bilhete b = new Bilhete(valorNormal);
		Normal n = new Normal(valorNormal);
		VIP v = new VIP(valorNormal, valorAdicional);
		CamaroteInferior cI = new CamaroteInferior(valorAdicional, locationNormal);
		CamaroteSuperior cS = new CamaroteSuperior(valorNormal, valorAdicional, locationVIP);

//		b.imprimeValor();
		n.imprimeValor();
		cI.imprimeLocation();
		v.imprimeValor();
		cS.imprimeLocation();
	}
}
