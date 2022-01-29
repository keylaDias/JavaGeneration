package vetorMatriz;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		/* Leia uma matriz 3 x 3, conte e escreva
		 *  quantos valores maiores que 10 ela possui.
		 */
      
		int[][] matriz = new int [3][3];
		int cont = 0;
		
		
		Scanner leia = new Scanner(System.in);
		
		
		for(int linha=0; linha<=2; linha++) { // linha= 3
			
			for(int coluna=0; coluna<=2; coluna++) { //coluna=3
				matriz[linha][coluna] = leia.nextInt(); //matriz[2][2]= 4 
				if(matriz[linha][coluna] > 10 ) {
					cont++;
					
				}
			}//coluna++
		}//linha++
		System.out.println("Ela possui: " + cont );
		
		
		
		
		 
	}

}
