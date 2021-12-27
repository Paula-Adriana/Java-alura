package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		// Generics
		ArrayList<Conta> lista = new ArrayList();

		Conta cc1 = new ContaCorrente(22, 22);
		Conta cc2 = new ContaCorrente(22, 22);

		lista.add(cc1);

		boolean existe = lista.contains(cc2); // novo

		System.out.println("Já existe? " + existe);

		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

	/*
	 * Como sabemos, a referência cc2 não existe na lista, contudo, os dados da
	 * conta são exatamente os mesmos da cc1. Na prática, as duas referências
	 * representam uma mesma conta na vida real. o contains() faz um laço em cima de
	 * cada elemento do array, internamente, e verifica se a referência que está
	 * sendo guardada é igual ao que foi passado, que no caso é cc2. O que o
	 * contains() utiliza por padrão chama-se equals() método da classe Object.
	 */

}
