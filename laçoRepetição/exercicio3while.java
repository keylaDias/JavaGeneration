package laçoRepetição;

import java.util.Scanner;

public class exercicio3while {

	public static void main(String[] args) {
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
			21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
			idade for =-99. (WHILE)
		 * 
		 */
		
		int idade = 0, menores21=0, maiores50=0;
		Scanner leia = new Scanner(System.in);
		
		while(idade != -99) { //vai repetir enquanto for diferente de -99
			
			System.out.print("Entre com a sua idade: ");
			idade = leia.nextInt();
			if(idade<21 && idade >=0) { 
				menores21++;
			}
			else if(idade>50) { 
				maiores50++;
			}
		}
			System.out.println("O total de pessoas menores de 21 anos é de: "
		+ menores21 +" e pessoas acima de 50 anos é de: " + maiores50 + ".");

	}

}
