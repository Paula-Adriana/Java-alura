
class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

	/*
	 * Os tipos de vari�veis que estamos trabalhando na classe Conta, n�o s�o as
	 * mesmas que ficam dentro do m�todo main. As vari�veis que estamos nos
	 * referindo ficam diretamente na classe. Essas vari�veis n�s chamamos de
	 * atributos ou caracter�sticas ou campo ou propriedade de um objeto. Quando
	 * acionamos a palavra-chave new e o Java instancia o objeto, todo os campos s�o
	 * zerados. Zero � o valor default de v�rios tipos num�ricos, como int, double e
	 * long. No caso do tipo boolean o valor � false.
	 */

	public void deposita(double valor) {
		this.saldo += valor;

	}

	/*
	 * SOBRE M�TODOS: M�todo() - maneira de fazer algo. no par�nteses ()
	 * adicionaremos o que est� sendo recebido pelo m�todo, ou seja, um par�metro.
	 * No caso de uma conta banc�ria, precisamos adicionar um valor a ser
	 * depositado. Em Java n�o se pode declarar uma vari�vel sem especificar seu
	 * tipo, portanto, especificaremos a vari�vel valor como sendo do tipo double.
	 * Depois que depositamos um valor em uma determinada conta banc�ria, poderemos
	 * receber uma mensagem, um n�mero, uma esp�cie de comprovante ou algo do
	 * g�nero. Quando n�o existe qualquer tipo de retorno ao acionarmos um m�todo,
	 * utilizamos a palavra-chave VOID.
	 */

	/*
	 * SOBRE O THIS Saldo n�o � uma variavel qualquer chamada "saldo". � a
	 * referencia � conta que est� invocado o m�todo deposita() para isso, faremos
	 * uso da palavra-chave this.
	 */

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}
	/*
	 * RETURN: encerra a execu��o do m�todo e volta para quem estava chamando,
	 * retornando o valor para que voce possa fazer o que quiser
	 */

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor); //reutilizar metodo dentro da pr�pria classe. Deposita dentro de transfere. 
			return true;
		}
		return false;//else opcional assim como no metodo saca. Essa linha s� ocorre se n�o for true acima
	}
}
