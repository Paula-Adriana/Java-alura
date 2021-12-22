package enuns;

public class Teste {

	public static void main(String[] args) {

		Prioridade pMin = Prioridade.MIN;
		Prioridade pMAX = Prioridade.MAX;
		/*
		 * Enuns não podem ser instanciados com new(). Utilizar o nome da classe
		 * "Prioridade" "ponto" + o objeto criado dentro do enum
		 */

		System.out.println(pMin.name());
		System.out.println(pMAX.name());

		System.out.println(pMin.ordinal());// 0 -> Primeiro objeto declarado
		System.out.println(pMAX.ordinal());// 2 -> Terceiro objeto declarado
		// Ao referenciar com o **.** Alguns métodos já aparecem vindos
		// da classe object que todos os objetos tem. Mas tem alguns métodos da própria
		// classe Enum
		// como o name, ordinal etc.
		
		//Também podemos chamar os construtores escritos por nós
		System.out.println(pMin.getValor());
		
		
		
	}

}
