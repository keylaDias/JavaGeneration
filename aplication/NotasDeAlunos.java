package aplication;

import java.util.Scanner;

public class NotasDeAlunos {

	public static void main(String[] args) {
		/*Fa�a um sistema que leia as 3 notas de um aluno e
		 *  calcule a m�dia final 
		 * deste aluno. Considerar que 
		 * a m�dia � ponderada e que o peso
		 *  das notas �: 2,3 e 5, respectivamente. 
		 * 
		 */
		
		float nota1;
		float nota2;
		float nota3;
		float media;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Digite a nota 1: ");
		nota1= sc.nextFloat();
		System.out.print("Digite a nota 2: ");
		nota2= sc.nextFloat();
		System.out.print("Digite a nota 3: ");
		nota3= sc.nextFloat();
		
		media= ((nota1*2) + (nota2*3) + (nota3*5))/10;
		
		System.out.printf("A sua m�dia �: %.2f" , media );
	
		
		
		
	}

}
