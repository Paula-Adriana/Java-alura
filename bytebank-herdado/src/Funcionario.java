
public abstract class Funcionario { // Classe funcionario é o conceito dos cargos. Porque ninguém fala em uma
									// empresa
									// que é "o funcionário". Fala o cargo que ocupa. Colocando abstract na frente
									// na classe estamos trabalhando com herança.

	private String nome;
	private String cpf;
	private double salario;
	// Protected: está entre publico e privado. Significa público somente para os
	// filhos

	public abstract double getBonificacao();
	/*
	 * Método abstrato: não há implementação padrão no método (sem corpo), cada
	 * classe filha obrigatoriamente precisa implementar o seu.
	 * Um método abstrato define apenas a assinatura (visibilidade, retorno, nome do método e parâmetros).
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
