
public abstract class Funcionario { // Classe funcionario � o conceito dos cargos. Porque ningu�m fala em uma
									// empresa
									// que � "o funcion�rio". Fala o cargo que ocupa. Colocando abstract na frente
									// na classe estamos trabalhando com heran�a.

	private String nome;
	private String cpf;
	private double salario;
	// Protected: est� entre publico e privado. Significa p�blico somente para os
	// filhos

	public abstract double getBonificacao();
	/*
	 * M�todo abstrato: n�o h� implementa��o padr�o no m�todo (sem corpo), cada
	 * classe filha obrigatoriamente precisa implementar o seu.
	 * Um m�todo abstrato define apenas a assinatura (visibilidade, retorno, nome do m�todo e par�metros).
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
