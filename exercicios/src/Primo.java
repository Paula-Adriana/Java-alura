package exercicios;

/* N�mero primo � aquele que s� � divis�vel por ele mesmo e pela unidade. Fazer um algoritmo que determine e escreva os
 * n�meros primos compreendidos entre um intervalo fornecido pelo usu�rio.*/
import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroInicial, numeroFinal, primo = 0;

		System.out.print("Digite o primeiro n�mero: ");
		numeroInicial = entrada.nextInt();

		System.out.print("Digite o �ltimo n�mero: ");
		numeroFinal = entrada.nextInt();
		for (int i = numeroInicial; i <= numeroFinal; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					primo++;
				}
			}
			if (primo == 2) { // somente dois n�meros divis�veis foram encontrados: 1 e o pr�prio i, ou seja, primo!
				System.out.println("O n�mero " + i + " � primo!");

			}
			primo = 0;
		}

		entrada.close();
	}
}
