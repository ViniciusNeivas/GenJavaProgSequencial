package ExerciosJavaGen;
 
import java.util.Scanner;
//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
// expressa em segundos e mostre-o expresso em horas, minutos e segundos.

public class ProgramaSequencialExercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		double segundos, horas, minutos;
		
		System.out.println("Por favor, insira a duração do evento em segundos ");
		segundos = leia.nextInt();
		System.out.println();
		
						//HORAS //
		horas = segundos / 3600;
	
		
						//MINUTOS//
		minutos = segundos / 3600 * 60;
	
		
						//SEGUNDOS//
		segundos = segundos *1;
	
		
		System.out.println(horas + " horas " + minutos + " minutos " + segundos + " segundos ");
		horas = leia.nextInt();
		minutos = leia.nextInt();
		segundos = leia.nextInt();
		leia.close();
	
		
				
				
	}

}
