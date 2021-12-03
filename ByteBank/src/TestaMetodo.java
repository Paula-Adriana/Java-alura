
public class TestaMetodo {
	public static void main(String[] args) {

		Conta contaDaPaula = new Conta();
		contaDaPaula.saldo = 100;

		contaDaPaula.deposita(50); // metodo deposita sendo invocado para a contaDaPaula que foi criada pelo new
		System.out.println(contaDaPaula.saldo);

		boolean conseguiuRetirar = contaDaPaula.saca(20);// m�todo saca sendo invocado
		System.out.println(contaDaPaula.saldo);
		System.out.println(conseguiuRetirar);
		/*
		 * A respeito do true e false do boolean, quando passamos o mouse sobre o c�digo
		 * (contaDaPaula.saca(20);) vemos o retorno do m�todo (true), podemos ou n�o
		 * guardar esse valor em uma vari�vel e utilizar mais tarde, se necess�rio.
		 */

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDaPaula); // 
		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro");
			/*
			 * * contaDaMarcela.transfere(300, contaDaPaula): Evitamos adicionar
			 * ContaDaMarcela (como parametro), porque a conta de origem � o valor no
			 * primeiro par�metro(300). Ou seja, vamos passar apenas a conta de destino,
			 * considerando que a origem j� � o objeto ao qual invocamos o m�todo.
			 * Na linha - contaDaMarcela.transfere(300, contaDaPaula) - 
			 * o contaDaMarcela � o this l� no metodo!!!!!!! Origem do dinheiro. 
			 */

			/*
			 * N�o utilizamos o valor devolvido pelo boolean, poder�amos ter guardado esse
			 * valor atrav�s da utiliza��o de if. Estamos invocando o m�todo transfere() -
			 * lembre-se que dentro de if s� s�o poss�veis express�es booleanas - que
			 * devolve boolean, e portanto, o if pode ser compilado.
			 * 
			 * Caso o resultado dessa transfer�ncia tenha dado true, iremos imprimir
			 * "transfer�ncia com sucesso". Caso contr�rio, imprimiremos "faltou dinheiro".
			 * Poder�amos alocar a parte do c�digo referente ao m�todo transfere() e inserir
			 * uma vari�vel sucessoTransferencia em seu lugar.
			 */

		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDaPaula.saldo);
	}
}

/*
 * DICA: uma forma mais r�pida e f�cil de transitar no projeto que est� sendo
 * desenvolvido � manter pressionado atalho "Ctrl", com isso, o Eclipse ir�
 * transformar muitos elementos em links. Ao clicarmos em um dos links, seremos
 * transportados para o c�digo referente ao m�todo ou classe que estamos
 * acionando.
 */