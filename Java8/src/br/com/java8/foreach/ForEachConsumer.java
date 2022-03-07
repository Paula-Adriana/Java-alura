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
		 * Invocaçao: Consumer<String> consumidor = new ConsumidorDeString(); //Aqui
		 * temos uma classe anônima, usamos com frequência para implementar listeners e
		 * callbacks que não terão reaproveitamento
		 * 
		 * palavras.forEach(consumidor);
		 */

		// ==================================LAMBDA===================================

		// Com o lambda fica assim:
		palavras.forEach(s -> System.out.println(s));
		// Essa sintaxe do lambda funciona para qualquer interface que tenha apenas um
		// método abstrato, e é por esse motivo
		// que nem precisamos falar que estamos implementando o método accept, já que
		// não há outra possibilidade.
		// Como essa interface só tem um método, não precisamos escrever o nome do
		// método. Também não daremos new. Apenas declararemos os argumentos e o bloco a
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
		// você pode ter um método default que é estático. Esse é o caso do
		// Comparator.comparing, que é uma fábrica, uma factory, de Comparator. Passamos
		// o lambda para dizer qual será o critério de comparação desse Comparator.
		// Dizemos que Comparator.comparing recebe um lambda, mas essa é uma expressão
		// do dia a dia. Na verdade, ela recebe uma instância de uma interface
		// funcional. No caso é a interface Function que tem apenas um método, o apply.
		// está escrito algo como "palavras ordene comparando s.length"
		palavras.sort(Comparator.comparing(s -> s.length()));

		// Método reference
		// É muito comum escrevermos lambdas curtos, que simplesmente invocam um único
		// método. É o exemplo de s -> s.length(). Dada uma String, invoque e retorne o
		// método length. Por esse motivo, há uma forma de escrever esse tipo de lambda
		// de uma forma ainda mais reduzida.
		//Fazemos uma referência ao método (method reference):
		//Está escrito: "palavras ordene comparando a length do String" ou, quero invocar o método length da String
		palavras.sort(Comparator.comparing(String::length));

	}
}
