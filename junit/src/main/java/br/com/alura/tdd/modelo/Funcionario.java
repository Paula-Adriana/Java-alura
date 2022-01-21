package br.com.alura.tdd.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {

	private String nome;
	private LocalDate dataAdmissao;
	private BigDecimal salario;

	public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void reajustarSalario(BigDecimal reajuste) {
		this.salario = this.salario.add(reajuste);
		arredondarSalario();

	}

	/*
	 * M�todo privado voc� n�o testa. Se o m�todo � privado � porque ele � um m�todo
	 * utilit�rio da classe, ele � usado internamente na classe. O m�todo
	 * arredondarSalario � utilizado dentro do m�todo reajustarSalario. E o m�todo
	 * reajustarSalario � o m�todo p�blico, ele j� est� sendo testado quando fizemos
	 * o teste da classe reajuste service.
	 */
	private void arredondarSalario() {
		this.salario = this.salario.setScale(2, RoundingMode.HALF_UP); // duas casas arredondando pra cima
	}

}
