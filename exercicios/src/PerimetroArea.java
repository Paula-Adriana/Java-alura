package exercicios;

import java.util.Scanner;

/*Elabore um programa para armazenar uma medida de raio em metros, determinar e exibir o perímetro e a área de
 * um círculo com esse raio, através das fórmulas: perímetro = 2 x 3.14159 x raio; área = 3.14159 x raio².*/
public class PerimetroArea {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double raio, perimetro, areaCirculo;
		
		System.out.print("Digite o valor do raio em metros: ");
		raio = entrada.nextDouble();
		
		perimetro = 2 * 3.14159 * raio;
		areaCirculo = 3.14159 * raio * raio;
		
		System.out.printf("O perímetro é de %.2f e a área é de %.2f ", perimetro, areaCirculo);
		
	}

}
