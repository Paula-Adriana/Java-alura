package br.com.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExemploCurso {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		// ================== Ordenar por numero de inscritos
		cursos.sort(Comparator.comparing(c -> c.getAlunos()));// dado um curso (c) pegue os alunos desse curso ()c.get
		// outra forma
		cursos.sort(Comparator.comparing(Curso::getAlunos)); // method reference
		cursos.forEach(System.out::println);
//			br.com.java8.stream.Curso@63961c42
//			br.com.java8.stream.Curso@65b54208
//			br.com.java8.stream.Curso@1be6f5c3
//			br.com.java8.stream.Curso@6b884d57
		// OBS: Quando damos um system.out em um objeto ele invoca o metodo ToString.
		// Como n�o definimos nada ele traz
		// a referencia do objeto. Para imprimir o nome aqui somente, n�o d� pra usar o
		// reference, tem que ser o lambda.

		System.out.println();
		System.out.println("Cursos por ordem de inscritos");
		cursos.forEach(c -> System.out.println(c.getAlunos()));

		// ====================== Imprimir cursos com mais de 100 alunos

		/*
		 * Stream = interface. O Stream devolvido por esse m�todo tem uma dezena de
		 * m�todos bastante �teis. O primeiro � o filter, que recebe um predicado (um
		 * crit�rio), que deve devolver verdadeiro ou falso, dependendo se voc� deseja
		 * filtr�-lo ou n�o. Utilizaremos um lambda para isso. Repare que o filtro
		 * devolve tamb�m um Stream! � um exemplo do que chamam de fluent interface.
		 */
		System.out.println();
		System.out.println("Stream devovido");
		System.out.println(cursos.stream().filter(c -> c.getAlunos() >= 100));

		/*
		 * Vamos fazer um forEach e ver o resultado dos cursos
		 */
		System.out.println();
		System.out.println("stream com o forEach");
		System.out.println(cursos.stream().filter(c -> c.getAlunos() >= 100));
		cursos.forEach(c -> System.out.println(c.getNome()));
		/*
		 * Resultado: Python C Java 8 JavaScript. Estranho. Filtramos apenas os que tem
		 * mais de 100 alunos, e ele acabou listando todos! Por qu�? Pois modifica��es
		 * em um stream n�o modificam a cole��o/objeto que o gerou. Tudo que � feito
		 * nesse fluxo de objetos, nesse Stream, n�o impacta, n�o tem efeitos colaterais
		 * na cole��o original. A cole��o original continua com os mesmos cursos!
		 * 
		 * Para imprimir os cursos filtrados, podemos usar o forEach que existe em
		 * Stream:
		 */
		System.out.println();
		System.out.println("Cursos com mais de 100 inscritos:");
		cursos.stream().filter(c -> c.getAlunos() > 100).forEach(c -> System.out.println(c.getNome()));

		/*
		 * E se quisermos, dados esses cursos filtrados no nosso fluxo (Stream) de
		 * objetos, um novo fluxo apenas com a quantidade de alunos de cada um deles?
		 * Utilizamos o map
		 */

		System.out.println();
		System.out.println("Quantidade de alunos nos cursos com mais de 100 alunos");
		cursos.stream().filter(c -> c.getAlunos() > 100).map(Curso::getAlunos).forEach(System.out::println);
		/*
		 * O lambda passado para o filter n�o pode ser representado como um method
		 * reference, pois n�o � uma simples invoca��o de um �nico m�todo: ele compara
		 * com um n�mero.
		 */

		// =============================== Stream com primitivos
		/*
		 * Quando fizemos o map(Curso::getAlunos), recebemos de volta um
		 * Stream<Integer>, que acaba fazendo o autoboxing dos ints. Isto �, utilizar�
		 * mais recursos da JVM. Claro que, se sua cole��o � pequena, o impacto ser�
		 * irris�rio. Mas � poss�vel trabalhar s� com ints, invocando o m�todo mapToInt
		 */
		IntStream stream = cursos.stream().filter(c -> c.getAlunos() > 100).mapToInt(Curso::getAlunos);

		/*
		 * Ele devolve um IntStream, que n�o vai gerar autoboxing e possui novos m�todos
		 * espec�ficos para trabalhar com inteiros. Um exemplo? A soma:
		 */
		int soma = cursos.stream().filter(c -> c.getAlunos() > 100).mapToInt(Curso::getAlunos).sum();
		System.out.println();
		System.out.println("Soma de alunos dos cursos com mais de 100 alunos");
		System.out.println(soma);

		// ==============OPTIONAL==================
		/*
		 * quero um curso que tenha mais de 100 alunos! Pode ser qualquer um deles. H� o
		 * m�todo findAny. o findAny devolve Um Optional<Curso>
		 */
		/*
		 * Optional � uma importante nova classe do Java 8. � com ele que poderemos
		 * trabalhar de uma maneira mais organizada com poss�veis valores null. Em vez
		 * de ficar comparando if(algumaCoisa == null), o Optional j� fornece uma s�rie
		 * de m�todos para nos ajudar nessas situa��es. Por que o findAny utiliza esse
		 * recurso? Pois pode n�o haver nenhum curso com mais de 100 alunos! Nesse caso,
		 * o que seria retornado?
		 */
		Optional<Curso> optionalCurso = cursos.stream().filter(c -> c.getAlunos() >= 100).findAny();

		System.out.println();
		System.out.println("Curso com mais de 100 alunos, se n�o existir, n�o fa�a nada");
		optionalCurso.ifPresent(c -> System.out.println(c.getNome())); // O m�todo ifPresent executa um lambda (um
																		// Consumer) no caso de existir um curso dentro
																		// daquele optional

		/*
		 * Normalmente seria tudo na mesma linha ou senten�a: cursos.stream() .filter(c
		 * -> c.getAlunos() >= 100) //devolve um stream .findAny(); //devolve um
		 * optional .ifPresent(c -> System.out.println(c.getNome())); Traduzindo:
		 * Cursos, me d� o fluxo de todos os seus cursos, filtre quem tem mais de 100,
		 * encontre um deles, se encontrou, fa�a isso (metodo ifpresents) se n�o
		 * encontrou, n�o fa�a nada.
		 */

		// ============= COLECAO COM STREAM ==============
		// Como obter uma cole��o depois de alterar um Stream?
		/*
		 * m�todo collect: que coleta elementos de um Stream para produzir um outro
		 * objeto, como uma cole��o. O m�todo Collect recebe um Collector, uma interface
		 * n�o t�o trivial de se implementar. Podemos usar a classe Collectors (repare o
		 * s no final), cheio de factory methods que ajudam na cria��o de coletores. Um
		 * dos coletores mais utilizados � o retornado por Collectors.toList()
		 */
		
		cursos = cursos.stream()
				   .filter(c -> c.getAlunos() > 100)
				   .collect(Collectors.toList());
		
		
	}
}
