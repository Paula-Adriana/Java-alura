
public class TesteContaSemCliente {
	public static void main(String[] args) {
		// Criei a conta da marcela
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		/*
		 * Resulado 0,00, o java compila o saldo pois os atributos são zerados quando
		 * damos new
		 */

		// Aqui não vai compilar pois não foi referenciado o cliente/titular com a conta
		// da Marcela.
		// Resultado null = não há referência do titular para lugar algum. Pois somente
		// a conta foi criada.
		System.out.println(contaDaMarcela.titular);
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);

		// Pode ser feito assim:
		// Um novo cliente é titular da contaDaMarcela que já foi criada.
		// Quando ocorre um erro de exception quer dizer que a referencia acessada ainda
		// nao foi populada.
		contaDaMarcela.titular = new Cliente();
	}
}
/*
 * No java nao existe objeto dentro de variavel nem objeto dentro de objeto. Sao
 * unicamente referencias (de um lugar para outro como flechas/caminhos
 */
