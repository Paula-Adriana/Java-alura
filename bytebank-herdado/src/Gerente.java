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
		System.out.println("Chamando o m�todo de bonificacao do Gerente");
		return super.getBonificacao() + super.getSalario(); /*
									 * O this, al�m de guardar a refer�ncia para mexermos nos atributos do objeto,
									 * para o desenvolvedor, significa que o atributo deve estar definido nesta
									 * classe. Entretanto, neste caso o sal�rio n�o est� definido na classe Gerente,
									 * e sim na classe m�e, ou super classe, Funcionario. Para deixarmos isso
									 * expl�cito em nosso c�digo, ou seja, que o salario vem da super classe,
									 * (super.salario) h� uma outra palavra que podemos utilizar, que � SUPER.
									 * 
									 * --------
									 * 
									 * Por fim, na classe Funcionario, temos nosso m�todo getBonificacao() que �
									 * p�blico, devolve um double, e n�o recebe par�metros: Isto � chamado de
									 * ASSINATURA DO METODO. Se olharmos para a classe Gerente, veremos que l� temos
									 * a mesma assinatura do m�todo, o que chamamos de reescrita. * Temos o m�todo
									 * definido na classe m�e, e redefinimos este m�todo na classe filha, ou seja,
									 * fizemos a reescrita do m�todo. * A caracter�stica da reescrita � utilizar a
									 * mesma assinatura do m�todo, h� algumas peculiaridades que podem variar mas,
									 * em geral, � este o conceito, ou seja, mesma visibilidade, mesmo retorno,
									 * mesmo nome e mesmos par�metros. A sobrescrita � um conceito importante na
									 * heran�a, pois permite redefinir um comportamento previsto na classe m�e
									 * atrav�s da classe filha.
									 */
	}

}
/*
 * Classe funcionario: Super class Base class Classe m�e
 * 
 * Classe gerente: Classe filho/a
 */