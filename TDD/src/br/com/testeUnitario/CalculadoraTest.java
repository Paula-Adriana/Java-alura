package br.com.testeUnitario;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	//Esta é uma maneira de add o JUnit com a IDE
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);

		Assert.assertEquals(10, soma);
	}
}
/*
 * É assim que escrevemos um teste com JUnit. É uma classe, da mesma maneira,
 * mas ao invés de ter um método main com um monte de cenários, capa cenário vai
 * virar um método separado anotado com @Test, que é uma notação que vem do
 * JUnit.
 * 
 * E aqui não tem muita diferença do que tínhamos feito lá no método
 * main. Você vai instanciar sua classe, vai chamar métodos, passar parâmetros,
 * pega retornos, e outra diferença é que para verificar se os valores foram
 * devolvidos, o comportamento da classe, você usa essas classes de assertivas
 * do JUnit. o código acaba ficando mais organizado, não vai ter um método main
 * gigantesco, cada cenário vai ficar no seu próprio método separado, é mais
 * fácil de executar. Para eu rodar todos os cenários, botão direito, já tem
 * integração com a IDE, e o principal, o feedback. Como sei que está tudo
 * funcionando, se tem algum bug. É só você olhar, barra verde, tudo
 * funcionando. Barra vermelha, algum teste falhou, e você consegue detectar
 * qual foi o teste e rastreá-lo facilmente para identificar o problema
 */