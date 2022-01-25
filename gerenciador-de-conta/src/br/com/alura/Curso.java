package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

	private String nome;
	private String Instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		Instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return Instrutor;
	}

	/*
	 * programar defensivamente: fazendo com que o m�todo getAulas devolva uma c�pia
	 * da cole��o de aulas. Melhor ainda: podemos devolver essa c�pia de tal forma
	 * que ela n�o possa ser alterada, ou seja, que ela seja n�o modific�vel, usando
	 * o m�todo Collections.unmodifiableList. 
	 * Qualquer tentativa de modifica��o pelos metodos de List, vai lan�ar uma exception, obrigando a utilizar 
	 * os metodos que implementamos.
	 */
	public List<Aula> getAula() {
		return Collections.unmodifiableList(aulas);
	}

	/*
	 * M�todo para adicionar uma aula no curso. 
	 */
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
		
			//maneira elegante:
			return this.aulas.stream().mapToInt(Aula::getTempo).sum();
		}
		//return tempoTotal;
	
	@Override
	public String toString() {
		return "[Curso: " + getNome() + ", tempo total: " + this.getTempoTotal() + ".]";
	}
	}

