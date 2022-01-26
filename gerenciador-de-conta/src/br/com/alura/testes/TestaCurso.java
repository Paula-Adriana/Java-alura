package br.com.alura.testes;

import java.util.List;

import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleçoes", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 22));
		System.out.println(javaColecoes.getAula());
	}
}
