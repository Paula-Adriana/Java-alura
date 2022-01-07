package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteSortComparator {
	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		// antes da ordenação
		for (Conta conta : lista) {
			System.out.println(conta); // lembrando que o syso vem do toString()
		}
		System.out.println("-----------------------");

		// ordenar nossa lista: O método utilizado chama-se sort(), e exige um
		// "Comparator", c. Ele representa o critério de ordenação, serve para comparar
		// duas referências, por meio de um método presente na interface Comparator.
		class NumeroDaContaComparator implements Comparator<Conta> {

			@Override
			public int compare(Conta c1, Conta c2) {

//				Primeira forma + código:
//				if (c1.getNumero() < c2.getNumero()) {
//					return -1;
//				}
//
//				if (c1.getNumero() > c2.getNumero()) {
//					return 1;
//				}
//
//				return 0;

//				Segunda forma + simplificada:
// 				return c1.getNumero() - c2.getNumero();

// 				Terceira forma + elegante usando o Wrapper (Assim como a String, o Integer também tem implementado um método de comparação):
				return Integer.compare(c1.getNumero(), c2.getNumero());
			}
		}

		// Nosso próximo passo será criar uma instância da classe
		// NumeroDaContaComparator, para isso, criaremos um objeto desta classe, no
		// entanto, no dia a dia, ela não é feita desta forma:

		// NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		// e sim copiando somente a parte do new dentro do parametro do metodo: 
		lista.sort(new NumeroDaContaComparator());

		// depois da ordenação
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		//COLLETIONS:
		Collections.sort(lista);

	}

}
