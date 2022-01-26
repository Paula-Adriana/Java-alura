package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.modelo.Aula;

public class TestaListaDeAula {
	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as arrayLists" ,21);
		Aula a2 = new Aula("Listas de objetos" ,20);
		Aula a3 = new Aula("Relacionamento de listas e objetos" , 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		System.out.println(aulas);
		
		//Usando comparable string que usa o compareTo
		Collections.sort(aulas);
		System.out.println(aulas);
		
		//Usando outro criterio de comparacao (tempo de video, por ex)
		/*Usando interface Comparator com o metodo keyextractor
		 * lê-se: ordene estas aulas utilizando como comparação o retorno do método getTempo de cada Aula*/
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}
}
