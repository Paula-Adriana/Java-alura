
class Conta {
	private double saldo; /*
							 * A partir do momento em que um atributo se torna privado, isso quer dizer que
							 * ele não pode ser lido ou modificado, a não ser na própria classe. Esse é o
							 * conceito principal de encapsulamento.
							 */
	int agencia;
	int numero;
	Cliente titular;

	/*
	 * Não é mais interessante para o nosso projeto que o atributo titular seja uma
	 * String, e sim que faça referência a um cliente específico. Alteraremos o tipo
	 * do atributo titular para ser do tipo Cliente. Queremos que o atributo titular
	 * faça uma referência a um cliente específico, ou seja, iremos fazer uma
	 * associação entre objetos. Faremos essa associação na classe TestaBanco,
	 * montando, assim, a nossa composição de objetos.
	 */

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
	/*O nome desse tipo de método que simplesmente exibe uma informação é getter.
	 * */
}
