package programacao_Sequencial;

//5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
//aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
//respectivamente.

import java.util.Scanner;

public class ProgramacaoSequencialExercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		double nota1, nota2, nota3, mediaPonderada;
		double

		peso1 = 2.0, peso2 = 3.0, peso3 = 5.0;

		System.out.println("Por favor, insira a primeira nota");
		nota1 = leia.nextInt();
		System.out.println();

		System.out.println("Por favor, insira a segunda nota");
		nota2 = leia.nextInt();
		System.out.println();

		System.out.println("Por favor, insira a terceira nota");
		nota3 = leia.nextInt();
		System.out.println();

		mediaPonderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
		System.out.println("A sua média é " + mediaPonderada);
		mediaPonderada = leia.nextInt();
		leia.close();
	}

}
