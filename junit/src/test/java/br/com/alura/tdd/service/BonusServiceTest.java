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
		 * Como funciona o assertThrows? Antes de passar um método, eu preciso dizer
		 * para ele qual a exception que estou esperando. No nosso caso é uma illegal
		 * argument exception.class. Eu espero que essa exception seja lançada quando eu
		 * chamar esse método aqui. O segundo parâmetro é um Lambda e por fim o metodo
		 * service. Essa é uma maneira
		 */
		assertThrows(IllegalArgumentException.class,
				() -> service.calcularBonus(new Funcionario("Paula", LocalDate.now(), new BigDecimal(25000))));

		/*
		 * Outra maneira com try-catch. Tenta chamar a linha: service.calcularBonus,
		 * se der exception ele vai entrar no catch. Então se entrou no catch é porque ok a excecao foi lançada.
		 * Se não entrou no catch é porque falhou. Então aqui dentro do try, depois do metodo, eu vou avisar para o JUnit: 
		 * se entrou aqui embaixo, falhe, force o teste a falhar. Para isso: chamar o fail, método do JUnit para
		 * forçar um teste a falhar.
		 * 
		 * try { service.calcularBonus(new Funcionario("Paula", LocalDate.now(), new BigDecimal(25000)));
		 * fail("Não deu excecao");
		 * }
		 * catch (Exception e) {
		 * assertEquals("Funcionário com salário superior a R$ 10.000,00 reais não recebe bônus", e.getMessage()); }
		 */

	}

	// Copiar o método e mudar os cenários
	// Assertivas - Os métodos assert nos permitem verificar se a classe testada
	// está executando seu comportamento conforme o esperado.
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
