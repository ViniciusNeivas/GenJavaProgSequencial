package ExerciosJavaGen;
/* 
 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
 * meses e dias e mostre-a expressa apenas em dias.
 * */

import java.util.Scanner;
public class ProgramacaoSequencialExercicio1 {
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int idadeAnos, idadeMeses, idadeDias, totalDias;
		
		System.out.println("Por favor, insira sua idade em anos ");
		idadeAnos = leia.nextInt();
		
		System.out.println("Por favor, insira sua idade em meses ");
		idadeMeses = leia.nextInt();
		
		System.out.println("Por favor, insira sua idade em dias ");
		idadeDias = leia.nextInt();
		
		totalDias = ((idadeAnos * 365) + (idadeMeses * 30) + idadeDias); 
	    
		System.out.println("Sua idade em dias é igual a " + totalDias + " dias");
		totalDias = leia.nextInt();
		leia.close();
	}

}