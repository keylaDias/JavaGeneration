package aplication;

import java.util.Scanner;

public class TempoDeEvento {

	public static void main(String[] args) {
		/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		 *  
		 */
       int horas;
       int minutos;
       int segundos;
       
       Scanner sc = new Scanner (System.in);
       System.out.println("Qual a dura��o do seu evento em segundos? ");
       segundos = sc.nextInt();
      
       horas = segundos/3600;
       minutos = (segundos%3600)/60;
       segundos = (segundos%3600)%60;
       
       System.out.println("A dura��o do seu evento foi de: " 
       +horas+ " horas " + minutos+ " minutos e " + segundos + " segundos ");
       
       sc.close();
       
       
       
       
       
		
	}

}
