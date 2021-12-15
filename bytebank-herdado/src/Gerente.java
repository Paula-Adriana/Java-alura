//Gerente herda todos os atributos da classe funcionario. 
public class Gerente extends Funcionario {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;

	}

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Gerente");
		return super.getBonificacao() + super.getSalario(); /*
									 * O this, além de guardar a referência para mexermos nos atributos do objeto,
									 * para o desenvolvedor, significa que o atributo deve estar definido nesta
									 * classe. Entretanto, neste caso o salário não está definido na classe Gerente,
									 * e sim na classe mãe, ou super classe, Funcionario. Para deixarmos isso
									 * explícito em nosso código, ou seja, que o salario vem da super classe,
									 * (super.salario) há uma outra palavra que podemos utilizar, que é SUPER.
									 * 
									 * --------
									 * 
									 * Por fim, na classe Funcionario, temos nosso método getBonificacao() que é
									 * público, devolve um double, e não recebe parâmetros: Isto é chamado de
									 * ASSINATURA DO METODO. Se olharmos para a classe Gerente, veremos que lá temos
									 * a mesma assinatura do método, o que chamamos de reescrita. * Temos o método
									 * definido na classe mãe, e redefinimos este método na classe filha, ou seja,
									 * fizemos a reescrita do método. * A característica da reescrita é utilizar a
									 * mesma assinatura do método, há algumas peculiaridades que podem variar mas,
									 * em geral, é este o conceito, ou seja, mesma visibilidade, mesmo retorno,
									 * mesmo nome e mesmos parâmetros. A sobrescrita é um conceito importante na
									 * herança, pois permite redefinir um comportamento previsto na classe mãe
									 * através da classe filha.
									 */
	}

}
/*
 * Classe funcionario: Super class Base class Classe mãe
 * 
 * Classe gerente: Classe filho/a
 */