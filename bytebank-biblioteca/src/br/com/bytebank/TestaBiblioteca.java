package br.com.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaBiblioteca {

	public static void main(String[] args) {
		/*Agora vamos usar a classe conta usando o arquivo jar. Botao direito em cima do arquivo jar
		 * build path -> add */
		Conta c = new ContaCorrente (123, 321);
		c.deposita(200.3);
		System.out.println(c.getSaldo());
	}

}
