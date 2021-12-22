
public class MinhaExcecao extends Exception {// checked!!!!

	// Criar um construtor que receba uma string e possa devolver uma mensagem
	public MinhaExcecao(String msg) {
		super(msg); // = est� no construtor da classe mae mas o nome do parametro pode ser diferente
	}
}
/*
 * Ao estudarmos hierarquia das exce��es vimos que � a classe do topo �
 * Throwable � quem realmente faz as coisas. Exception e RuntimeException n�o
 * possuem utilidade e cada uma s� possui alguns construtores. Mas mesmo assim,
 * n�s estendemos RuntimeException.
 * 
 * Mas, n�o seria mais f�cil cortar caminho e estender diretamente o Throwable?
 * Considerando que RuntimeException e Exception n�o possuem utilidade? Errado!
 * Existem duas categorias de exce��es criadas dentro das exce��es para o
 * desenvolvedor de aplica��es. A primeira categoria � a que estende de
 * RuntimeException, e a outra � a que estende diretamente de Exception. O
 * compilador faz uma verifica��o sint�tica para ver quem d� throw nessas
 * exce��es. Isso significa que a exce��o exige que fique expl�cito na
 * assinatura do m�todo que estamos jogando a exce��o:
 * 
 * private static void metodo2() throws MinhaExcecao {
 * System.out.println("Ini do metodo2"); throw new
 * MinhaExcecao("deu muito errado");
 * 
 * //System.out.println("Fim do metodo2"); } Quando usamos throw new de uma
 * exce��o que estende diretamente da classe Exception, o compilador exige que
 * coloquemos, explicitamente, throws na assinatura do m�todo.
 * 
 * A ideia � que o "perigo" � a exce��o � fique expl�cita na assinatura do
 * m�todo. Com isso, temos duas categorias novas de Exception. A primeira � a
 * que estende de RuntimeException e se chama Unchecked. A segunda categoria � a
 * que estende diretamente de Exception, chamada de Checked. temos duas formas
 * de resolver uma exce��o checked.
 * 
 * Ou colocamos o throws na assinatura, ou fazemos um try-catch. Se estamos
 * resolvendo, n�o � necess�rio colocar o throws na assinatura do m�todo. O
 * Checked e o Unchecked est�o relacionados ao processo de compila��o.
 * 
 * 
 * Existe uma outra hierarquia de classes que estende Throwable, como a classe
 * Error. Entretanto, n�s n�o a conhecemos muito bem, porque � uma hierarquia
 * pensada para desenvolvedores de m�quina virtual. N�s, desenvolvedores Java,
 * n�o trabalhamos com essas classes diretamente. Quem cria e joga esses objetos
 * na pilha � a m�quina virtual, quando algo muito grave acontece (ver
 * FluxoComError).
 * 
 * SOBRE O CHECKED!
 * Se voc� gosta de avisar aquele desenvolvedor que usar� a sua classe, para que
 * ele fa�a um tratamento, pois algumas exce��es podem ocorrer, use checked. Se
 * voc� acha que n�o precisa disso e que o desenvolvedor pode fazer o tratamento
 * quando ele achar melhor, use unchecked.
 */