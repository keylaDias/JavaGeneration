package aplication;

import java.util.Scanner;

public class idadePessoas {

	public static void main(String[] args) { 
		/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
     		dias e mostre-a expressa apenas em dias.
		 * 
		 */
		int anos;
		int meses;
		int dias;
		int totalDias;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade: ");
		anos = sc.nextInt();
		System.out.println("\nDigite meses: ");
		meses = sc.nextInt();
		System.out.println("\nDigite dias: ");
		dias = sc.nextInt();
		
		totalDias = (anos*365) + (meses*30) + dias;
		
		System.out.println("\nVocê viveu: " + totalDias + "dias");
	} 

}
