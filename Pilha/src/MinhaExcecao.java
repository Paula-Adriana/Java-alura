
public class MinhaExcecao extends Exception {// checked!!!!

	// Criar um construtor que receba uma string e possa devolver uma mensagem
	public MinhaExcecao(String msg) {
		super(msg); // = está no construtor da classe mae mas o nome do parametro pode ser diferente
	}
}
/*
 * Ao estudarmos hierarquia das exceções vimos que é a classe do topo —
 * Throwable — quem realmente faz as coisas. Exception e RuntimeException não
 * possuem utilidade e cada uma só possui alguns construtores. Mas mesmo assim,
 * nós estendemos RuntimeException.
 * 
 * Mas, não seria mais fácil cortar caminho e estender diretamente o Throwable?
 * Considerando que RuntimeException e Exception não possuem utilidade? Errado!
 * Existem duas categorias de exceções criadas dentro das exceções para o
 * desenvolvedor de aplicações. A primeira categoria é a que estende de
 * RuntimeException, e a outra é a que estende diretamente de Exception. O
 * compilador faz uma verificação sintática para ver quem dá throw nessas
 * exceções. Isso significa que a exceção exige que fique explícito na
 * assinatura do método que estamos jogando a exceção:
 * 
 * private static void metodo2() throws MinhaExcecao {
 * System.out.println("Ini do metodo2"); throw new
 * MinhaExcecao("deu muito errado");
 * 
 * //System.out.println("Fim do metodo2"); } Quando usamos throw new de uma
 * exceção que estende diretamente da classe Exception, o compilador exige que
 * coloquemos, explicitamente, throws na assinatura do método.
 * 
 * A ideia é que o "perigo" — a exceção — fique explícita na assinatura do
 * método. Com isso, temos duas categorias novas de Exception. A primeira é a
 * que estende de RuntimeException e se chama Unchecked. A segunda categoria é a
 * que estende diretamente de Exception, chamada de Checked. temos duas formas
 * de resolver uma exceção checked.
 * 
 * Ou colocamos o throws na assinatura, ou fazemos um try-catch. Se estamos
 * resolvendo, não é necessário colocar o throws na assinatura do método. O
 * Checked e o Unchecked estão relacionados ao processo de compilação.
 * 
 * 
 * Existe uma outra hierarquia de classes que estende Throwable, como a classe
 * Error. Entretanto, nós não a conhecemos muito bem, porque é uma hierarquia
 * pensada para desenvolvedores de máquina virtual. Nós, desenvolvedores Java,
 * não trabalhamos com essas classes diretamente. Quem cria e joga esses objetos
 * na pilha é a máquina virtual, quando algo muito grave acontece (ver
 * FluxoComError).
 * 
 * SOBRE O CHECKED!
 * Se você gosta de avisar aquele desenvolvedor que usará a sua classe, para que
 * ele faça um tratamento, pois algumas exceções podem ocorrer, use checked. Se
 * você acha que não precisa disso e que o desenvolvedor pode fazer o tratamento
 * quando ele achar melhor, use unchecked.
 */