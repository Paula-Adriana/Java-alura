package enuns;

public class Teste {

	public static void main(String[] args) {

		Prioridade pMin = Prioridade.MIN;
		Prioridade pMAX = Prioridade.MAX;
		/*
		 * Enuns n�o podem ser instanciados com new(). Utilizar o nome da classe
		 * "Prioridade" "ponto" + o objeto criado dentro do enum
		 */

		System.out.println(pMin.name());
		System.out.println(pMAX.name());

		System.out.println(pMin.ordinal());// 0 -> Primeiro objeto declarado
		System.out.println(pMAX.ordinal());// 2 -> Terceiro objeto declarado
		// Ao referenciar com o **.** Alguns m�todos j� aparecem vindos
		// da classe object que todos os objetos tem. Mas tem alguns m�todos da pr�pria
		// classe Enum
		// como o name, ordinal etc.
		
		//Tamb�m podemos chamar os construtores escritos por n�s
		System.out.println(pMin.getValor());
		
		
		
	}

}
