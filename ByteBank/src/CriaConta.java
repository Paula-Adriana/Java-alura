
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();   //
		/* do lado direiro de new consta o nome da classe que voce quer "tirar do papel" ou seja, criar o objeto do tipo 
		 * Conta. Aqui ocorre o Instanciamento */
		
		primeiraConta.saldo = 200; //Atribui��o de um atributo
		System.out.println(primeiraConta.saldo); //Acesso de um atributo de um objeto
		primeiraConta.saldo += 100;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50; // (Referencia (segundaConta) do objeto e atributo (saldo)
		System.out.println("A primeira conta tem " + primeiraConta.saldo + " reais");
		System.out.println("A segunda conta tem " + segundaConta.saldo + " reais");
		
		System.out.println(primeiraConta); 
		System.out.println(segundaConta);
		//respectivas referencias: Conta@3ac42916 e Conta@47d384ee. Dois objetos diferentes criados pelo new. 
	}
}
/*
 * � comum ter a impress�o de que
 * a palavra-chave new nos devolve o objeto em si, e de que a vari�vel
 * primeiraConta cont�m o objeto, mas isso nunca ocorre. No Java, assim como em
 * outras linguagens, um objeto nunca est� dentro de uma vari�vel. O que tem
 * dentro de uma vari�vel � somente uma indica��o (endere�o de mem�ria) a um objeto espec�fico, uma
 * refer�ncia a um objeto espec�fico. primeiraConta N�O � um objeto do tipo Conta. 
 */

