package aplication;

import java.util.Scanner;

public class DistanciaDeDoisPontos {

	public static void main(String[] args) {
		/* Construa um programa em c que, tendo como dados de entrada dois pontos 
		 * quaisquer no plano, P(x1, y1) e P(x2, y2),
		 * escreva a distância entre eles. A fórmula d=sqrt=raiz((x2-x1)² + (y2-y1)²)
		 * 
		 */
		float X1,X2;
		float Y1,Y2;
		double d;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Digite valor de x1: ");
		X1= sc.nextFloat();
		System.out.print("Digite valor de x2: ");
		X2= sc.nextFloat();
		System.out.print("Digite valor de y1: ");
		Y1= sc.nextFloat();
		System.out.print("Digite valor de y2: ");
		Y2= sc.nextFloat();
		
		d= Math.sqrt(Math.pow((X2-X1),2) + Math.pow((Y2-Y1),2));
		
		System.out.print("A distância entre os pontos é: " +d);
		
	
		
		
		
		
				
		
		
	
		
		

	}

}
