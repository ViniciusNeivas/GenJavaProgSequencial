package br.com.generation.classe.objeto;

import java.util.Scanner;

public class Exercio_2_TestaAviao {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);

		System.out.println("Digite o nome do fabricante do avião. ");
		String fabricante = entrada.next();
		
		System.out.println("Digite o modelo do avião. ");
		String modelo = entrada.next();
		
		System.out.println("Digite número máximo de ocupantes. ");
		String numMaxOcupante = entrada.next();
		System.out.println();
		
		
		Exercicio_2_Aviao aviao1 = new Exercicio_2_Aviao();
		
		aviao1.setFabricante(fabricante);
		aviao1.setModelo(modelo);
		aviao1.setNumMaxOcupantes(numMaxOcupante);
		
		System.out.println("O fabricante do avião é " + aviao1.getFabricante());
		System.out.println("O modelo do avião é " + aviao1.getModelo());
		System.out.println("O número máximo de ocupantes desse avião é " + aviao1.getNumMaxOcupantes() + " pessoas ");
		
		entrada.close();
		
	}

}
