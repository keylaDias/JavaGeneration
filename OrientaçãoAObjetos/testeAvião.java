package Orienta��oAObjetos;

public class testeAvi�o {

	public static void main(String[] args) {
		Aviao avi�o = new Aviao("14-Bis", "branco");
		System.out.print("\t\tPosto de abastecimento: \n\nPara abastecer digite (1), para sair digite (0): ");

		avi�o.abastecimento();
		avi�o.voar();
		System.out.print("Existe aeroporto para aterrisagem?\n\nDigite (1) para sim e (0) para n�o: ");
		avi�o.aeroporto();
		avi�o.pousar();
	}

}
	