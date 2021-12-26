package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayString {

	public static void main(String[] args) {
		// O (String[] args) declarado no m�todo main � um array de referencia.

		System.out.println("Funcionou");

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);

		}
		/*
		 * Por que ent�o existe o String[] ao declararmos o m�todo main?
		 * 
		 * Ele existe para que possamos passar par�metros a partir do terminal. Assim,
		 * temos uma forma de interagir com o programa Java a partir da linha de
		 * comando. Chamamos a aplica��o e, simultaneamente, � poss�vel definirmos
		 * par�metros. Para fazer isso no eclipse: no bot�o verde com o s�mbolo de play,
		 * localizado na barra superior, h� na direita uma seta menor, apontando para
		 * baixo. Clicando nela, na op��o "Run Configurations" � poss�vel manipularmos
		 * as configura��es, ou seja, como a m�quina virtual do Java chamar� a nossa
		 * classe.
		 * 
		 * imagem com um c�rculo verde, com um triangulo branco dentro, indicando uma
		 * fun��o de play, ao lado, do lado exterior, h� um tri�ngulo menor, preto, que
		 * ao ser clicado exibe um menu com demias op��es
		 * 
		 * Na lateral esquerda, h� uma lista com todas as run configurations que j�
		 * foram utilizadas para rodar os programas em nossa m�quina.
		 * 
		 * Na parte superior temos diversas abas, uma delas � a Arguments, ou seja,
		 * argumentos. Nela, podemos inserir os par�metros: teste se funcinou mesmo, por
		 * exemplo:
		 * 
		 * Funcionou teste se funciona mesmo
		 * 
		 * 
		 */

	}
}