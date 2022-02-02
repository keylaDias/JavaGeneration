package OrientaçãoAObjetos;

import java.util.Scanner;

public class exercicio2Avião {
	
	private String modelo;
	private String cor;
	private boolean gasolina;
	private boolean aeroporto;
	
	
	public void Aviao(String modelo, String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void abastecimento() {
		int gas = sc.nextInt();
		if(gas==1) {
			this.gasolina = true;
		}else {
			this.gasolina = false;
		}
	}

	public void voar() {
		if(gasolina == true) {
			System.out.println("Atenção passageiros, se prepararem para decolagem\n\n");
		}else {
			System.out.println("A aeronave esta sem combustível, abasteça para poder decolar");
		}
		
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isGasolina() {
		return gasolina;
	}

	public void setGasolina(boolean gasolina) {
		this.gasolina = gasolina;
	}

	public boolean isAeroporto() {
		return aeroporto;
	}

	public void setAeroporto(boolean aeroporto) {
		this.aeroporto = aeroporto;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

}
