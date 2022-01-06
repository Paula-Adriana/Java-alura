package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappersIntegers {

	public static void main(String[] args) {

		int[] idades = new int[5];

		String[] nomes = new String[5];

		int idade = 29;
		Integer idadeRef = Integer.valueOf(29); // AUTOBOXING - envelopando int em obj. Para criarmos um objeto, temos
												// que utilizar a classe, com o método estático valueOf() (e termos como
												// resultado uma referência), que receberá
												// um primitivo int. Aqui, primitivo para referencia!!

		int valor = idadeRef.intValue(); // UNBOXING - desenvelopando o obj em int. Temos uma referência, que aponta
											// para um objeto, e queremos obter desta
											// classe wrapper - que embrulha o primitivo -, qual o valor que nela está
											// contido. É para isso que o método intValue() é utilizado, ele nos
											// devolve, justamente, o primitivo: Aqui, referencia para primitivo!!

		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); // autoboxing

	}
}
