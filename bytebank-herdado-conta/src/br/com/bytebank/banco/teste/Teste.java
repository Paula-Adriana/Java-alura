package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

		// Object = referência genérica que se liga a um objeto mais específico. Podemos
		// utilizar tanto a
		// referência mais específica quanto a mais genérica para designar ContaCorrete
		// e ContaPoupanca
		Object cc = new ContaCorrente(22, 33);
		// ContaCorrente cc = new ContaCorrente(22, 33);

		Object cp = new ContaPoupanca(33, 22);
		// ContaPoupanca cp = new ContaPoupanca(33, 22);
		
		//System.out.println(cc);
		/*
		 * Observem que foi impresso o nome da classe em seu full qualified name,
		 * mais @cb51256. De onde vem esse código e quem o implementou? A classe Object;
		 * essa classe possui alguma funcionalidade que resulta na produção dessa
		 * String.
		 * 
		 * Essa funcionalidade é um método, afinal, dentro da funcionalidade existe um
		 * método encapsulado. Esse método é chamado toString(), e ele foi herdado de
		 * Object. 
		 * 
		 * Caso digitemos o ponto (.) em System.out.println(cc) serão sugeridos
		 * pelo Eclipse todos os métodos implementados na classe Object, afinal estamos
		 * trabalhando com essa referência genérica em nosso código.
		 */
		System.out.println(cc.toString());
		/*Ao sobreescrevermos esse metodo em conta corrente podemos colocar um retorno lá
		 * como a msg "conta corrente numero tal" o .toString() não é necessário! 
		 * funciona sem pq é implicito. Vamos colocar essa mensagem na classe conta + generico
		 * e nas classes filhas + especifico*/
		System.out.println(cp);
		

	}

	

}
