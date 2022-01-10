package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteClasseAnonima {
	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		/*
		 * As classes NumeroDaContaComparator e TitularDaContaComparator só foram
		 * utilizadas para encapsular um método. No entanto, O objetivo de uma classe é
		 * agrupar os elementos que devem permanecer juntos. São eles os estados, ou
		 * atributos, e funções, ou métodos. Entretanto, percebemos que nas duas últimas
		 * classes em nosso código não há nenhum atributo.
		 * 
		 * Ainda, como trabalhamos apenas com um método em cada classe, sequer
		 * utilizamos o this, o que indica um desinteresse no objeto. A criação da
		 * classe foi necessária pois é uma exigência do Java, mas não seria o meio mais
		 * indicado para encapsular um método.
		 * 
		 * Estes objetos, que são criados com o único objetivo de encapsular uma função,
		 * são chamados de FUNCTIONS OBJECTS.
		 * 
		 * Por essas razões utilizaremos um atalho no nosso código: Codigo anterior:
		 * class NumeroDaContaComparator implements Comparator<Conta> {
		 * 
		 * @Override
		 * public int compare(Conta c1, Conta c2) {
		 * return Integer.compare(c1.getNumero(), c2.getNumero()); }}
		 * 
		 * , agora:
		 */
		lista.sort(new Comparator<Conta>() { // Classe anônima

			@Override
			public int compare(Conta c1, Conta c2) {
				return Integer.compare(c1.getNumero(), c2.getNumero());
			}
		});

		/*
		 * Copiamos todo o conteúdo da classe NumeroDaContaComparator a partir de
		 * Comparator, até o final, e colaremos após new. Chamamos o construtor, sem
		 * argumentos, e inserimos toda a implementação diretamente. Estamos criando um
		 * objeto, que é compatível com o NumeroDaContaComparator.
		 * 
		 * Internamente, o Java gera uma classe que por sua vez implementa o método
		 * compare(). Essa classe gerada pode ser visualizada na pasta Bin (Teste$1) ela
		 * é gerada automaticamente, justamente por termos implementado o método da
		 * forma como fizemos acima, o que fizemos foi criar uma classe anônima. Ao
		 * implementarmos a interface Comparator, estamos criando a classe anônima.
		 * 
		 * Recapitulando, criamos uma classe compatível com a interface Comparator, pois
		 * a classe anônima a implementa. Em seguida, copiamos toda a definição da
		 * classe, a partir do nome da interface, e colamos diretamente no método,
		 * utilizando o construtor new. Para chamarmos o construtor da classe anônima,
		 * precisamos utilizar os parênteses (()), após os generics.
		 */

		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}
	}

	/*
	 * Fazendo o mesmo com a classe TitularDaContaComparator:
	 * class TitularDaContaComparator implements Comparator<Conta> {
	 * 
	 * @Override
	 * public int compare(Conta c1, Conta c2) {
	 * String nomeC1 = c1.getTitular().getNome();
	 * String nomeC2 = c2.getTitular().getNome();
	 * return nomeC1.compareTo(nomeC2); } }
	 *
	 * 
	 */
	Comparator<Conta> comp = new Comparator<Conta>() {

		@Override
		public int compare(Conta c1, Conta c2) {
			String nomeC1 = c1.getTitular().getNome();
			String nomeC2 = c2.getTitular().getNome();
			return nomeC1.compareTo(nomeC2);
		}
	};
	/*
	 * Fizemos o mesmo processo, mas neste segundo criamos uma variável comp, algo
	 * que não havíamos feito anteriormente.
	 * Este tipo de classe nos exime da obrigação de criar classes isoladas, mas ao mesmo tempo gera maior
	 * dificuldade de leitura do nosso código.
	 */
}
