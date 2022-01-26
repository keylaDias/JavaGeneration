package aplication;

import java.util.Scanner;

public class idadePessoas2 {

	public static void main(String[] args) {
		/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	       expressa em anos, meses e dias.
		 * 
		 */
		int anos;
		int meses;
		int dias;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		dias = sc.nextInt(); //leia
		
		anos = dias/365;
				
		meses = (dias%365)/30;
		
		dias = (dias%365)%30;
		
		System.out.println("Você tem: " + anos + "anos" + meses + "meses e" + dias + "dias" );
		sc.close();
		
	
		
	}

}
