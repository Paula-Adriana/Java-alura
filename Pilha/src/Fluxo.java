public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (Exception ex) { // catch polim�rfico - n�o � uma boa pr�tica.
			// Melhor definir cada exce��o espec�fica (multi-catch ).
			String msg = ex.getMessage();// ex variavel qualquer que referenciar� a exce��o
			System.out.println("Exception: " + msg);
			ex.printStackTrace(); // imprime o rastro/caminho da exce��o
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
		 * A refer�ncia exception aponta para a ArithmeticException, que est� no HEAP
		 * (mem�ria de objetos). Precisamos falar para o Java pegar esse objeto,
		 * transformar em uma exce��o e "jogar" na pilha. O verbo "jogar", em ingl�s, �
		 * "throw"! Ent�o, vamos "jogar" o objeto a partir da refer�ncia exception:
		 * 
		 * Aqui criamos um objeto da classe ArithmeticException e o guardamos na
		 * refer�ncia ex. ArithmeticException ex = new
		 * ArithmeticException("deu errado"); throw ex;
		 * 
		 * Mas normalmente fazemos de maneira mais enxuta, sem guardar referencia:
		 */
		throw new MinhaExcecao("deu muito errado"); // att com a excecao que criamos.

		// System.out.println("Fim do metodo2");
	}
}
/*
 * Pilha (Stack )Organiza a execu��o do c�digo. N�o temos orienta��o a objetos,
 * mas independente do paradigma de programa��o, usamos uma pilha de execu��o. O
 * Java sempre ir� procurar primeiro pelo m�todo main(). Depois, ele cria a
 * pilha e coloca o bloco de c�digo dentro de outro, na pilha. A pilha existe
 * para saber qual m�todo est� sendo executado � o que est� no topo � e lembrar
 * quais ainda precisam ser executados.
 */
