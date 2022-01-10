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
		 * declarar a existência das lambdas expressamente, isso é feito por meio do
		 * símbolo de seta (->). Internamente, o Java gera uma classe que implementa a
		 * interface Comparator, e que contém o método compare(). O foco é nos trechos
		 * cuja escrita é necessária, sem necessidade de nomes de métodos e classes que
		 * estavam em excesso. Como o Java entende que estamos comparando duas contas,
		 * não há necessidade de indicarmos o tipo Conta, antes de c1 e c2. Assim, temos
		 * duas variações de lambdas, primeiro no método sort(), em que ela é bastante
		 * mínima, com a menor quantidade possível de linhas de código
		 */
		lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

		/*
		 * Em seguida, onde temos a variável comp, temos a definição do tipo Conta, e a
		 * utilização das chaves ({}), com o return definido. Ambas são válidas.
		 */
		Comparator<Conta> comp = (Conta c1, Conta c2) -> {
			String nomeC1 = c1.getTitular().getNome();
			String nomeC2 = c2.getTitular().getNome();
			return nomeC1.compareTo(nomeC2);
		};

		// Ordenação por titular
		lista.sort(comp);

		/*
		 * Laço de iteração
		 */
		lista.forEach((conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()));

		/*
		 * lista.forEach(action) - Este método sabe fazer seu próprio laço, ele sabe
		 * acessar cada elemento, uma vez que os administra. Entretanto, ele não é capaz
		 * de definir o que será inserido dentro do laço, ou seja, aquilo que desejamos
		 * fazer com cada elemento.
		 * 
		 * Dentro dos parênteses do método forEach, utilizaremos o atalho
		 * "Ctrl + Espaço". Veremos que o ele não recebe um Comparator, e sim um
		 * CONSUMER. Abrindo a interface:
		 * 
		 * public interface Consumer<T> {

			//Código omitido

        void accept(T t);

		 * 
		 * Assim, definiremos uma classe anônima que implementa esta interface.
		 * Lembrando que ela também utiliza os generics:
		 * 
		 * Lista.forEach(new Consumer<Conta>() { });
		 * 
		 * Entretanto, o compilador sinaliza que ainda precisamos implementar o método.
		 * O Eclipse nos oferece a opção de adiciona-los, ao clicarmos no ícone de
		 * lâmpada, ao lado esquerdo da linha em que o erro é apontado, com isso, temos
		 * o seguinte código gerado automaticamente:
		 * 
		 * lista.forEach(new Consumer<Conta>() {
		 * 
		 * @Override
		 * public void accept(Conta c1) {
		 *  //TODO Auto-generated method stub }
		 * });
		 * 
		 * Em seguida, substituiremos o código que foi gerado automaticamente, por
		 * aquele que havíamos inserido em nosso laço for:
		 * 
		 * lista.forEach(new Consumer<Conta>() {
		 * 
		 * @Override
		 * public void accept(Conta c1) {
		 * System.out.println(conta + ", " + conta.getTitular().getNome()); } });
		 * 
		 * 
		 * Ao fazer o laço, ele consumirá cada elemento, ou seja, cada conta, portanto
		 * c1 dará lugar à conta:
		 * 
		 * lista.forEach(new Consumer<Conta>() {
		 * 
		 * @Override
		 * public void accept(Conta conta) {
		 * System.out.println(conta + ", " + conta.getTitular().getNome()); } });
		 * 
		 * Como podemos notar, este novo código é maior que o anterior, por isso,
		 * simplificaremos sua escrita. O primeiro passo será apagar tudo que é inserido
		 * no parâmetro, até a entrada (Conta conta) e add a seta de lambda:
		 * 
		 * lista.forEach((Conta conta) -> { System.out.println(conta + ", " + conta.getTitular().getNome()); } );
		 * 
		 * Assim como anteriormente, não há necessidade de fazermos referência ao tipo
		 * Conta. Tampouco há necessidade para as chaves ({}), já que estamos
		 * trabalhando com uma linha de código somente:
		 * 
		 * lista.forEach( (conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()));
		 * 
		 * Quem faz o laço é a própria lista, para cada elemento que for uma conta, será
		 * aplicado o System.out.println() que definimos.
		 */
	}
}
