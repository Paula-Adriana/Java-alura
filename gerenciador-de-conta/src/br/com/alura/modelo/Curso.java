package br.com.alura.modelo;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String Instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();

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
	 * programar defensivamente: fazendo com que o método getAulas devolva uma cópia
	 * da coleção de aulas. Melhor ainda: podemos devolver essa cópia de tal forma
	 * que ela não possa ser alterada, ou seja, que ela seja não modificável, usando
	 * o método Collections.unmodifiableList. Qualquer tentativa de modificação
	 * pelos metodos de List, vai lançar uma exception, obrigando a utilizar os
	 * metodos que implementamos.
	 */
	public List<Aula> getAula() {
		return Collections.unmodifiableList(aulas);
	}

	/*
	 * Método para adicionar uma aula no curso.
	 */
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();

		// maneira elegante:
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	// return tempoTotal;

	@Override
	public String toString() {
		return "[Curso: " + getNome() + ", tempo total: " + this.getTempoTotal() + ".]";
	}

	// metodo que encapsula o modo de matricula
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}

	// Boa pratica! Quando alguem quiser a listagem dos alunos recebe uma copia pois
	// a listagem original é nao modificavel
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
	    return this.alunos.contains(aluno);//contains utiliza o equals
	}
	
	

}
