package la�os_Condicionais;

import java.util.Scanner;

/* 	1- Fa�a um programa que receba tr�s n�meros inteiros 
 * e diga qual deles � o maior.
 * 
 * */

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Qual � o maior n�mero entre os tr�s !? ");
		System.out.println();
		
		System.out.println("Por favor, digite o primeiro n�mero. ");
		numero1 = leia.nextInt();
		
		System.out.println("Por favor, digite o segundo n�mero. ");
		numero2 = leia.nextInt();
		
		System.out.println("Por favor, digite o terceiro n�mero. ");
		numero3 = leia.nextInt();
		
		
		// CONDI��O - PRIMEIRO N�MERO MAIOR
		if (numero1 > numero2 && numero1 > numero3 && numero1 < 0 ) {
			
			System.out.println("O maior n�mero entre os tr�s n�meros digitados � ... ");
			System.out.println("\nO primeiro n�mero digitado que foi o n�mero " + numero1);
			 
		}
		// CONDI��O SEGUNDO N�MERO MENOR	
		else if (numero2 > numero1 && numero2 > numero3 && numero2 < 0 ) {
			System.out.println("O maior num�ro entre os tr�s n�meros digitados � ... ");
			System.out.println("\nO segundo n�mero digitado que foi o n�mero " + numero2);
			
			
		} 
		// CONDI��O -  TERCEIRO N�MERO MAIOR
		
		else if (numero3 > numero1 && numero3 > numero2 && numero3 < 0) {
			System.out.println("O maior n�mero entre os tr�s n�meros digitados � ... "); 
			System.out.println("\nO terceiro n�mero digitado que foi o n�mero " + numero3);
			
		} 
		
		// CONDI��O - OS TR�S N�MEROS S�O IGUAIS
		
		else {
			System.out.println("Os n�meros digitados tem o mesmo valor !!! ");
			System.out.println("Tente Outra Vez !!!");
			
		}
		
		leia.close();
		
		} 
	}


