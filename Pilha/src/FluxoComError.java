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
		System.out.println("Ini do metodo2"); // Exceção metodo 2 chama metodo 2.
		metodo2();
		System.out.println("Fim do metodo2");
	}
}
/*
 * O metodo 2 fica chamando o metodo 2 (isso é chamado de RECURSÃO) até não ter mais espaço na pilha. A
 * máquina virtual pode não conseguir mais executar o código porque a pilha de
 * execução não tem mais memória o suficiente, e então ela jogará um erro
 * internamente o StackOverflowError.
 * StackOverflowError é um erro da máquina virtual para informar que a pilha de execução
 * não tem mais memória.
 * Hierarquia: StackOverflowError -> VirtualMachineError -> Error -> Trowable.
 * 
 */
