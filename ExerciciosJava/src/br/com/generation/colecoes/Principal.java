package br.com.generation.colecoes;

import java.util.ArrayList;

import java.util.Scanner;

/*3- Crie uma um programa para trabalhar com estoque de uma loja, o programa dever�
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa dever� atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/



public class Principal {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<EstoqueTenis> tenis = new ArrayList<>();
		
		
	
		
		System.out.println("Quantos t�nis voc� deseja adicionar? ");
		int qtdTenis = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < qtdTenis; i++ ) {
			
			System.out.println("Marca do T�nis: ");
			String marca = sc.next();
			
			
			System.out.println("Modelo do T�nis: ");
			String modelo = sc.next();
		
			
			System.out.println("Cor do T�nis: ");
			String cor = sc.next();
		
			
			System.out.println("Tamanho do T�nis: ");
			int tamanho = sc.nextInt();
		
			
			tenis.add(new EstoqueTenis (marca, modelo, cor, tamanho));
			
			
			
		} for (EstoqueTenis i : tenis) {
			
			System.out.println(i);
			
		}	
		
		/*for (int i = 0; i < tenis.size(); i++) {
			
		System.out.println(tenis.get(i));
			
		}*/
				
		
		sc.close();
	}
}
