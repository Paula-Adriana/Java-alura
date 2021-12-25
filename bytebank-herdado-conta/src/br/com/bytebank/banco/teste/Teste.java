package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

		// Object = refer�ncia gen�rica que se liga a um objeto mais espec�fico. Podemos
		// utilizar tanto a
		// refer�ncia mais espec�fica quanto a mais gen�rica para designar ContaCorrete
		// e ContaPoupanca
		Object cc = new ContaCorrente(22, 33);
		// ContaCorrente cc = new ContaCorrente(22, 33);

		Object cp = new ContaPoupanca(33, 22);
		// ContaPoupanca cp = new ContaPoupanca(33, 22);
		
		//System.out.println(cc);
		/*
		 * Observem que foi impresso o nome da classe em seu full qualified name,
		 * mais @cb51256. De onde vem esse c�digo e quem o implementou? A classe Object;
		 * essa classe possui alguma funcionalidade que resulta na produ��o dessa
		 * String.
		 * 
		 * Essa funcionalidade � um m�todo, afinal, dentro da funcionalidade existe um
		 * m�todo encapsulado. Esse m�todo � chamado toString(), e ele foi herdado de
		 * Object. 
		 * 
		 * Caso digitemos o ponto (.) em System.out.println(cc) ser�o sugeridos
		 * pelo Eclipse todos os m�todos implementados na classe Object, afinal estamos
		 * trabalhando com essa refer�ncia gen�rica em nosso c�digo.
		 */
		System.out.println(cc.toString());
		/*Ao sobreescrevermos esse metodo em conta corrente podemos colocar um retorno l�
		 * como a msg "conta corrente numero tal" o .toString() n�o � necess�rio! 
		 * funciona sem pq � implicito. Vamos colocar essa mensagem na classe conta + generico
		 * e nas classes filhas + especifico*/
		System.out.println(cp);
		

	}

	

}
