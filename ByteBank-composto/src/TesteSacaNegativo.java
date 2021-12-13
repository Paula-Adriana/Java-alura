
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
				
		
		//conta.saldo = conta.saldo - 101;
		//System.out.println(conta.saldo);
		/* Proibido! N�o � uma boa pr�tica manipular diretamente o atributo (saldo).
		 * SEMPRE utilizar os m�todos!
		 * No Java, existe a possibilidade de ocultarmos um atributo, deix�-lo privado.
		 * Na classe Conta, escreveremos ao lado do atributo saldo que queremos o
		 * encapsular. Para isso, utilizamos a palavra-chave private.
		 * Ap�s privar o atributo o comando acima n�o compila mais. 
		 */
		
		//Esse compila - retorna false
		System.out.println(conta.saca(101));
		
		//Ap�s criar um m�todo que devolve o saldo:
		System.out.println(conta.getSaldo());
	}
}
