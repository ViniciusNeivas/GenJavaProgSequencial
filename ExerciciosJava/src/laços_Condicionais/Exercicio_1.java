package laços_Condicionais;

import java.util.Scanner;

/* 	1- Faça um programa que receba três números inteiros 
 * e diga qual deles é o maior.
 * 
 * */

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Qual é o maior número entre os três !? ");
		System.out.println();
		
		System.out.println("Por favor, digite o primeiro número. ");
		numero1 = leia.nextInt();
		
		System.out.println("Por favor, digite o segundo número. ");
		numero2 = leia.nextInt();
		
		System.out.println("Por favor, digite o terceiro número. ");
		numero3 = leia.nextInt();
		
		
		// CONDIÇÃO - PRIMEIRO NÚMERO MAIOR
		if (numero1 > numero2 && numero1 > numero3 && numero1 < 0 ) {
			
			System.out.println("O maior número entre os três números digitados é ... ");
			System.out.println("\nO primeiro número digitado que foi o número " + numero1);
			 
		}
		// CONDIÇÃO SEGUNDO NÚMERO MENOR	
		else if (numero2 > numero1 && numero2 > numero3 && numero2 < 0 ) {
			System.out.println("O maior numéro entre os três números digitados é ... ");
			System.out.println("\nO segundo número digitado que foi o número " + numero2);
			
			
		} 
		// CONDIÇÃO -  TERCEIRO NÚMERO MAIOR
		
		else if (numero3 > numero1 && numero3 > numero2 && numero3 < 0) {
			System.out.println("O maior número entre os três números digitados é ... "); 
			System.out.println("\nO terceiro número digitado que foi o número " + numero3);
			
		} 
		
		// CONDIÇÃO - OS TRÊS NÚMEROS SÃO IGUAIS
		
		else {
			System.out.println("Os números digitados tem o mesmo valor !!! ");
			System.out.println("Tente Outra Vez !!!");
			
		}
		
		leia.close();
		
		} 
	}


