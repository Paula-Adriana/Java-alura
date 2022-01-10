package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteLambda {
	public static void main(String[] args) {

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

		/*
		 * declarar a exist�ncia das lambdas expressamente, isso � feito por meio do
		 * s�mbolo de seta (->). Internamente, o Java gera uma classe que implementa a
		 * interface Comparator, e que cont�m o m�todo compare(). O foco � nos trechos
		 * cuja escrita � necess�ria, sem necessidade de nomes de m�todos e classes que
		 * estavam em excesso. Como o Java entende que estamos comparando duas contas,
		 * n�o h� necessidade de indicarmos o tipo Conta, antes de c1 e c2. Assim, temos
		 * duas varia��es de lambdas, primeiro no m�todo sort(), em que ela � bastante
		 * m�nima, com a menor quantidade poss�vel de linhas de c�digo
		 */
		lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

		/*
		 * Em seguida, onde temos a vari�vel comp, temos a defini��o do tipo Conta, e a
		 * utiliza��o das chaves ({}), com o return definido. Ambas s�o v�lidas.
		 */
		Comparator<Conta> comp = (Conta c1, Conta c2) -> {
			String nomeC1 = c1.getTitular().getNome();
			String nomeC2 = c2.getTitular().getNome();
			return nomeC1.compareTo(nomeC2);
		};

		// Ordena��o por titular
		lista.sort(comp);

		/*
		 * La�o de itera��o
		 */
		lista.forEach((conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()));

		/*
		 * lista.forEach(action) - Este m�todo sabe fazer seu pr�prio la�o, ele sabe
		 * acessar cada elemento, uma vez que os administra. Entretanto, ele n�o � capaz
		 * de definir o que ser� inserido dentro do la�o, ou seja, aquilo que desejamos
		 * fazer com cada elemento.
		 * 
		 * Dentro dos par�nteses do m�todo forEach, utilizaremos o atalho
		 * "Ctrl + Espa�o". Veremos que o ele n�o recebe um Comparator, e sim um
		 * CONSUMER. Abrindo a interface:
		 * 
		 * public interface Consumer<T> {

			//C�digo omitido

        void accept(T t);

		 * 
		 * Assim, definiremos uma classe an�nima que implementa esta interface.
		 * Lembrando que ela tamb�m utiliza os generics:
		 * 
		 * Lista.forEach(new Consumer<Conta>() { });
		 * 
		 * Entretanto, o compilador sinaliza que ainda precisamos implementar o m�todo.
		 * O Eclipse nos oferece a op��o de adiciona-los, ao clicarmos no �cone de
		 * l�mpada, ao lado esquerdo da linha em que o erro � apontado, com isso, temos
		 * o seguinte c�digo gerado automaticamente:
		 * 
		 * lista.forEach(new Consumer<Conta>() {
		 * 
		 * @Override
		 * public void accept(Conta c1) {
		 *  //TODO Auto-generated method stub }
		 * });
		 * 
		 * Em seguida, substituiremos o c�digo que foi gerado automaticamente, por
		 * aquele que hav�amos inserido em nosso la�o for:
		 * 
		 * lista.forEach(new Consumer<Conta>() {
		 * 
		 * @Override
		 * public void accept(Conta c1) {
		 * System.out.println(conta + ", " + conta.getTitular().getNome()); } });
		 * 
		 * 
		 * Ao fazer o la�o, ele consumir� cada elemento, ou seja, cada conta, portanto
		 * c1 dar� lugar � conta:
		 * 
		 * lista.forEach(new Consumer<Conta>() {
		 * 
		 * @Override
		 * public void accept(Conta conta) {
		 * System.out.println(conta + ", " + conta.getTitular().getNome()); } });
		 * 
		 * Como podemos notar, este novo c�digo � maior que o anterior, por isso,
		 * simplificaremos sua escrita. O primeiro passo ser� apagar tudo que � inserido
		 * no par�metro, at� a entrada (Conta conta) e add a seta de lambda:
		 * 
		 * lista.forEach((Conta conta) -> { System.out.println(conta + ", " + conta.getTitular().getNome()); } );
		 * 
		 * Assim como anteriormente, n�o h� necessidade de fazermos refer�ncia ao tipo
		 * Conta. Tampouco h� necessidade para as chaves ({}), j� que estamos
		 * trabalhando com uma linha de c�digo somente:
		 * 
		 * lista.forEach( (conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()));
		 * 
		 * Quem faz o la�o � a pr�pria lista, para cada elemento que for uma conta, ser�
		 * aplicado o System.out.println() que definimos.
		 */
	}
}
