package la�oRepeti��o;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		/*
			Fa�a um programa que receba
 			tr�s inteiros e diga qual deles � o maior.
		 * 
		 */
		
		int n1;
		int n2;
		int n3;
		int maior=0;
		
		Scanner ler = new Scanner(System.in);

        System.out.print("Entre com o Primeiro valor: ");
         n1 = ler.nextInt();
        System.out.print("Entre com o Segundo valor: ");
         n2 = ler.nextInt();
        System.out.print("Entre com o Terceiro valor: ");
         n3 = ler.nextInt();

        if(maior < n1) {
            maior = n1;

        } if (maior < n2) {
            maior = n2;

            if (maior < n3) {
                maior = n3;
            }
        }

        System.out.print("O maior n�mero �: "+maior);
        ler.close();
        
		
		
		
		
	}

}
