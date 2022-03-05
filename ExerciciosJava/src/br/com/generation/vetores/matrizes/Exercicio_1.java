package br.com.generation.vetores.matrizes;

import java.util.Scanner;

/*	1. Faça um programa que crie um vetor 
 * 	por leitura com 5 valores de pontuação de uma
	atividade e o escreva em seguida. 
	Encontre após a maior pontuação e a apresente.
 */

public class Exercicio_1 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		int [] arrayValoresPontuacao = new int [5] ;
		int maiorPontuacao = 0;
		
		
		for (int i = 0; i <= 4; i++) {
			System.out.println("\nDigite a " + (i+1) + " ª pontuação da atividade ");
			arrayValoresPontuacao [i]  = leia.nextInt();
			
			if (arrayValoresPontuacao [i]   > maiorPontuacao) {
				maiorPontuacao = maiorPontuacao + arrayValoresPontuacao [i];
				maiorPontuacao = arrayValoresPontuacao [i];
				
			} if (arrayValoresPontuacao [i] > 10 || arrayValoresPontuacao [i] < 0  ) {
				System.out.println(" Pontuação digitada é inválida ");
				break;
			} else
			System.out.println("Sua maior pontuação foi igual a " + maiorPontuacao);
		}
		
		
		
		
		leia.close();
	
	}

}
