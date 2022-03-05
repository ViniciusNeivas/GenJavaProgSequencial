package br.com.generation.laços.repetição;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		 
		int qtdePar = 0, qtdeImpar =0;
		
		//Inicialização, Condição, Incremento
		for(int n = 0; n <= 10; n ++) {
			System.out.println("Por favor, digite um número " );
			n = leia.nextInt();
				if (n % 2 == 0 ) {
					qtdePar++;
				}else {
					qtdeImpar++;
				}	
				}
		System.out.println("A quantidade de números pares é: " + qtdePar);
		System.out.println("A quantidade de números impares é: " + qtdeImpar);
		
		leia.close();
	}

}
