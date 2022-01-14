package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta.
 * 
 * @author Paula
 *
 */

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {
	// Assim, nossa conta se torna compar�vel. Como vimos, h� tamb�m a presen�a de
	// generics, uma vez que queremos comparar uma Conta a outra Conta
	protected double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular;
	// transient � uma palavra chave do mundo Java, e significa que ele n�o faz
	// parte da serializa��o, ou seja, n�o ser� gravado no objeto
	private static int total;

	/**
	 * Construtor para inicializar o objeto Conta
	 * 
	 * @param agencia
	 * @param numero
	 */

	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	public abstract void deposita(double valor);

	// Refatorado
	/**
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) { // Comum colocar os if de problemas com as exce��es logo no inicio do metodo
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino)
			throws SaldoInsuficienteException { /*
												 * Recebemos como par�metro a Conta, ou seja, o tipo gen�rico, n�o
												 * sabemos ainda se � uma conta corrente, ou conta poupan�a. Este c�digo
												 * funciona por causa do polimorfismo, temos a refer�ncia do tipo
												 * gen�rico, que pode apontar para qualquer um mais espec�fico, no caso,
												 * tanto ContaCorrente, quanto ContaPoupanca.
												 */
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N�o pode valor negativo ou igual a zero.");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�o pode valor negativo ou igual a zero.");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return total;
	}

	@Override // estamos sobrescrevendo o m�todo equals(), da classe Object.(pacote lang)
	// Por padr�o, o m�todo equals() faz algo que n�o queremos, que � comparar as
	// refer�ncias this e obj.
	public boolean equals(Object ref) {
		// Na classe Object notamos que o m�todo recebe um Object, ou seja, um tipo
		// gen�rico. Portanto, retornando � classe Conta, vemos que o m�todo tamb�m
		// deveria receber algo da mesma natureza, no caso, o pr�prio Object e uma
		// refer�ncia ref. No entanto, este tipo ref n�o possui atributos que se chamam
		// agencia ou numero. Assim, transformaremos a refer�ncia gen�rica em uma
		// espec�fica, como sabemos, utilizamos o cast:
		Conta outra = (Conta) ref;

		if (this.agencia != outra.agencia) {
			return false;
		}
		if (this.numero != outra.numero) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "N�mero: " + this.numero + ", Ag�ncia: " + this.agencia + ", Saldo: " + this.saldo;
	}

	@Override
	public int compareTo(Conta outra) {
		// Similar ao m�todo compare(), j� que seu retorno � um inteiro, e nos
		// devolve 0, caso as contas sejam iguais. Tamb�m ter� um n�mero positivo, se a
		// primeira conta for maior, e negativo, se ela for menor que a segunda.Em
		// seguida, adaptaremos o m�todo, para que realize a compara��o com base no
		// saldo. Utilizaremos a classe wrapper Double, e teremos como par�metro os dois
		// valores dos saldos, this.saldo e outra.saldo, representando o saldo desta
		// conta, e da outra conta

		return Double.compare(this.saldo, outra.saldo);
	}
}
