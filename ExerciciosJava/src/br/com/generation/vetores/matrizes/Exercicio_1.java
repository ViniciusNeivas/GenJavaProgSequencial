package br.com.generation.vetores.matrizes;

import java.util.Scanner;

/*	1. Fa�a um programa que crie um vetor 
 * 	por leitura com 5 valores de pontua��o de uma
	atividade e o escreva em seguida. 
	Encontre ap�s a maior pontua��o e a apresente.
 */

public class Exercicio_1 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		int [] arrayValoresPontuacao = new int [5] ;
		int maiorPontuacao = 0;
		
		
		for (int i = 0; i <= 4; i++) {
			System.out.println("\nDigite a " + (i+1) + " � pontua��o da atividade ");
			arrayValoresPontuacao [i]  = leia.nextInt();
			
			if (arrayValoresPontuacao [i]   > maiorPontuacao) {
				maiorPontuacao = maiorPontuacao + arrayValoresPontuacao [i];
				maiorPontuacao = arrayValoresPontuacao [i];
				
			} if (arrayValoresPontuacao [i] > 10 || arrayValoresPontuacao [i] < 0  ) {
				System.out.println(" Pontua��o digitada � inv�lida ");
				break;
			} else
			System.out.println("Sua maior pontua��o foi igual a " + maiorPontuacao);
		}
		
		
		
		
		leia.close();
	
	}

}
