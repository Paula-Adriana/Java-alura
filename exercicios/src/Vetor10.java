

import java.util.Iterator;
import java.util.Scanner;

/* Fa�a um algoritmo para ler 10 n�meros e armazenar em um vetor VET, verificar e escrever se existem n�meros repetidos
 * no vetor VET e em que posi��es se encontram.*/
public class Vetor10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vet[] = new int[10];

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite o " + (i + 1) + "� n�mero: ");
			vet[i] = entrada.nextInt();
			for (int j = 0; j < vet.length; j++) {
				if (vet[i] == vet[j] && i != j) {
					System.out.println("O n�mero " + vet[i] + " j� se encontra no vetor"
							+ " VET ocupando a posi��o " + j +".");
				}
			}

		}
		entrada.close();
	}
}
