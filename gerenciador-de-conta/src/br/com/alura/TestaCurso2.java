package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleçoes", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 22));

		// Listagem das aulas como foi inserido aqui em cima
		List<Aula> aulasImutaveis = javaColecoes.getAula();
		System.out.println(aulasImutaveis);

		// Para ordenar essa lista não é possivel usar o sort do Collections pois a
		// nossa lista é imutavel. Entao: utlizar da API de coleções. Há um construtor das nossas coleções que
		// recebem o próprio tipo, para construir um igual, como se fosse um clone. Para
		// isso, basta passarmos a lista de aulasImutaveis para o construtor do ArrayList, por
		// exemplo:
		
		List<Aula> aula = new ArrayList<>(aulasImutaveis);
		Collections.sort(aula);
		System.out.println(aula);
		
		//Tempo Total das aulas
		System.out.println(javaColecoes.getTempoTotal());
		
		//Listagem dos cursos
		System.out.println(javaColecoes);
	}
}
