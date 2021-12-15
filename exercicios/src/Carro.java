

import java.util.Scanner;

/* O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos
 * (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
 * escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.*/
public class Carro {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double precoCarroNovo, precoFinal, percentualDistribuidor = 0.28, impostos = 0.45;
		
		System.out.print("Digite o valor de fábrica: R$ ");
		precoCarroNovo = entrada.nextDouble();
		
		precoFinal = precoCarroNovo + (precoCarroNovo*percentualDistribuidor) + (precoCarroNovo*impostos);
				
		System.out.printf("O preço final do carro será: %.2f ", precoFinal);
		
		entrada.close();
	}
}
