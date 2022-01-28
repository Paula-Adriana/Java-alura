package br.com.alura.testes;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TestaBuscaAlunoMapa {
	public static void main(String[] args) {
		// Curso:
		Curso javaColecoes = new Curso("Dominando as cole�oes", "Paulo Silveira");

		// Aulas do curso:
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando cole��es", 22));

		// Alunos
		Aluno a1 = new Aluno("Jos� Jos�", 34658);
		Aluno a2 = new Aluno("Jo�o Jo�o", 41258);
		Aluno a3 = new Aluno("Jos� Jo�o", 1452);

		// Alunos matriculados
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		// queremos buscar um aluno dentro do curso utilizando o seu n�mero de matr�cula
		System.out.println("Quem � o aluno com matricula 1452?");
		//fazendo um for simples no metodo buscaMatriculado (alterado posteriormente)
		Aluno aluno = javaColecoes.buscaMatriculado(14523);
		System.out.println(aluno);

		/*
		 * Uma pergunta: com que frequ�ncia faremos essa busca no curso? Frequentemente!
		 * Temos a estrutura de dados eficiente para fazer associa��es, ou seja, dado um
		 * n�mero (a matr�cula), teremos um aluno associado correspondente, como se
		 * fosse uma tabela. O nome da estrutura que faz muito bem isso � o Map.
		 * Add em Curso o Map e agora assim que alguem matricular um aluno j� fazer essa associa�ao
		 * por isso modificar o matricula(). 
		 */
		

	}

}
