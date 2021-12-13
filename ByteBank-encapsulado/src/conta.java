
class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; /*
								 * O static faz com que o atributo seja da classe, e não mais do objeto. Com
								 * isso, todo o objeto conta possui acesso a um único total. Do contario seria o
								 * total de 1 para cada objeto conta criado. Pois, cada objeto conta criado tem
								 * um saldo, uma agencia, um numero, um titular e um total.
								 */

	/*
	 * Construtores são elaborados visando que os objetos tenham seus atributos
	 * inicializados na própria construção. Essa estratégia evita estados
	 * inconsistentes no nosso objeto.
	 */
	public Conta(int numero, int agencia) {
		Conta.total++; /*
						 * Total de contas criadas. o THIS não cabe aqui pois TOTAL é atributo da classe
						 * (é compartilhado) e não de instância. O Conta é opcional na escrita, mas fica
						 * mais legível.
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

	public void setNumero(int numero) { // metodos que alteram atributos normalmente são void.
		if (numero <= 0) {
			System.out.println("Não pode valor negativo ou igual a zero.");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() { // getAg -> ctrl + espaço já constroi o metodo.
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) { // não é this.agencia pq estamos falando da agencia como parametro e não,
							// atributo!
			System.out.println("Não pode valor negativo ou igual a zero.");
			return; // return para que nao execute a proxima linha. Interrompe a ação e volta para
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

	// Qualquer alteraçao/validação dos atrubitos é feita no método e somente nele.

}
