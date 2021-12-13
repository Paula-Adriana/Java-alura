
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
				
		
		//conta.saldo = conta.saldo - 101;
		//System.out.println(conta.saldo);
		/* Proibido! Não é uma boa prática manipular diretamente o atributo (saldo).
		 * SEMPRE utilizar os métodos!
		 * No Java, existe a possibilidade de ocultarmos um atributo, deixá-lo privado.
		 * Na classe Conta, escreveremos ao lado do atributo saldo que queremos o
		 * encapsular. Para isso, utilizamos a palavra-chave private.
		 * Após privar o atributo o comando acima não compila mais. 
		 */
		
		//Esse compila - retorna false
		System.out.println(conta.saca(101));
		
		//Após criar um método que devolve o saldo:
		System.out.println(conta.getSaldo());
	}
}
