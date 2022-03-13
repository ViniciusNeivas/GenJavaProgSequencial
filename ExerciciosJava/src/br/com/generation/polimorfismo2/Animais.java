package br.com.generation.polimorfismo2;

public abstract class Animais {

	// Atributos
	
	private String nome;
	private int idade;
	
	//Métodos
	
	public abstract void Som();
	public abstract void Correr();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	
	
	
}