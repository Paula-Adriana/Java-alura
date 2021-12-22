public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (Exception ex) { // catch polimórfico - não é uma boa prática.
			// Melhor definir cada exceção específica (multi-catch ).
			String msg = ex.getMessage();// ex variavel qualquer que referenciará a exceção
			System.out.println("Exception: " + msg);
			ex.printStackTrace(); // imprime o rastro/caminho da exceção
		}

		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo2");
		/*
		 * A referência exception aponta para a ArithmeticException, que está no HEAP
		 * (memória de objetos). Precisamos falar para o Java pegar esse objeto,
		 * transformar em uma exceção e "jogar" na pilha. O verbo "jogar", em inglês, é
		 * "throw"! Então, vamos "jogar" o objeto a partir da referência exception:
		 * 
		 * Aqui criamos um objeto da classe ArithmeticException e o guardamos na
		 * referência ex. ArithmeticException ex = new
		 * ArithmeticException("deu errado"); throw ex;
		 * 
		 * Mas normalmente fazemos de maneira mais enxuta, sem guardar referencia:
		 */
		throw new MinhaExcecao("deu muito errado"); // att com a excecao que criamos.

		// System.out.println("Fim do metodo2");
	}
}
/*
 * Pilha (Stack )Organiza a execução do código. Não temos orientação a objetos,
 * mas independente do paradigma de programação, usamos uma pilha de execução. O
 * Java sempre irá procurar primeiro pelo método main(). Depois, ele cria a
 * pilha e coloca o bloco de código dentro de outro, na pilha. A pilha existe
 * para saber qual método está sendo executado — o que está no topo — e lembrar
 * quais ainda precisam ser executados.
 */
