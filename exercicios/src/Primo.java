package exercicios;

/* Número primo é aquele que só é divisível por ele mesmo e pela unidade. Fazer um algoritmo que determine e escreva os
 * números primos compreendidos entre um intervalo fornecido pelo usuário.*/
import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroInicial, numeroFinal, primo = 0;

		System.out.print("Digite o primeiro número: ");
		numeroInicial = entrada.nextInt();

		System.out.print("Digite o último número: ");
		numeroFinal = entrada.nextInt();
		for (int i = numeroInicial; i <= numeroFinal; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					primo++;
				}
			}
			if (primo == 2) { // somente dois números divisíveis foram encontrados: 1 e o próprio i, ou seja, primo!
				System.out.println("O número " + i + " é primo!");

			}
			primo = 0;
		}

		entrada.close();
	}
}
