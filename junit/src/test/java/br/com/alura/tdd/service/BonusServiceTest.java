package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		// Instanciar
		BonusService service = new BonusService();

		/*
		 * Como funciona o assertThrows? Antes de passar um m�todo, eu preciso dizer
		 * para ele qual a exception que estou esperando. No nosso caso � uma illegal
		 * argument exception.class. Eu espero que essa exception seja lan�ada quando eu
		 * chamar esse m�todo aqui. O segundo par�metro � um Lambda e por fim o metodo
		 * service. Essa � uma maneira
		 */
		assertThrows(IllegalArgumentException.class,
				() -> service.calcularBonus(new Funcionario("Paula", LocalDate.now(), new BigDecimal(25000))));

		/*
		 * Outra maneira com try-catch. Tenta chamar a linha: service.calcularBonus,
		 * se der exception ele vai entrar no catch. Ent�o se entrou no catch � porque ok a excecao foi lan�ada.
		 * Se n�o entrou no catch � porque falhou. Ent�o aqui dentro do try, depois do metodo, eu vou avisar para o JUnit: 
		 * se entrou aqui embaixo, falhe, force o teste a falhar. Para isso: chamar o fail, m�todo do JUnit para
		 * for�ar um teste a falhar.
		 * 
		 * try { service.calcularBonus(new Funcionario("Paula", LocalDate.now(), new BigDecimal(25000)));
		 * fail("N�o deu excecao");
		 * }
		 * catch (Exception e) {
		 * assertEquals("Funcion�rio com sal�rio superior a R$ 10.000,00 reais n�o recebe b�nus", e.getMessage()); }
		 */

	}

	// Copiar o m�todo e mudar os cen�rios
	// Assertivas - Os m�todos assert nos permitem verificar se a classe testada
	// est� executando seu comportamento conforme o esperado.
	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		// instanciar
		BonusService service = new BonusService();
		// guardando numa variavel, chamar metodo e escrever a logica
		BigDecimal bonus = service.calcularBonus(new Funcionario("Paula", LocalDate.now(), new BigDecimal(2500)));
		assertEquals(new BigDecimal("250.00"), bonus); // valor esperado para 2,5k de salario
	}

	@Test
	void bonusDeveriaSer10PorCentoSalarioDeExatamente10000() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Paula", LocalDate.now(), new BigDecimal(10000)));
		assertEquals(new BigDecimal("1000.00"), bonus);
	}
} /*
	 * Testes de valores - testar 3 cenarios (no minimo) valor maximo, medio e
	 * minimo de resultados.
	 */
