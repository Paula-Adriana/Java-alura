package br.com.alura.testes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAluno {
	public static void main(String[] args) {

		// Set é uma interface, não podemos usar o new, então vamos dar new na
		// implementação mais utilizada dela, o HashSet.
		//Pode ser mais generica a declaração: Collection<String> alunos = new HashSet<>();
		Set<String> alunos = new HashSet<>();
		alunos.add("Alberto Souza");
		alunos.add("Julia Silva");
		alunos.add("José Almeira");
		alunos.add("Amanda Lopes");
		alunos.add("Abel Sers");
		alunos.add("Ana Quey");
		alunos.add("Mauricio Oz");
		alunos.add("Mauricio Oz");

		// Na impressao: quando utilizamos um conjunto, um set, não temos garantia da
		// ordem em
		// que os elementos vão ficar dentro desse conjunto, desse "saco de objetos". Um
		// conjunto (diferente de uma lista, que representa uma sequência de objetos) é
		// uma "sacola", e lá dentro está cheio de objetos, e você não sabe em que ordem
		// eles estão.
		System.out.println(alunos);

		// Mas e para acessar esses elementos? Podemos fazer um foreach
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		//Vantagens de um set
		// O metodo contains retorna um booleano dizendo se a coleção possui ou não determinado
		// objeto que passamos para o método. E esse método é extremamente rápido quando
		// executado em um HashSet pq usa uma tabela de espalhamento. 
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);

		
		//podemos criar uma lista do set para utilizar metodos de acesso:
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println("Alunos em lista - indice 2: " + alunosEmLista.get(2));
	}
}
