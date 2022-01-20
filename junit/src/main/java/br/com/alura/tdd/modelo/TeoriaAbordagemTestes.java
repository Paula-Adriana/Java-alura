package br.com.alura.tdd.modelo;

public class TeoriaAbordagemTestes {
	/*
	 * Tem tr�s abordagens nos testes.
	 * 1 - Tem teste que voc� vai chamar um m�todo que devolve um valor (service.calcularBonus devolve um BigDecimal).
	 * Chamo um m�todo, pego o retorno e fa�o o assert em cima
	 * desse retorno para ver se ele est� valendo o valor esperado para esse
	 * cen�rio. 
	 * 
	 * 2 - Na classe ReajusteService � um outro tipo de teste, �
	 * um teste que estou chamando um m�todo, mas ele � void. O assert � feito em cima do objeto
	 * que estou passando como par�metro para o teste (desempenho).
	 * 
	 * 3 - E tem o terceiro tipo de teste, que � o teste de exception, onde
	 * estou simulando se uma exce��o est� acontecendo. No geral tem essas tr�s
	 * abordagens quando voc� for escrever os seus testes. Voc� vai testar um valor
	 * que � devolvido pelo m�todo, vai testar um objeto que � modificado pelo
	 * m�todo, ou vai testar uma exception.
	 */
}
