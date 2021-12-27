package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		// Assim <Conta>, o compilador sabe que, no ArrayList que foi criado, só pode haver
		// referências do tipo Conta.
		ArrayList<Conta> lista = new ArrayList();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);


		// Nosso retorno será do tipo Object (isso antes de especificar <Conta> no
		// ArrayList),
		// já que temos um array de referências genéricas. Como sabemos que, neste caso,
		// o elemento é uma conta, podemos transformar o tipo mais genérico em
		// específico, fazendo um type cast para Conta.
		// Conta ref = (Conta) lista.get(0);
		// System.out.println(ref.getNumero());
		// especificando <Conta> não é necessário o cast

		// Removendo um elemento + tamanho do array
		lista.remove(0);
		System.out.println("O novo tamanho é: " + lista.size());

		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);

		System.out.println("----For normal----");
		// Dentro do laço, ele nos retornará uma referência do tipo Object
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i); // linha de ensino, não é necessária
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
