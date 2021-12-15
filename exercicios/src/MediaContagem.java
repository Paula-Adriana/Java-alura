

import java.util.Scanner;

public class MediaContagem {

	public static void main(String[] args) {
		float altura, maiorAltura = 0, menorAltura = 3, mediaHomens = 0, somaAlturaHomens = 0;
		int sexo, quantidadeHomens = 0, quantidadeMulheres = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i <= 3; i++) {
			System.out.print("Qual o sexo: 1-Mulher | 2-Homem ");
			sexo = entrada.nextInt();
			System.out.print("Qual a altura: ");
			altura = entrada.nextFloat();
			if (sexo == 1) {
				quantidadeMulheres++;
			} else if (sexo == 2) {
				quantidadeHomens++;
				somaAlturaHomens += altura;
			} else {
				System.out.println("Opção de sexo inválida!");
			}
			if (altura > maiorAltura) {
				maiorAltura = altura;
			} else if (altura < menorAltura) {
				menorAltura = altura;
			}
			mediaHomens = somaAlturaHomens / quantidadeHomens;
		}
		
			System.out.println("A maior altura do grupo foi: " + maiorAltura);
			System.out.println("A menor altura do grupo foi: " + menorAltura);
			System.out.printf("A média de altura dos homens foi %.2f :\n", mediaHomens);
			System.out.println("O número de mulheres foi: " + quantidadeMulheres);

			entrada.close();
		
	}
}
