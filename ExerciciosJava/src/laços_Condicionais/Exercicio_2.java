package la�os_Condicionais;

import java.util.Scanner;

/* 2- Fa�a um programa que entre com tr�s n�meros 
 * e coloque em ordem crescente.
 * 
 * */

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double numero1, numero2, numero3;
		
		System.out.println("Digite tr�s n�meros e depois os veja em ordem crescente ");
		System.out.println("\n");
		
		System.out.println("Por favor, digite o primeiro n�mero ");
		numero1 = leia.nextDouble();
		System.out.println("\n");
		
		System.out.println("Por favor, digite o segundo n�mero ");
		numero2 = leia.nextDouble();
		System.out.println("\n");
		
		System.out.println("Por favor, digite o terceiro n�mero ");
		numero3 = leia.nextDouble();
		System.out.println("\n");
		
		if (numero1 <= numero2 && numero2 <= numero3) {
			System.out.println(numero1 + ", " + numero2 + ", "  + numero3 );
		}
			else if (numero1 <= numero3 && numero3 <= numero2) {
			
				System.out.println(numero1 + ", " + numero3 + ", " + numero2);
			}
		
			else if (numero2 <= numero1 && numero1 <= numero3) {
				
				System.out.println( numero2 + ", " + numero1 + ", " + numero3);
			}
			
			else if (numero2 <= numero3 && numero3 <= numero1) {
				
				System.out.println(numero2 + ", " + numero3 + ", " + numero1);
			}
		
			else if (numero3 <= numero1 && numero1 <= numero2) {
				
				System.out.println(numero3 + ", " + numero1 + ", " + numero2);
			}
				else {
					System.out.println(numero3 + ", " + numero2 + ", " + numero1);
				}
		
	leia.close();
	
	}	
		
	}
		

