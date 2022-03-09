package br.com.generation.heranca.exercicio1;

public class TestaTodosAnimais {

	public static void main(String[] args) {
		
		// DECLARAÇÃO DE OBJETO 
		
		Cachorro cao = new Cachorro (); 
		Cavalo cav = new Cavalo();
		Preguica preg = new Preguica();
		
		// CACHORRO
		
		cao.setNome("Branca");
		cao.setIdade(13);
		cao.setEmiteSom("Late");
		cao.setDeveCorrer("Corre");
		
		System.out.println("O nome do cachorro (a) é " + cao.getNome() + ". ");
		System.out.println("A idade do cachorro (a) é igual a " + cao.getIdade() + " Anos. ");
		System.out.println("Esse animal " + cao.getEmiteSom() + ". ");
		System.out.println("Esse animal " + cao.getDeveCorrer() + ". ");
	
		System.out.println();
		
		//CAVALO
		
		cav.setNome("Pé de Pano");
		cav.setIdade(17);
		cav.setEmiteSom("Relincha");
		cav.setDeveCorrer("Corre Muito Rápido");
		
		System.out.println("O nome do cavalo é " + cav.getNome() + ". ");
		System.out.println("A idade do cavalo é igual a " + cao.getIdade() + " Anos. ");
		System.out.println("Esse animal " + cav.getEmiteSom() + ". ");
		System.out.println("Esse animal " + cav.getDeveCorrer() + ". ");
		
		System.out.println();
		
		//PREGUIÇA
	
		preg.setNome("Slatan");
		preg.setIdade(25);
		preg.setEmiteSom("Bocejo");
		preg.setSubirArvores("Sobe em Árvores no Tempo Dela");
		
		System.out.println("O nome da preguiça é " + preg.getNome() + ". ");
		System.out.println("A idade da preguiça é igual a " + preg.getIdade() + " Anos. ");
		System.out.println("Esse animal emite o som de " + preg.getEmiteSom() + ". ");
		System.out.println("Esse animal " + preg.getSubirArvores() + ". ");
		
		
	}

}