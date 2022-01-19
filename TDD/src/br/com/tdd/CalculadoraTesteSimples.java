package br.com.tdd;

public class CalculadoraTesteSimples {
	public static void main(String[] args) {
		/*
		 * Teste automatizado nada mais é do que uma classe, um código, e esse código é
		 * que vai testar o código Calculadora. Criamos essa classe somente para testes.
		 * 1) Precisamos instanciar um objeto 2) chamar esse método passando os
		 * parâmetros, 3) pego o retorno e faz a verificação que queremos fazer.
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
		 * esse método main está começando a ficar grande, e isso porque estou testando
		 * só um método somar, mas imagina que a calculadora tenha mais métodos. se eu
		 * olhar apenas o console, 10, 3, 0 e 2, o que isso significa? O que é o 10
		 * aqui? Era para dar 10? Está funcionando ou está dando erro? é um teste
		 * trabalhoso, chato de escrever, de executar e de analisar os resultados. O
		 * ideal é usarmos uma biblioteca ou uma ferramenta que simplifique isso aqui. E
		 * então entra o JUnit. que é uma biblioteca gratuita, open source
		 * O foco do JUnit em si é na escrita de testes de unidade, que o pessoal também chama de teste unitário
		 */
	}
}
