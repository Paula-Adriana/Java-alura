package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		Integer idadeRef = Integer.valueOf(29);// autoboxing
		int valor = idadeRef.intValue();// unboxing

		Double dRef = Double.valueOf(3.2);// autoboxing
		System.out.println(dRef.doubleValue());// unboxing

		// O tipo boolean possui uma particularidade, j� que deve possuir dois valores,
		// um para representar o verdadeiro, true, e outro que representa o falso,
		// false. Eles j� existem, como constantes, TRUE e FALSE.
		// Importante notar que, no Java, as constantes s�o sempre escritas em letras
		// mai�sculas.
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue()); // unboxing utilizando o booleanValue()

		// Classe Number: Esta classe pode ser �til, por exemplo, se quisermos criar uma
		// lista que aceite qualquer tipo de valor num�rico
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.6);
		lista.add(25.6f);

	}
}
