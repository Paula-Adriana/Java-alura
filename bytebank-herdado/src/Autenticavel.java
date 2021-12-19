
public abstract interface Autenticavel {
//Classes abstratas n�o s�o obrigadas a implementar os m�todos abstratos (getBonificacao)
//Interfaces s�o classes abstratas com m�todos abstratos n�o h� nada concreto. Apenas definicoes.
	// Contrato autenticavel, quem assina, precisa implementar.
	// metodo setSenha e metodo autentica.

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
/*
 * A interface Autenticavel, por sua vez, � a abstra��o entre SistemaInterno e
 * todas as pessoas que desejam acess�-lo. Ainda que estas pessoas n�o tenham
 * rela��o entre si.
 */

/*
 * Em compara��o com o conceito de heran�a, onde temos os pilares da
 * reutiliza��o de c�digo e do polimorfismo, quando falamos de interfaces, n�o
 * h� c�digo concreto, assim, o objetivo n�o � a reutiliza��o de c�digo, ela �,
 * sim, uma alternativa ao polimorfismo.
 * 
 * Se quisermos somente uma solu��o pura de polimorfismo, podemos utilizar a
 * interface.
 * 
 * Mas e se quisermos somente a reutiliza��o de c�digo, � recomendado utilizar a
 * heran�a? N�o, a heran�a � recomendada quando h� a combina��o das necessidades
 * de reutiliza��o de c�digo e polimorfismo.
 * 
 * E se a necessidade for somente a reutiliza��o de c�digo? usar COMPOSICAO!
 */