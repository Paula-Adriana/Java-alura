
public class TesteContaSemCliente {
	public static void main(String[] args) {
		// Criei a conta da marcela
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		/*
		 * Resulado 0,00, o java compila o saldo pois os atributos s�o zerados quando
		 * damos new
		 */

		// Aqui n�o vai compilar pois n�o foi referenciado o cliente/titular com a conta
		// da Marcela.
		// Resultado null = n�o h� refer�ncia do titular para lugar algum. Pois somente
		// a conta foi criada.
		System.out.println(contaDaMarcela.titular);
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);

		// Pode ser feito assim:
		// Um novo cliente � titular da contaDaMarcela que j� foi criada.
		// Quando ocorre um erro de exception quer dizer que a referencia acessada ainda
		// nao foi populada.
		contaDaMarcela.titular = new Cliente();
	}
}
/*
 * No java nao existe objeto dentro de variavel nem objeto dentro de objeto. Sao
 * unicamente referencias (de um lugar para outro como flechas/caminhos
 */
