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
		if (this.saldo < valor) { // Comum colocar os if de problemas com as exceções logo no inicio do metodo
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino)
			throws SaldoInsuficienteException { /*
												 * Recebemos como parâmetro a Conta, ou seja, o tipo genérico, não
												 * sabemos ainda se é uma conta corrente, ou conta poupança. Este código
												 * funciona por causa do polimorfismo, temos a referência do tipo
												 * genérico, que pode apontar para qualquer um mais específico, no caso,
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
			System.out.println("Não pode valor negativo ou igual a zero.");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor negativo ou igual a zero.");
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

	@Override // estamos sobrescrevendo o método equals(), da classe Object.(pacote lang)
	// Por padrão, o método equals() faz algo que não queremos, que é comparar as
	// referências this e obj.
	public boolean equals(Object ref) {
		// Na classe Object notamos que o método recebe um Object, ou seja, um tipo
		// genérico. Portanto, retornando à classe Conta, vemos que o método também
		// deveria receber algo da mesma natureza, no caso, o próprio Object e uma
		// referência ref. No entanto, este tipo ref não possui atributos que se chamam
		// agencia ou numero. Assim, transformaremos a referência genérica em uma
		// específica, como sabemos, utilizamos o cast:
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
		return "Número: " + this.numero + ", Agência: " + this.agencia;
	}
}
