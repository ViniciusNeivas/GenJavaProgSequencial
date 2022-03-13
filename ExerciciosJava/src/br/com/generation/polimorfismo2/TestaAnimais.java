package br.com.generation.polimorfismo2;

public class TestaAnimais {

	public static void main(String[] args) {

		Cachorros cs = new Cachorros ();
		Cavalos cavs = new Cavalos ();
		BichoPreguica preg  = new BichoPreguica ();
		
		
		cs.setNome("Branca");
		cs.setIdade(13);
		cs.Correr();
		cs.Som();
		
		cavs.setNome("Pé de Pano");
		cavs.setIdade(25);
		cavs.Correr();
		cavs.Som();
		
		preg.setNome("Zlatan");
		preg.setIdade(49);
		preg.Correr();
		preg.Som();
		preg.setSubirArvores("Ligeira !?");
		
		
		
		
	}

}
