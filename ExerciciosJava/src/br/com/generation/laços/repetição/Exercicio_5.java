package br.com.generation.la�os.repeti��o;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner leia = new Scanner (System.in);
		int n = 0;
		int somaTotal = 0;
		

		do { 
		System.out.println("Por favor, digite um n�mero ");
		n = leia.nextInt();
		somaTotal = somaTotal+ n;
		//System.out.println(n);
		
		//Thread.sleep(500);
		}
		
				
			
		while (n != 0); {				
		 	System.out.println
		 	("Voc� digitou o n�mero 0, o sistema foi encerrado! " 
		 	+ "\nA soma total dos valores digitados � igual a " 
		 	+ somaTotal + ". ");
		
		 	
		 	
		
			
		
	}	

			leia.close();
			}	
}