package br.com.generation.la�os.repeti��o;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		 
		int qtdePar = 0, qtdeImpar =0;
		
		//Inicializa��o, Condi��o, Incremento
		for(int n = 0; n <= 10; n ++) {
			System.out.println("Por favor, digite um n�mero " );
			n = leia.nextInt();
				if (n % 2 == 0 ) {
					qtdePar++;
				}else {
					qtdeImpar++;
				}	
				}
		System.out.println("A quantidade de n�meros pares �: " + qtdePar);
		System.out.println("A quantidade de n�meros impares �: " + qtdeImpar);
		
		leia.close();
	}

}
