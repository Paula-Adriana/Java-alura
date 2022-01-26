package br.com.alura.testes;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TestaCursoComAluno {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleçoes", "Paulo Silveira");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 22));

		Aluno a1 = new Aluno("José José", 34658);
		Aluno a2 = new Aluno("João João", 41258);
		Aluno a3 = new Aluno("José João", 1452);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Alunos matriculados: ");
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno); //se nao colocar o ToString na classe aluno printa somente as ref dos objetos
		});
	}
}