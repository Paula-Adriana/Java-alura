
class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; /*
								 * O static faz com que o atributo seja da classe, e n�o mais do objeto. Com
								 * isso, todo o objeto conta possui acesso a um �nico total. Do contario seria o
								 * total de 1 para cada objeto conta criado. Pois, cada objeto conta criado tem
								 * um saldo, uma agencia, um numero, um titular e um total.
								 */

	/*
	 * Construtores s�o elaborados visando que os objetos tenham seus atributos
	 * inicializados na pr�pria constru��o. Essa estrat�gia evita estados
	 * inconsistentes no nosso objeto.
	 */
	public Conta(int numero, int agencia) {
		Conta.total++; /*
						 * Total de contas criadas. o THIS n�o cabe aqui pois TOTAL � atributo da classe
						 * (� compartilhado) e n�o de inst�ncia. O Conta � opcional na escrita, mas fica
						 * mais leg�vel.
						 */
		this.agencia = agencia;
		this.numero = numero;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) { // metodos que alteram atributos normalmente s�o void.
		if (numero <= 0) {
			System.out.println("N�o pode valor negativo ou igual a zero.");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() { // getAg -> ctrl + espa�o j� constroi o metodo.
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) { // n�o � this.agencia pq estamos falando da agencia como parametro e n�o,
							// atributo!
			System.out.println("N�o pode valor negativo ou igual a zero.");
			return; // return para que nao execute a proxima linha. Interrompe a a��o e volta para
					// quem chamou.
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

	// Qualquer altera�ao/valida��o dos atrubitos � feita no m�todo e somente nele.

}
