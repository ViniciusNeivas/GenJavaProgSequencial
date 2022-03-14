package br.com.generation.colecoes1;

import java.util.ArrayList;

public class EstoqueViolao {

	public static void main(String[] args) {
		
			String marca1 = "Tagima";
			String marca2 = "Giannini";
			String marca3 = "DiGiorgio";
			String marca4 = "Eagle";
			String marca5 = "Dean"; 
			
			
			ArrayList<String> estoqueViolao = new ArrayList<>();
			estoqueViolao.add(marca1);
			estoqueViolao.add(marca2);
			estoqueViolao.add(marca3);
			estoqueViolao.add(marca4);
			
			
			System.out.println("No estoque de violão temos as marcas: " + estoqueViolao);
			System.out.println();
			
			//ADICIONADO
			estoqueViolao.add(marca5);
			System.out.println("No estoque de violão temos as marcas: " + estoqueViolao);
			System.out.println();
			
			//REMOVIDO
			estoqueViolao.remove(marca3);
			System.out.println("No estoque de violão temos as marcas: " + estoqueViolao);
			System.out.println();
		
			
			//MOSTRA TODOS OS DADOS LISTADOS
			
			
			for(String i : estoqueViolao) {
				
				System.out.println("As marcas de violão disponíveis são as seguintes: " + estoqueViolao);
				break;
			} 
	
	}

}
