package br.com.alura.testes;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TestaBuscaAlunoMapa {
	public static void main(String[] args) {
		// Curso:
		Curso javaColecoes = new Curso("Dominando as coleçoes", "Paulo Silveira");

		// Aulas do curso:
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 22));

		// Alunos
		Aluno a1 = new Aluno("José José", 34658);
		Aluno a2 = new Aluno("João João", 41258);
		Aluno a3 = new Aluno("José João", 1452);

		// Alunos matriculados
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		// queremos buscar um aluno dentro do curso utilizando o seu número de matrícula
		System.out.println("Quem é o aluno com matricula 1452?");
		//fazendo um for simples no metodo buscaMatriculado (alterado posteriormente)
		Aluno aluno = javaColecoes.buscaMatriculado(14523);
		System.out.println(aluno);

		/*
		 * Uma pergunta: com que frequência faremos essa busca no curso? Frequentemente!
		 * Temos a estrutura de dados eficiente para fazer associações, ou seja, dado um
		 * número (a matrícula), teremos um aluno associado correspondente, como se
		 * fosse uma tabela. O nome da estrutura que faz muito bem isso é o Map.
		 * Add em Curso o Map e agora assim que alguem matricular um aluno já fazer essa associaçao
		 * por isso modificar o matricula(). 
		 */
		

	}

}
