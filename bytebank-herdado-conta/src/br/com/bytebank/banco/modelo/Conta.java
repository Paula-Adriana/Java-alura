package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta.
 * 
 * @author Paula
 *
 */

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
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
		return "N�mero: " + this.numero + ", Ag�ncia: " + this.agencia;
	}
}
