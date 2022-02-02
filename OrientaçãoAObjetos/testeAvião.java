package OrientaçãoAObjetos;

public class testeAvião {

	public static void main(String[] args) {
		Aviao avião = new Aviao("14-Bis", "branco");
		System.out.print("\t\tPosto de abastecimento: \n\nPara abastecer digite (1), para sair digite (0): ");

		avião.abastecimento();
		avião.voar();
		System.out.print("Existe aeroporto para aterrisagem?\n\nDigite (1) para sim e (0) para não: ");
		avião.aeroporto();
		avião.pousar();
	}

}
	