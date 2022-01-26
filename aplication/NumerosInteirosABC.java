package aplication;

import java.util.Scanner;

public class NumerosInteirosABC {

	public static void main(String[] args) {
		/*Escreva um sistema que leia três números inteiros e positivos (A, B, C)
        calcule a seguinte expressão:  
        
        D=(R+S)/2 onde, R=(A+B)²E S=(B+C)²
		 */
		
		int A, B, C, D, R, S;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		A= sc.nextInt();
		System.out.print("Digite o valor de B: ");
		B= sc.nextInt();
		System.out.print("Digite o valor de C: ");
		C= sc.nextInt();
		
		R=(A+B)^2;
		S=(B+C)^2;
		D=(R+S)/2;
		
		System.out.println("O valor de D é: " + D );
		
		sc.close();
		
		
		

	}

}
