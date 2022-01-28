package br.com.alura.testes;

import java.util.Iterator;
import java.util.Set;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TestaCursoComAluno {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole�oes", "Paulo Silveira");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando cole��es", 22));

		Aluno a1 = new Aluno("Jos� Jos�", 34658);
		Aluno a2 = new Aluno("Jo�o Jo�o", 41258);
		Aluno a3 = new Aluno("Jos� Jo�o", 1452);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Alunos matriculados: ");
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno); // se nao colocar o ToString na classe aluno printa somente as ref dos objetos
		});

		// ==========================EQUALS()====================================

		// Queremos perguntar para cole��o, por exemplo, se determinado aluno est�
		// matriculado:
		System.out.println("O aluno " + a1.getNome() + " est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		// true. De fato, o aluno a1 est� matriculado.

		/*
		 * Por�m, existe um grande problema, bastante comum ao trabalhar com conjuntos,
		 * o problema do equals. Imagine que estamos nos utilizando de um web service e
		 * ele possui um formul�rio perguntando quem estamos procurando. Se vamos
		 * digitar no formul�rio, o seu retorno ser� uma String com o nome do aluno
		 * procurado:
		 */
		String alunoProcurado = "Jos� Jos�";

		/*
		 * N�o podemos procur�-lo com o nosso m�todo anterior, pois o m�todo
		 * estaMatriculado recebe um objeto do tipo Aluno como par�metro. Ent�o vamos
		 * criar um objeto exatamente igual ao aluno a1 (simulando aqui que n�o foi
		 * passado ao dev que j� existia o objeto a1) criado anteriormente, e pass�-lo
		 * na fun��o, para saber se ele est� ou n�o dentro do curso:
		 */

		Aluno jose = new Aluno("Jos� Jos�", 34658);
		System.out.println("E esse Jos� Jos�, est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(jose));
		// False! se h� um new, mesmo que o objeto contenha tudo igual, ele n�o far�
		// refer�ncia ao primeiro, e portanto, s�o diferentes.

		// Testando
		System.out.println("a1 � igual a Jos� Jos�?");
		System.out.println(a1.equals(jose));
		// False. Dois "news" = duas referencias, ou seja, dois objetos
		// Aten��o: Ao usarmos O comparador "==" ele compara a refer�ncia, e s�
		// retornar� true caso ambas as vari�veis estiverem referenciando o mesmo objeto
		//
		// Neste caso, somente n�s sabemos que se
		// trata do mesmo aluno. Ou seja, precisamos deixar claro ao programa como
		// ele pode verificar o que � igual do que � diferente. Isso se d� atraves da
		// sobrescrita do m�todo equals na nossa classe Aluno.

		// Depois de reescrever o m�todo equals:
		System.out.println("a1 � igual a Jos� Jos�?");
		System.out.println(a1.equals(jose));
		// True. Eles s�o iguais (como definimos no equals). No entato, por que ele
		// continua
		// dizendo que (jose) n�o est� matriculado? Ao comparar jose com a1, o
		// resultado � true (como visto no nosso teste), por�m o estaMatriculado nos
		// retorna false.
		// E ainda, se n�o estivessemos utiizando um set e sim uma lista, obteriamos
		// true. (?)
		// EXPLICA��O:

		// ==========================HASHCODE()====================================

		/*
		 * A estrutura Set usa uma tabela de espalhamento para realizar mais rapidamente
		 * suas buscas. Imagine que cada vez que voc� adiciona algo dentro do seu Set
		 * para espalhar os objetos, um n�mero m�gico � gerado e todos os objetos que o
		 * tenham s�o agrupados. E ao buscar, em vez de comparar o objeto com todos os
		 * outros objetos contidos dentro do Set (isso daria muitas compara��es), ele
		 * gera novamente o mesmo n�mero m�gico, e compara apenas com aqueles que tamb�m
		 * tiveram como resultado esse n�mero. Ou seja, ele compara apenas dentro do
		 * grupo de semelhan�a. No caso da matricula n�o reconhecida, o aluno a1 estava
		 * num grupo diferente de jos�, e por isso o m�todo contains n�o conseguia
		 * encontr�-lo (mas uma lista conseguiria pois comparar um a um e por isso �
		 * mais lenta).
		 * 
		 * Como � gerado esse n�mero m�gico? Utilizando o m�todo hashCode, por isso
		 * precisamos sobrescrev�-lo (classe aluno), mudando-o para quando criarmos um
		 * objeto Aluno com o mesmo nome, que esses objetos gerem o mesmo hashCode e
		 * portanto, fiquem no mesmo grupo.
		 */

		// Depois de sobrescrever o m�todo hashcode:
		System.out.println("E esse Jos� Jos�, est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(jose));
		// True. Pois ficaram no mesmo "grupo".
		// No entanto, essa sobrescrita do metodo hashcode � extremamente simplificada e
		// apenas did�tica.
		// Pois, O espalhamento � feito para que se tenha o menor n�mero poss�vel de
		// objetos dentro de um grupo, e separando alfabeticamente como estamos fazendo,
		// n�o � a maneira mais eficiente. Entrando na classe String do Java, vemos que
		// ela tem o m�todo hashCode implementado, e ele j� faz uma conta bem dif�cil,
		// para que haja o melhor espalhamento e assim, a busca seja bastante eficiente.
		// Ent�o, podemos fazer com que o nosso hashCode devolva o hashCode da String
		// nome:
		// ver classe aluno.

		// Considere a seguinte regra: caso voc� sobrescreva o m�todo equals,
		// obrigatoriamente dever� sobrescrever o m�todo hashCode. Se equals � true
		// obrigatoriamente o hashcode deve ser true. Pois se eles s�o iguais eles
		// tem que ter o mesmo codigo de espalhamento o mesmo hashcode (mesmo grupo).

		System.out.println(a1.hashCode() == jose.hashCode());
		// true.

		// ==============================================================

		/*
		 * como se acessava os elementos de um Set antes do Java 5?
		 * 
		 * Iterator: objeto (antigo - antes de existir foreach e for) que todas as
		 * cole��es possuem (pois Iterable � a interface m�e de Collection), que serve
		 * para iterar entre os elementos dentro da cole��o, selecionando sempre o
		 * pr�ximo objeto da cole��o
		 */
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();

		// Geralmente utilizado com um while. Iterator<T> tem poucos metodos, vamos usar
		// aqui o hasNext() - que devolve um booleano dizendo se h� ou n�o um pr�ximo
		// elemento na cole��o. Ent�o a primeira pergunta que sempre fazemos para o
		// iterador �: "tem um pr�ximo elemento na cole��o?". At� porque se n�o houver
		// um pr�ximo elemento, n�o iremos querer peg�-lo. E o m�todo � o next() - que
		// justamente devolve o pr�ximo elemento.
		// A ordem na qual os elementos s�o devolvidos pelo Iterator depende da
		// implementa��o da Collection utilizada.

		while (iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}

	}
}