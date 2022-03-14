package br.com.generation.colecoes;

public class EstoqueTenis extends Principal {

	private String marca;
	private String modelo;
	private String cor;
	private int tamanho;
	
	public EstoqueTenis (String marca, String modelo, String cor, int tamanho) {
		
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.tamanho = tamanho;
		
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
	
	public String toString() {
		return 
	"\nDados do Tênis\n" 
	+ " \nMarca : " +  marca  
	+  "\nModelo: "  +  modelo  
	+  "\nCor: "   +   cor  + "\n"  
	+  "Tamanho do Tênis: " +   tamanho + "\n" ;
		
	}
		
		
	}
