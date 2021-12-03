
public class TestaMetodo {
	public static void main(String[] args) {

		Conta contaDaPaula = new Conta();
		contaDaPaula.saldo = 100;

		contaDaPaula.deposita(50); // metodo deposita sendo invocado para a contaDaPaula que foi criada pelo new
		System.out.println(contaDaPaula.saldo);

		boolean conseguiuRetirar = contaDaPaula.saca(20);// método saca sendo invocado
		System.out.println(contaDaPaula.saldo);
		System.out.println(conseguiuRetirar);
		/*
		 * A respeito do true e false do boolean, quando passamos o mouse sobre o código
		 * (contaDaPaula.saca(20);) vemos o retorno do método (true), podemos ou não
		 * guardar esse valor em uma variável e utilizar mais tarde, se necessário.
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
			 * ContaDaMarcela (como parametro), porque a conta de origem é o valor no
			 * primeiro parâmetro(300). Ou seja, vamos passar apenas a conta de destino,
			 * considerando que a origem já é o objeto ao qual invocamos o método.
			 * Na linha - contaDaMarcela.transfere(300, contaDaPaula) - 
			 * o contaDaMarcela é o this lá no metodo!!!!!!! Origem do dinheiro. 
			 */

			/*
			 * Não utilizamos o valor devolvido pelo boolean, poderíamos ter guardado esse
			 * valor através da utilização de if. Estamos invocando o método transfere() -
			 * lembre-se que dentro de if só são possíveis expressões booleanas - que
			 * devolve boolean, e portanto, o if pode ser compilado.
			 * 
			 * Caso o resultado dessa transferência tenha dado true, iremos imprimir
			 * "transferência com sucesso". Caso contrário, imprimiremos "faltou dinheiro".
			 * Poderíamos alocar a parte do código referente ao método transfere() e inserir
			 * uma variável sucessoTransferencia em seu lugar.
			 */

		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDaPaula.saldo);
	}
}

/*
 * DICA: uma forma mais rápida e fácil de transitar no projeto que está sendo
 * desenvolvido é manter pressionado atalho "Ctrl", com isso, o Eclipse irá
 * transformar muitos elementos em links. Ao clicarmos em um dos links, seremos
 * transportados para o código referente ao método ou classe que estamos
 * acionando.
 */