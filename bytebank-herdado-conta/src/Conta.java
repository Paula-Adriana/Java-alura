
public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	public abstract void deposita(double valor);

	// Refatorado
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) { // Comum colocar os if de problemas com as exce��es logo no inicio do metodo
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException { /*
								 * Recebemos como par�metro a Conta, ou seja, o tipo gen�rico, n�o sabemos ainda
								 * se � uma conta corrente, ou conta poupan�a. Este c�digo funciona por causa do
								 * polimorfismo, temos a refer�ncia do tipo gen�rico, que pode apontar para
								 * qualquer um mais espec�fico, no caso, tanto ContaCorrente, quanto
								 * ContaPoupanca.
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

}
