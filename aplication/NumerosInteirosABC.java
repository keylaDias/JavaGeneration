package aplication;

import java.util.Scanner;

public class NumerosInteirosABC {

	public static void main(String[] args) {
		/*Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C)
        calcule a seguinte express�o:  
        
        D=(R+S)/2 onde, R=(A+B)�E S=(B+C)�
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
		
		System.out.println("O valor de D �: " + D );
		
		sc.close();
		
		
		

	}

}
