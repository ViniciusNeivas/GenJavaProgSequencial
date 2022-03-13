package br.com.generation.polimorfismo2;

public class BichoPreguica extends Animais{

	private String subirArvores;
	
	@Override
	public void Som() {
		
		
		System.out.println("O som do Bicho Preguiça é Roooonc Roooonc");

	}

	@Override
	public void Correr() {
	
		System.out.println("O Bicho Preguiça não corre.");
		
	}

	public String getSubirArvores() {
		return subirArvores;
	}

	public void setSubirArvores(String subirArvores) {
		this.subirArvores = subirArvores;
	}

	
	
}
