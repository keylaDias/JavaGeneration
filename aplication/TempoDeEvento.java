package aplication;

import java.util.Scanner;

public class TempoDeEvento {

	public static void main(String[] args) {
		/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		 *  
		 */
       int horas;
       int minutos;
       int segundos;
       
       Scanner sc = new Scanner (System.in);
       System.out.println("Qual a duração do seu evento em segundos? ");
       segundos = sc.nextInt();
      
       horas = segundos/3600;
       minutos = (segundos%3600)/60;
       segundos = (segundos%3600)%60;
       
       System.out.println("A duração do seu evento foi de: " 
       +horas+ " horas " + minutos+ " minutos e " + segundos + " segundos ");
       
       sc.close();
       
       
       
       
       
		
	}

}
