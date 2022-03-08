package br.com.generation.classe.objeto;

import java.util.Scanner;

public class Exercicio_1_TestaCliente {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
	
		
		// CLIENTE 1
		System.out.println("Digite o nome cliente ");
		String nome = entrada.next();
		
		System.out.println("Digite o nome endereço do cliente ");
		String endereco = entrada.next();
		
		System.out.println("Digite o tipo do plano do cliente ");
		String tipoPlano = entrada.next();
		
		System.out.println();
		
		Exercicio_1_Cliente c1 = new Exercicio_1_Cliente ();
		
		c1.setNome(nome);
		c1.setEndereco(endereco);
		c1.setTipoPlano(tipoPlano);
		
		System.out.println("O nome do cliente é " + c1.getNome());
		System.out.println ("O endereço do cliente é " + c1.getEndereco());
		System.out.println ("O tipo do plano do cliente é " + c1.getTipoPlano());
		
	
		
		//CLIENTE 2
		
		/* System.out.println("Digite o nome cliente ");
		String nome = entrada.next();
				
		System.out.println("Digite o nome endereço do cliente ");
		String endereco = entrada.next();
				
		System.out.println("Digite o tipo do plano do cliente ");
		String tipoPlano = entrada.next();
				
		Cliente c2 = new Cliente ();
				
		c2.setNome(nome);
		c2.setEndereco(endereco);
		c2.setTipoPlano(tipoPlano);
				
		System.out.println("O nome do cliente é " + c2.getNome());
		System.out.println ("O endereço do cliente é " + c2.getEndereco());
		System.out.println ("O tipo do plano do cliente é " + c2.getTipoPlano());
		
		*/
		entrada.close();
	}

}
