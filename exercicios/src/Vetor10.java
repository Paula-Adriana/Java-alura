

import java.util.Iterator;
import java.util.Scanner;

/* Faça um algoritmo para ler 10 números e armazenar em um vetor VET, verificar e escrever se existem números repetidos
 * no vetor VET e em que posições se encontram.*/
public class Vetor10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vet[] = new int[10];

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			vet[i] = entrada.nextInt();
			for (int j = 0; j < vet.length; j++) {
				if (vet[i] == vet[j] && i != j) {
					System.out.println("O número " + vet[i] + " já se encontra no vetor"
							+ " VET ocupando a posição " + j +".");
				}
			}

		}
		entrada.close();
	}
}
