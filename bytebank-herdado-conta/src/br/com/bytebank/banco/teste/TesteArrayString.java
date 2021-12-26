package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayString {

	public static void main(String[] args) {
		// O (String[] args) declarado no método main é um array de referencia.

		System.out.println("Funcionou");

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);

		}
		/*
		 * Por que então existe o String[] ao declararmos o método main?
		 * 
		 * Ele existe para que possamos passar parâmetros a partir do terminal. Assim,
		 * temos uma forma de interagir com o programa Java a partir da linha de
		 * comando. Chamamos a aplicação e, simultaneamente, é possível definirmos
		 * parâmetros. Para fazer isso no eclipse: no botão verde com o símbolo de play,
		 * localizado na barra superior, há na direita uma seta menor, apontando para
		 * baixo. Clicando nela, na opção "Run Configurations" é possível manipularmos
		 * as configurações, ou seja, como a máquina virtual do Java chamará a nossa
		 * classe.
		 * 
		 * imagem com um círculo verde, com um triangulo branco dentro, indicando uma
		 * função de play, ao lado, do lado exterior, há um triângulo menor, preto, que
		 * ao ser clicado exibe um menu com demias opções
		 * 
		 * Na lateral esquerda, há uma lista com todas as run configurations que já
		 * foram utilizadas para rodar os programas em nossa máquina.
		 * 
		 * Na parte superior temos diversas abas, uma delas é a Arguments, ou seja,
		 * argumentos. Nela, podemos inserir os parâmetros: teste se funcinou mesmo, por
		 * exemplo:
		 * 
		 * Funcionou teste se funciona mesmo
		 * 
		 * 
		 */

	}
}