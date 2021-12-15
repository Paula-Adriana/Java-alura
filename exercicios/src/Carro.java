

import java.util.Scanner;

/* O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do distribuidor e dos impostos
 * (aplicados ao custo de f�brica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
 * escrever um algoritmo para ler o custo de f�brica de um carro, calcular e escrever o custo final ao consumidor.*/
public class Carro {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double precoCarroNovo, precoFinal, percentualDistribuidor = 0.28, impostos = 0.45;
		
		System.out.print("Digite o valor de f�brica: R$ ");
		precoCarroNovo = entrada.nextDouble();
		
		precoFinal = precoCarroNovo + (precoCarroNovo*percentualDistribuidor) + (precoCarroNovo*impostos);
				
		System.out.printf("O pre�o final do carro ser�: %.2f ", precoFinal);
		
		entrada.close();
	}
}
