package br.com.alura.tdd.modelo;

public class TeoriaAbordagemTestes {
	/*
	 * Tem três abordagens nos testes.
	 * 1 - Tem teste que você vai chamar um método que devolve um valor (service.calcularBonus devolve um BigDecimal).
	 * Chamo um método, pego o retorno e faço o assert em cima
	 * desse retorno para ver se ele está valendo o valor esperado para esse
	 * cenário. 
	 * 
	 * 2 - Na classe ReajusteService é um outro tipo de teste, é
	 * um teste que estou chamando um método, mas ele é void. O assert é feito em cima do objeto
	 * que estou passando como parâmetro para o teste (desempenho).
	 * 
	 * 3 - E tem o terceiro tipo de teste, que é o teste de exception, onde
	 * estou simulando se uma exceção está acontecendo. No geral tem essas três
	 * abordagens quando você for escrever os seus testes. Você vai testar um valor
	 * que é devolvido pelo método, vai testar um objeto que é modificado pelo
	 * método, ou vai testar uma exception.
	 */
}
