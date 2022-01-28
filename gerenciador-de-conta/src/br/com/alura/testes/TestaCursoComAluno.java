package br.com.alura.testes;

import java.util.Iterator;
import java.util.Set;

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
			System.out.println(aluno); // se nao colocar o ToString na classe aluno printa somente as ref dos objetos
		});

		// ==========================EQUALS()====================================

		// Queremos perguntar para coleção, por exemplo, se determinado aluno está
		// matriculado:
		System.out.println("O aluno " + a1.getNome() + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		// true. De fato, o aluno a1 está matriculado.

		/*
		 * Porém, existe um grande problema, bastante comum ao trabalhar com conjuntos,
		 * o problema do equals. Imagine que estamos nos utilizando de um web service e
		 * ele possui um formulário perguntando quem estamos procurando. Se vamos
		 * digitar no formulário, o seu retorno será uma String com o nome do aluno
		 * procurado:
		 */
		String alunoProcurado = "José José";

		/*
		 * Não podemos procurá-lo com o nosso método anterior, pois o método
		 * estaMatriculado recebe um objeto do tipo Aluno como parâmetro. Então vamos
		 * criar um objeto exatamente igual ao aluno a1 (simulando aqui que não foi
		 * passado ao dev que já existia o objeto a1) criado anteriormente, e passá-lo
		 * na função, para saber se ele está ou não dentro do curso:
		 */

		Aluno jose = new Aluno("José José", 34658);
		System.out.println("E esse José José, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(jose));
		// False! se há um new, mesmo que o objeto contenha tudo igual, ele não fará
		// referência ao primeiro, e portanto, são diferentes.

		// Testando
		System.out.println("a1 é igual a José José?");
		System.out.println(a1.equals(jose));
		// False. Dois "news" = duas referencias, ou seja, dois objetos
		// Atenção: Ao usarmos O comparador "==" ele compara a referência, e só
		// retornará true caso ambas as variáveis estiverem referenciando o mesmo objeto
		//
		// Neste caso, somente nós sabemos que se
		// trata do mesmo aluno. Ou seja, precisamos deixar claro ao programa como
		// ele pode verificar o que é igual do que é diferente. Isso se dá atraves da
		// sobrescrita do método equals na nossa classe Aluno.

		// Depois de reescrever o método equals:
		System.out.println("a1 é igual a José José?");
		System.out.println(a1.equals(jose));
		// True. Eles são iguais (como definimos no equals). No entato, por que ele
		// continua
		// dizendo que (jose) não está matriculado? Ao comparar jose com a1, o
		// resultado é true (como visto no nosso teste), porém o estaMatriculado nos
		// retorna false.
		// E ainda, se não estivessemos utiizando um set e sim uma lista, obteriamos
		// true. (?)
		// EXPLICAÇÃO:

		// ==========================HASHCODE()====================================

		/*
		 * A estrutura Set usa uma tabela de espalhamento para realizar mais rapidamente
		 * suas buscas. Imagine que cada vez que você adiciona algo dentro do seu Set
		 * para espalhar os objetos, um número mágico é gerado e todos os objetos que o
		 * tenham são agrupados. E ao buscar, em vez de comparar o objeto com todos os
		 * outros objetos contidos dentro do Set (isso daria muitas comparações), ele
		 * gera novamente o mesmo número mágico, e compara apenas com aqueles que também
		 * tiveram como resultado esse número. Ou seja, ele compara apenas dentro do
		 * grupo de semelhança. No caso da matricula não reconhecida, o aluno a1 estava
		 * num grupo diferente de josé, e por isso o método contains não conseguia
		 * encontrá-lo (mas uma lista conseguiria pois comparar um a um e por isso é
		 * mais lenta).
		 * 
		 * Como é gerado esse número mágico? Utilizando o método hashCode, por isso
		 * precisamos sobrescrevê-lo (classe aluno), mudando-o para quando criarmos um
		 * objeto Aluno com o mesmo nome, que esses objetos gerem o mesmo hashCode e
		 * portanto, fiquem no mesmo grupo.
		 */

		// Depois de sobrescrever o método hashcode:
		System.out.println("E esse José José, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(jose));
		// True. Pois ficaram no mesmo "grupo".
		// No entanto, essa sobrescrita do metodo hashcode é extremamente simplificada e
		// apenas didática.
		// Pois, O espalhamento é feito para que se tenha o menor número possível de
		// objetos dentro de um grupo, e separando alfabeticamente como estamos fazendo,
		// não é a maneira mais eficiente. Entrando na classe String do Java, vemos que
		// ela tem o método hashCode implementado, e ele já faz uma conta bem difícil,
		// para que haja o melhor espalhamento e assim, a busca seja bastante eficiente.
		// Então, podemos fazer com que o nosso hashCode devolva o hashCode da String
		// nome:
		// ver classe aluno.

		// Considere a seguinte regra: caso você sobrescreva o método equals,
		// obrigatoriamente deverá sobrescrever o método hashCode. Se equals é true
		// obrigatoriamente o hashcode deve ser true. Pois se eles são iguais eles
		// tem que ter o mesmo codigo de espalhamento o mesmo hashcode (mesmo grupo).

		System.out.println(a1.hashCode() == jose.hashCode());
		// true.

		// ==============================================================

		/*
		 * como se acessava os elementos de um Set antes do Java 5?
		 * 
		 * Iterator: objeto (antigo - antes de existir foreach e for) que todas as
		 * coleções possuem (pois Iterable é a interface mãe de Collection), que serve
		 * para iterar entre os elementos dentro da coleção, selecionando sempre o
		 * próximo objeto da coleção
		 */
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();

		// Geralmente utilizado com um while. Iterator<T> tem poucos metodos, vamos usar
		// aqui o hasNext() - que devolve um booleano dizendo se há ou não um próximo
		// elemento na coleção. Então a primeira pergunta que sempre fazemos para o
		// iterador é: "tem um próximo elemento na coleção?". Até porque se não houver
		// um próximo elemento, não iremos querer pegá-lo. E o método é o next() - que
		// justamente devolve o próximo elemento.
		// A ordem na qual os elementos são devolvidos pelo Iterator depende da
		// implementação da Collection utilizada.

		while (iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}

	}
}