package br.com.testeUnitario;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	//Esta � uma maneira de add o JUnit com a IDE
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);

		Assert.assertEquals(10, soma);
	}
}
/*
 * � assim que escrevemos um teste com JUnit. � uma classe, da mesma maneira,
 * mas ao inv�s de ter um m�todo main com um monte de cen�rios, capa cen�rio vai
 * virar um m�todo separado anotado com @Test, que � uma nota��o que vem do
 * JUnit.
 * 
 * E aqui n�o tem muita diferen�a do que t�nhamos feito l� no m�todo
 * main. Voc� vai instanciar sua classe, vai chamar m�todos, passar par�metros,
 * pega retornos, e outra diferen�a � que para verificar se os valores foram
 * devolvidos, o comportamento da classe, voc� usa essas classes de assertivas
 * do JUnit. o c�digo acaba ficando mais organizado, n�o vai ter um m�todo main
 * gigantesco, cada cen�rio vai ficar no seu pr�prio m�todo separado, � mais
 * f�cil de executar. Para eu rodar todos os cen�rios, bot�o direito, j� tem
 * integra��o com a IDE, e o principal, o feedback. Como sei que est� tudo
 * funcionando, se tem algum bug. � s� voc� olhar, barra verde, tudo
 * funcionando. Barra vermelha, algum teste falhou, e voc� consegue detectar
 * qual foi o teste e rastre�-lo facilmente para identificar o problema
 */