package br.com.java8.foreach;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachConsumer {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("Palavra Looooooooooooooooooooooonga");
		palavras.add("Palavra Looooonga");
		palavras.add("Palavra Longa");

		// ======================= ForEach com consumer===============================
		/*
		 * class ConsumidorDeString implements Consumer<String> { public void
		 * accept(String s) { System.out.println(s); } }
		 * 
		 * Invoca�ao: Consumer<String> consumidor = new ConsumidorDeString(); //Aqui
		 * temos uma classe an�nima, usamos com frequ�ncia para implementar listeners e
		 * callbacks que n�o ter�o reaproveitamento
		 * 
		 * palavras.forEach(consumidor);
		 */

		// ==================================LAMBDA===================================

		// Com o lambda fica assim:
		palavras.forEach(s -> System.out.println(s));
		// Essa sintaxe do lambda funciona para qualquer interface que tenha apenas um
		// m�todo abstrato, e � por esse motivo
		// que nem precisamos falar que estamos implementando o m�todo accept, j� que
		// n�o h� outra possibilidade.
		// Como essa interface s� tem um m�todo, n�o precisamos escrever o nome do
		// m�todo. Tamb�m n�o daremos new. Apenas declararemos os argumentos e o bloco a
		// ser executado, separados por ->

		// ============================================SORT
		// Usando sort
		/*
		 * class ComparadorPorTamanho implements Comparator<String> {
		 * 
		 * @Override public int compare(String s1, String s2) { if (s1.length() <
		 * s2.length()) return -1; if (s1.length() > s2.length()) return 1; return 0; }
		 * } ComparadorPorTamanho comparador = new ComparadorPorTamanho();
		 * palavras.sort(comparador);
		 */

		// ==================================LAMBDA===================================

		// Com o lambda fica assim:
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println(palavras);

		// Metodo default
		// voc� pode ter um m�todo default que � est�tico. Esse � o caso do
		// Comparator.comparing, que � uma f�brica, uma factory, de Comparator. Passamos
		// o lambda para dizer qual ser� o crit�rio de compara��o desse Comparator.
		// Dizemos que Comparator.comparing recebe um lambda, mas essa � uma express�o
		// do dia a dia. Na verdade, ela recebe uma inst�ncia de uma interface
		// funcional. No caso � a interface Function que tem apenas um m�todo, o apply.
		// est� escrito algo como "palavras ordene comparando s.length"
		palavras.sort(Comparator.comparing(s -> s.length()));

		// M�todo reference
		// � muito comum escrevermos lambdas curtos, que simplesmente invocam um �nico
		// m�todo. � o exemplo de s -> s.length(). Dada uma String, invoque e retorne o
		// m�todo length. Por esse motivo, h� uma forma de escrever esse tipo de lambda
		// de uma forma ainda mais reduzida.
		//Fazemos uma refer�ncia ao m�todo (method reference):
		//Est� escrito: "palavras ordene comparando a length do String" ou, quero invocar o m�todo length da String
		palavras.sort(Comparator.comparing(String::length));

	}
}
