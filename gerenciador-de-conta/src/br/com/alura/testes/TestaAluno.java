package br.com.alura.testes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAluno {
	public static void main(String[] args) {

		// Set � uma interface, n�o podemos usar o new, ent�o vamos dar new na
		// implementa��o mais utilizada dela, o HashSet.
		//Pode ser mais generica a declara��o: Collection<String> alunos = new HashSet<>();
		Set<String> alunos = new HashSet<>();
		alunos.add("Alberto Souza");
		alunos.add("Julia Silva");
		alunos.add("Jos� Almeira");
		alunos.add("Amanda Lopes");
		alunos.add("Abel Sers");
		alunos.add("Ana Quey");
		alunos.add("Mauricio Oz");
		alunos.add("Mauricio Oz");

		// Na impressao: quando utilizamos um conjunto, um set, n�o temos garantia da
		// ordem em
		// que os elementos v�o ficar dentro desse conjunto, desse "saco de objetos". Um
		// conjunto (diferente de uma lista, que representa uma sequ�ncia de objetos) �
		// uma "sacola", e l� dentro est� cheio de objetos, e voc� n�o sabe em que ordem
		// eles est�o.
		System.out.println(alunos);

		// Mas e para acessar esses elementos? Podemos fazer um foreach
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		//Vantagens de um set
		// O metodo contains retorna um booleano dizendo se a cole��o possui ou n�o determinado
		// objeto que passamos para o m�todo. E esse m�todo � extremamente r�pido quando
		// executado em um HashSet pq usa uma tabela de espalhamento. 
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);

		
		//podemos criar uma lista do set para utilizar metodos de acesso:
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println("Alunos em lista - indice 2: " + alunosEmLista.get(2));
	}
}
