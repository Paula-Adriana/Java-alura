package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteSortStringTo {
	public static void main(String[] args) {

		// 4 contas agora com clientes
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

		for (Conta conta : lista) {
			//Como o toString tem somente numero e agencia vamos concatenar o nome tb
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}
		System.out.println("-----------------------");

		// Fazer um comparador para o nome do titular
		class TitularDaContaComparator implements Comparator<Conta> {

			@Override
			public int compare(Conta c1, Conta c2) {

				// Agora nos resta criar o método de comparação pela ordem alfabética. A classe
				// String já possui, implementado, um método de ordenação utilizando este
				// critério.
				String nomeC1 = c1.getTitular().getNome();
				String nomeC2 = c2.getTitular().getNome();

				// Ao chamarmos o nomeC1, surgirá uma lista de métodos, dentre eles, temos o
				// compareTo(), que recebe como parâmetro um outro String, e que resulta em um
				// int. Quando os "Strings" forem iguais, o retorno é 0, se um for menor que o
				// outro, o resultado é negativo, e se um for maior que o outro, o resultado é
				// positivo. Já que o resultado é um Integer, podemos inseri-lo diretamente como
				// retorno
				return nomeC1.compareTo(nomeC2);
			}

		}

		lista.sort(new TitularDaContaComparator());

		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}

	}

}
