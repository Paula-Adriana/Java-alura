
public abstract interface Autenticavel {
//Classes abstratas não são obrigadas a implementar os métodos abstratos (getBonificacao)
//Interfaces são classes abstratas com métodos abstratos não há nada concreto. Apenas definicoes.
	// Contrato autenticavel, quem assina, precisa implementar.
	// metodo setSenha e metodo autentica.

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
/*
 * A interface Autenticavel, por sua vez, é a abstração entre SistemaInterno e
 * todas as pessoas que desejam acessá-lo. Ainda que estas pessoas não tenham
 * relação entre si.
 */

/*
 * Em comparação com o conceito de herança, onde temos os pilares da
 * reutilização de código e do polimorfismo, quando falamos de interfaces, não
 * há código concreto, assim, o objetivo não é a reutilização de código, ela é,
 * sim, uma alternativa ao polimorfismo.
 * 
 * Se quisermos somente uma solução pura de polimorfismo, podemos utilizar a
 * interface.
 * 
 * Mas e se quisermos somente a reutilização de código, é recomendado utilizar a
 * herança? Não, a herança é recomendada quando há a combinação das necessidades
 * de reutilização de código e polimorfismo.
 * 
 * E se a necessidade for somente a reutilização de código? usar COMPOSICAO!
 */