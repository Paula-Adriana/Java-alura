package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		
		/*
		 * E se quisermos inicializar um array capaz de armazenar qualquer tipo de
		 * refer�ncia? Precisar�amos do tipo mais gen�rico poss�vel, neste caso, seria
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
		 * Vemos que o compilador n�o permite. Isso acontece porque o compilador n�o
		 * verifica a linha onde � criado o objeto ContaPoupanca(), o que ele faz �
		 * verificar o array, e buscar o tipo de refer�ncia nele contido.
		 * 
		 * o array � do tipo Conta, ou seja, mais gen�rica. Isso significa que ela
		 * poderia apontar tanto para ContaCorrente, quanto para ContaPoupanca. Por esse
		 * motivo o compilador aponta o erro, pois diante dessa dualidade, ele n�o tem
		 * certeza se a seguinte linha de c�digo funcionar�
		 */
		// ContaPoupanca ref = contas[1];

		/*
		 * Como n�s estamos controlando a execu��o, sabemos que esta posi��o do array
		 * aponta para o objeto ContaPoupanca. ref � um objeto do tipo ContaPoupanca(),
		 * portanto, aponta para o objeto ContaPoupanca. Por isso, queremos informar ao
		 * compilador que isso vai funcionar, que n�s temos conhecimento de o c�digo ir�
		 * compilar. Fazemos isso por meio de um cast de refer�ncias. Transformamos uma
		 * refer�ncia de um tipo mais gen�rico, para uma de um tipo mais espec�fico.
		 * Isso pode ser chamado tamb�m de type cast:
		 */

		ContaPoupanca ref = (ContaPoupanca) referencias[1]; // type cast

	}

}
