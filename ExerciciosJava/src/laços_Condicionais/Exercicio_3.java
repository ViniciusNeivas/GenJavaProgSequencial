package la�os_Condicionais;

/*3- Fa�a um programa que receba a idade de uma pessoa 
 * e mostre na sa�da em qual categoria ela se encontra:
	Infantil 10-14
	Juvenil  15-17
	Adulto   18-25

*/

import java.util.Scanner;

public class Exercicio_3 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade;
		System.out.println("Ol�, descubra a sua categoria aqui. ");
		System.out.println("Por favor, digite a sua idade para visualizar sua categoria. ");
		idade = leia.nextInt();
	
		if (idade >= 10 && idade <= 14) {
			System.out.println("Sua idade � igual " + idade + " anos. " + "\nSua categoria � a Categoria Infantil - 10 a 14 anos.  ");
			
		} else if (idade >= 15 && idade <=17) {
			System.out.println("Sua idade � igual " + idade + " anos. " + "\nSua categoria � a Categoria Juvenil - 15 a 17 anos.  ");
				
		}else if (idade >= 18 && idade <=25){
			System.out.println("Sua idade � igual " + idade + " anos. " + "\nSua categoria � a Categoria Adulta - 18 a 25 anos.  ");
		
		} else {
			System.out.println("Que pena, sua idade n�o est� em nenhuma categoria listada. ");
			
		}
		
		leia.close();
	}
}
