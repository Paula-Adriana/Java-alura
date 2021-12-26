package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		
		/*
		 * E se quisermos inicializar um array capaz de armazenar qualquer tipo de
		 * referência? Precisaríamos do tipo mais genérico possível, neste caso, seria
		 * do tipo Object.
		 */
		Object[] referencias = new Object[5]; // Array de referencias - Criado o objeto array classe Object .

		// Objeto CC criado.
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1; // referenciando cc1 na primeira posicao do array.

		// Objeto CP criado.
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencias[1] = cc2; // referenciando cc2 na segunda posicao do array.

		/*
		 * // ContaPoupanca ref = contas[1];
		 * 
		 * Vemos que o compilador não permite. Isso acontece porque o compilador não
		 * verifica a linha onde é criado o objeto ContaPoupanca(), o que ele faz é
		 * verificar o array, e buscar o tipo de referência nele contido.
		 * 
		 * o array é do tipo Conta, ou seja, mais genérica. Isso significa que ela
		 * poderia apontar tanto para ContaCorrente, quanto para ContaPoupanca. Por esse
		 * motivo o compilador aponta o erro, pois diante dessa dualidade, ele não tem
		 * certeza se a seguinte linha de código funcionará
		 */
		// ContaPoupanca ref = contas[1];

		/*
		 * Como nós estamos controlando a execução, sabemos que esta posição do array
		 * aponta para o objeto ContaPoupanca. ref é um objeto do tipo ContaPoupanca(),
		 * portanto, aponta para o objeto ContaPoupanca. Por isso, queremos informar ao
		 * compilador que isso vai funcionar, que nós temos conhecimento de o código irá
		 * compilar. Fazemos isso por meio de um cast de referências. Transformamos uma
		 * referência de um tipo mais genérico, para uma de um tipo mais específico.
		 * Isso pode ser chamado também de type cast:
		 */

		ContaPoupanca ref = (ContaPoupanca) referencias[1]; // type cast

	}

}
