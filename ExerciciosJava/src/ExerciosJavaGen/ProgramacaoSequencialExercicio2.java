package ExerciosJavaGen;

/*2. Faça um sistema que leia a idade de uma pessoa 
 * expressa em dias 
 * e mostre-a expressa em anos, meses e dias.  */

import java.util.Scanner;

public class ProgramacaoSequencialExercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int idadeDias = 0, dias = 0; 
		int idadeAnos = 0, idadeMeses = 0;
		
		System.out.println("Por favor, insira sua idade em dias ");
		dias = leia.nextInt();
		idadeAnos = (dias/365);
		idadeMeses = dias/ 30;
		idadeDias = dias * 1;
		
		System.out.println("Sua idade em anos é igual a " + idadeAnos + " anos. ");
		System.out.println("Sua idade em meses é igual a " + idadeMeses + " meses. ");
		System.out.println("Sua idade em dias é igual a " + idadeDias + " dias. ");
		
		leia.close();
		
		
		
	}
	}
