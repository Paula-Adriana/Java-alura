
class Conta {
	private double saldo; /*
							 * A partir do momento em que um atributo se torna privado, isso quer dizer que
							 * ele n�o pode ser lido ou modificado, a n�o ser na pr�pria classe. Esse � o
							 * conceito principal de encapsulamento.
							 */
	int agencia;
	int numero;
	Cliente titular;

	/*
	 * N�o � mais interessante para o nosso projeto que o atributo titular seja uma
	 * String, e sim que fa�a refer�ncia a um cliente espec�fico. Alteraremos o tipo
	 * do atributo titular para ser do tipo Cliente. Queremos que o atributo titular
	 * fa�a uma refer�ncia a um cliente espec�fico, ou seja, iremos fazer uma
	 * associa��o entre objetos. Faremos essa associa��o na classe TestaBanco,
	 * montando, assim, a nossa composi��o de objetos.
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
	/*O nome desse tipo de m�todo que simplesmente exibe uma informa��o � getter.
	 * */
}
