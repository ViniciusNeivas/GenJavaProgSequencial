package la�os_Condicionais;

import java.util.Scanner;

/* 4- Fa�a um programa em que permita a entrada de um n�mero qualquer 
 * e exiba se este n�mero � par ou �mpar. 
 * Se for par exiba tamb�m a raiz quadrada do mesmo; 
 * se for �mpar exiba o n�mero elevado ao quadrado.
 * 
 * */
public class Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double numeroDigitado, raizQuadradaPar,elevadoAoQuadrado;
		
		System.out.println("Por favor, digite um n�mero ");
		numeroDigitado = leia.nextInt();
		
		if (numeroDigitado % 2 == 0) {
			
			
			 
			raizQuadradaPar = numeroDigitado;
			raizQuadradaPar = Math.sqrt(numeroDigitado);
			
			System.out.println
			("O n�mero � par !!! " +
			"\nO n�mero digitado foi " + numeroDigitado + 
			"\nO resultado da radicia��o (raiz quadrada) � igual a " + raizQuadradaPar);
			
		} else {
			
			elevadoAoQuadrado = numeroDigitado;
			elevadoAoQuadrado = Math.pow(elevadoAoQuadrado, 2);
		
			System.out.println
			("O n�mero � impar !!! " + 
			"\nO n�mero digitado foi " + numeroDigitado +
			"\nO resultado da potencia��o (n�mero elevado) � igual a " + elevadoAoQuadrado);
		
		}
		
				
				
				
		leia.close();
	}

	
}
