public class FluxoComError {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception: " + msg);
			ex.printStackTrace();
		}

		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2"); // Exce��o metodo 2 chama metodo 2.
		metodo2();
		System.out.println("Fim do metodo2");
	}
}
/*
 * O metodo 2 fica chamando o metodo 2 (isso � chamado de RECURS�O) at� n�o ter mais espa�o na pilha. A
 * m�quina virtual pode n�o conseguir mais executar o c�digo porque a pilha de
 * execu��o n�o tem mais mem�ria o suficiente, e ent�o ela jogar� um erro
 * internamente o StackOverflowError.
 * StackOverflowError � um erro da m�quina virtual para informar que a pilha de execu��o
 * n�o tem mais mem�ria.
 * Hierarquia: StackOverflowError -> VirtualMachineError -> Error -> Trowable.
 * 
 */
