package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com cursos e Sets";

		// Criando a referencia "aulas" e para usar a ref instanciar o objeto com o new.
		ArrayList<String> aulas = new ArrayList<>();

		// Adicionando elementos no arraylist
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		System.out.println(aulas);

		// Removendo pelo indice (mas pode ser pelo objeto tb)
		aulas.remove(0);
		System.out.println(aulas);

		// Foreach
		// Para cada String "aula" dentro de "aulas" faça:
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		// Metodo get
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);

		// Tamanho da lista - coleção sempre size.
		System.out.println(aulas.size());

		// Percorrendo listas
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("aula: " + aulas.get(i));
		}

		// Percorrendo com forEach (aqui é o método e não e a palavra chave for). É
		// passado uma action. Que é um lambda. lê-se: para cada objeto aula faça:
		// Na pratica é = ao forEach mas + elegante.
		aulas.forEach(aula -> {
			System.out.println("Percorrendo com foreach aula: " + aulas);
		});

		// Ordenando listas
		aulas.add("Adicionando uma aula com 'A'");
		Collections.sort(aulas); // No caso da String, quem implementou a classe decidiu que o critério de
									// comparação seria a ordem lexicográfica
		System.out.println("Depois da ordenação: " + aulas);

		// Repare:
		// Collection = é uma interface
		// CollectionS = Classe com um conjunto de métodos estáticos auxiliares as
		// coleções.

	}

}
