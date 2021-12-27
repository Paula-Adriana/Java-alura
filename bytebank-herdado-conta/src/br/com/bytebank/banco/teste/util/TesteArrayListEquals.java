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

		System.out.println("J� existe? " + existe);

		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

	/*
	 * Como sabemos, a refer�ncia cc2 n�o existe na lista, contudo, os dados da
	 * conta s�o exatamente os mesmos da cc1. Na pr�tica, as duas refer�ncias
	 * representam uma mesma conta na vida real. o contains() faz um la�o em cima de
	 * cada elemento do array, internamente, e verifica se a refer�ncia que est�
	 * sendo guardada � igual ao que foi passado, que no caso � cc2. O que o
	 * contains() utiliza por padr�o chama-se equals() m�todo da classe Object.
	 */

}
