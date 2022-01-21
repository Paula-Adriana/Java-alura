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
	 * Método privado você não testa. Se o método é privado é porque ele é um método
	 * utilitário da classe, ele é usado internamente na classe. O método
	 * arredondarSalario é utilizado dentro do método reajustarSalario. E o método
	 * reajustarSalario é o método público, ele já está sendo testado quando fizemos
	 * o teste da classe reajuste service.
	 */
	private void arredondarSalario() {
		this.salario = this.salario.setScale(2, RoundingMode.HALF_UP); // duas casas arredondando pra cima
	}

}
