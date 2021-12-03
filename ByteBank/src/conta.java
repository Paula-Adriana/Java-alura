
class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

	/*
	 * Os tipos de variáveis que estamos trabalhando na classe Conta, não são as
	 * mesmas que ficam dentro do método main. As variáveis que estamos nos
	 * referindo ficam diretamente na classe. Essas variáveis nós chamamos de
	 * atributos ou características ou campo ou propriedade de um objeto. Quando
	 * acionamos a palavra-chave new e o Java instancia o objeto, todo os campos são
	 * zerados. Zero é o valor default de vários tipos numéricos, como int, double e
	 * long. No caso do tipo boolean o valor é false.
	 */

	public void deposita(double valor) {
		this.saldo += valor;

	}

	/*
	 * SOBRE MÉTODOS: Método() - maneira de fazer algo. no parênteses ()
	 * adicionaremos o que está sendo recebido pelo método, ou seja, um parâmetro.
	 * No caso de uma conta bancária, precisamos adicionar um valor a ser
	 * depositado. Em Java não se pode declarar uma variável sem especificar seu
	 * tipo, portanto, especificaremos a variável valor como sendo do tipo double.
	 * Depois que depositamos um valor em uma determinada conta bancária, poderemos
	 * receber uma mensagem, um número, uma espécie de comprovante ou algo do
	 * gênero. Quando não existe qualquer tipo de retorno ao acionarmos um método,
	 * utilizamos a palavra-chave VOID.
	 */

	/*
	 * SOBRE O THIS Saldo não é uma variavel qualquer chamada "saldo". É a
	 * referencia à conta que está invocado o método deposita() para isso, faremos
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
	 * RETURN: encerra a execução do método e volta para quem estava chamando,
	 * retornando o valor para que voce possa fazer o que quiser
	 */

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor); //reutilizar metodo dentro da própria classe. Deposita dentro de transfere. 
			return true;
		}
		return false;//else opcional assim como no metodo saca. Essa linha só ocorre se não for true acima
	}
}
