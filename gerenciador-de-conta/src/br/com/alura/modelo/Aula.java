package br.com.alura.modelo;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		//super(); não é necessario pois o super é implicito. 
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	//escrever ou gerar somente os metodos que vai utilizar. 
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + " mimutos]";
	}

	@Override//vem da comparable
	public int compareTo(Aula outraAula) {//metodo de comparacao delegado ao compareTo pelo titulo
		return this.titulo.compareTo(outraAula.titulo);
	}
	
	
	
	
	
}
