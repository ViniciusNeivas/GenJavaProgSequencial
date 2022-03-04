package laços_Condicionais;

import java.util.Scanner;

/* 4- Faça um programa em que permita a entrada de um número qualquer 
 * e exiba se este número é par ou ímpar. 
 * Se for par exiba também a raiz quadrada do mesmo; 
 * se for ímpar exiba o número elevado ao quadrado.
 * 
 * */
public class Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double numeroDigitado, raizQuadradaPar,elevadoAoQuadrado;
		
		System.out.println("Por favor, digite um número ");
		numeroDigitado = leia.nextInt();
		
		if (numeroDigitado % 2 == 0) {
			
			
			 
			raizQuadradaPar = numeroDigitado;
			raizQuadradaPar = Math.sqrt(numeroDigitado);
			
			System.out.println
			("O número é par !!! " +
			"\nO número digitado foi " + numeroDigitado + 
			"\nO resultado da radiciação (raiz quadrada) é igual a " + raizQuadradaPar);
			
		} else {
			
			elevadoAoQuadrado = numeroDigitado;
			elevadoAoQuadrado = Math.pow(elevadoAoQuadrado, 2);
		
			System.out.println
			("O número é impar !!! " + 
			"\nO número digitado foi " + numeroDigitado +
			"\nO resultado da potenciação (número elevado) é igual a " + elevadoAoQuadrado);
		
		}
		
				
				
				
		leia.close();
	}

	
}
