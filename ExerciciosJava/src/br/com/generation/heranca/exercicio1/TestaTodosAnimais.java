package br.com.generation.heranca.exercicio1;

public class TestaTodosAnimais {

	public static void main(String[] args) {
		
		// DECLARA��O DE OBJETO 
		
		Cachorro cao = new Cachorro (); 
		Cavalo cav = new Cavalo();
		Preguica preg = new Preguica();
		
		// CACHORRO
		
		cao.setNome("Branca");
		cao.setIdade(13);
		cao.setEmiteSom("Late");
		cao.setDeveCorrer("Corre");
		
		System.out.println("O nome do cachorro (a) � " + cao.getNome() + ". ");
		System.out.println("A idade do cachorro (a) � igual a " + cao.getIdade() + " Anos. ");
		System.out.println("Esse animal " + cao.getEmiteSom() + ". ");
		System.out.println("Esse animal " + cao.getDeveCorrer() + ". ");
	
		System.out.println();
		
		//CAVALO
		
		cav.setNome("P� de Pano");
		cav.setIdade(17);
		cav.setEmiteSom("Relincha");
		cav.setDeveCorrer("Corre Muito R�pido");
		
		System.out.println("O nome do cavalo � " + cav.getNome() + ". ");
		System.out.println("A idade do cavalo � igual a " + cao.getIdade() + " Anos. ");
		System.out.println("Esse animal " + cav.getEmiteSom() + ". ");
		System.out.println("Esse animal " + cav.getDeveCorrer() + ". ");
		
		System.out.println();
		
		//PREGUI�A
	
		preg.setNome("Slatan");
		preg.setIdade(25);
		preg.setEmiteSom("Bocejo");
		preg.setSubirArvores("Sobe em �rvores no Tempo Dela");
		
		System.out.println("O nome da pregui�a � " + preg.getNome() + ". ");
		System.out.println("A idade da pregui�a � igual a " + preg.getIdade() + " Anos. ");
		System.out.println("Esse animal emite o som de " + preg.getEmiteSom() + ". ");
		System.out.println("Esse animal " + preg.getSubirArvores() + ". ");
		
		
	}

}