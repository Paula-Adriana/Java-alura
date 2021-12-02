
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();   //
		/* do lado direiro de new consta o nome da classe que voce quer "tirar do papel" ou seja, criar o objeto do tipo 
		 * Conta. Aqui ocorre o Instanciamento */
		
		primeiraConta.saldo = 200; //Atribuição de um atributo
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
 * É comum ter a impressão de que
 * a palavra-chave new nos devolve o objeto em si, e de que a variável
 * primeiraConta contém o objeto, mas isso nunca ocorre. No Java, assim como em
 * outras linguagens, um objeto nunca está dentro de uma variável. O que tem
 * dentro de uma variável é somente uma indicação (endereço de memória) a um objeto específico, uma
 * referência a um objeto específico. primeiraConta NÃO é um objeto do tipo Conta. 
 */

