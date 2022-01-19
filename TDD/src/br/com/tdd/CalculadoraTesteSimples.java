package br.com.tdd;

public class CalculadoraTesteSimples {
	public static void main(String[] args) {
		/*
		 * Teste automatizado nada mais � do que uma classe, um c�digo, e esse c�digo �
		 * que vai testar o c�digo Calculadora. Criamos essa classe somente para testes.
		 * 1) Precisamos instanciar um objeto 2) chamar esse m�todo passando os
		 * par�metros, 3) pego o retorno e faz a verifica��o que queremos fazer.
		 */
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		System.out.println(soma);

		soma = calc.somar(3, 0);
		System.out.println(soma);

		soma = calc.somar(0, 0);
		System.out.println(soma);

		soma = calc.somar(3, -1);
		System.out.println(soma);

		/*
		 * esse m�todo main est� come�ando a ficar grande, e isso porque estou testando
		 * s� um m�todo somar, mas imagina que a calculadora tenha mais m�todos. se eu
		 * olhar apenas o console, 10, 3, 0 e 2, o que isso significa? O que � o 10
		 * aqui? Era para dar 10? Est� funcionando ou est� dando erro? � um teste
		 * trabalhoso, chato de escrever, de executar e de analisar os resultados. O
		 * ideal � usarmos uma biblioteca ou uma ferramenta que simplifique isso aqui. E
		 * ent�o entra o JUnit. que � uma biblioteca gratuita, open source
		 * O foco do JUnit em si � na escrita de testes de unidade, que o pessoal tamb�m chama de teste unit�rio
		 */
	}
}
