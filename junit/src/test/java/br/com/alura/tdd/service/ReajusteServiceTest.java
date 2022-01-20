package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	/*
	 * O sistema deve permitir que os funcion�rios recebam um reajuste salarial
	 * anual baseado em seu desempenho. Desempenho a desejar - 3% do sal�rio. *
	 * Desempenho bom - 15% do sal�rio Desempenho �timo - 20% do sal�rio.
	 */

	// Come�o com tdd: Implementar os cen�rios de teste
	@Test
	public void reajusteDeveriaSerTresPorcentoQuandoDesempenhoForADesejar() {
		ReajusteService service = new ReajusteService(); // classe ainda nao existe.
		Funcionario func = new Funcionario("Joao", LocalDate.now(), new BigDecimal(1000.00));
		service.concederReajuste(func, Desempenho.A_Desejar); // O service precisa puxar o metodo que vai conceder o
																// reajuste mas esse metodo ainda nao existe. Colocar um
																// nome qq e depois criar a classe (atraves dos atalhos
																// da IDE). Passar o funcinario e o parametro do bonus.
																// Aqui foi(ser�) criado um enum desempenho (a desejar,
																// bom e otimo). L�gica de teste pronta!
		// Assertivas
		// (o que eu espero, o que � para comparar)
		assertEquals(new BigDecimal("1030.00"), func.getSalario());

	}
	//Com a l�gica, classes e m�todos prontos s� copiar os testes e adaptar o enum e valor do reajuste esperado.
	@Test
	public void reajusteDeveriaSerQuinzePorcentoQuandoDesempenhoForBom() {
		ReajusteService service = new ReajusteService();
		Funcionario func = new Funcionario("Jos�", LocalDate.now(), new BigDecimal(1000.00));
		service.concederReajuste(func, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), func.getSalario());
	}
	
	@Test
	public void reajusteDeveriaSerVintePorcentoQuandoDesempenhoForOtimo() {
		ReajusteService service = new ReajusteService();
		Funcionario func = new Funcionario("Juvenal", LocalDate.now(), new BigDecimal(1000.00));
		service.concederReajuste(func, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), func.getSalario());
		
		

	}
	
	
}