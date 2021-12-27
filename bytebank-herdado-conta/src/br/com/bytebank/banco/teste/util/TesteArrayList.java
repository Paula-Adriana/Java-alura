package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		// Assim <Conta>, o compilador sabe que, no ArrayList que foi criado, s� pode haver
		// refer�ncias do tipo Conta.
		ArrayList<Conta> lista = new ArrayList();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);


		// Nosso retorno ser� do tipo Object (isso antes de especificar <Conta> no
		// ArrayList),
		// j� que temos um array de refer�ncias gen�ricas. Como sabemos que, neste caso,
		// o elemento � uma conta, podemos transformar o tipo mais gen�rico em
		// espec�fico, fazendo um type cast para Conta.
		// Conta ref = (Conta) lista.get(0);
		// System.out.println(ref.getNumero());
		// especificando <Conta> n�o � necess�rio o cast

		// Removendo um elemento + tamanho do array
		lista.remove(0);
		System.out.println("O novo tamanho �: " + lista.size());

		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);

		System.out.println("----For normal----");
		// Dentro do la�o, ele nos retornar� uma refer�ncia do tipo Object
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i); // linha de ensino, n�o � necess�ria
			System.out.println(oRef);
			// Lembrando que, internamente, o nosso System.out.println() utiliza o
			// toString() da classe ContaCorrente.
		}
		System.out.println();
		System.out.println("----ForEach----");
		// Outra forma para o FOR

		for (Conta conta : lista) {//aqui com a classe Conta parametrizada no ArrayList. 
			System.out.println(conta);

		}

	}

}
