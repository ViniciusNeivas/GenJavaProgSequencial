package br.com.generation.classe.objeto;

import java.util.Scanner;

public class Exercicio_5_TestaPatinente {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite a marca do patinete ");
		String marca = entrada.next();
		
		System.out.println("Digite o modelo do patinete ");
		String modelo = entrada.next();
		
		System.out.println("Digite a cor do patinete ");
		String cor = entrada.next();
		System.out.println();
		//Estancia a classe abaixo
		Exercicio_5_Patinente p1 = new Exercicio_5_Patinente ();
		
		p1.setMarca(marca);
		p1.setModelo(modelo);
		p1.setCor(cor);
		
		System.out.println("A Marca é " + p1.getMarca());
		System.out.println("Modelo é " + p1.getModelo());
		System.out.println("A Cor é " + p1.getCor());
		

		
		entrada.close();
	}

}
