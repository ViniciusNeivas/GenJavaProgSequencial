package br.com.generation.la�os.repeti��o;

/*1- Informar todos os n�meros de 1000 a 1999 
 * que quando divididos por 11 obtemos resto = 5. (FOR)
 * 
 * */

public class Exercicio_1 {

	public static void main(String[] args) throws InterruptedException {
		
	System.out.println
			("Os n�meros de 1000 a 1999 que divididos por 11 "
					+ "\ntem como resto de divis�o 5 " +
					"\nS�o os seguintes: ");
	
		for (int n = 1000; n <= 1999; n++) {
			
			
			if (n % 11 == 5){
				
				System.out.println (n );
			Thread.sleep(500);
			
			} 
			
		}

	}

}