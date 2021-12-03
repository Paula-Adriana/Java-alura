package exercicios;

import java.util.Scanner;

/*Elabore um programa para armazenar uma medida de raio em metros, determinar e exibir o per�metro e a �rea de
 * um c�rculo com esse raio, atrav�s das f�rmulas: per�metro = 2 x 3.14159 x raio; �rea = 3.14159 x raio�.*/
public class PerimetroArea {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double raio, perimetro, areaCirculo;
		
		System.out.print("Digite o valor do raio em metros: ");
		raio = entrada.nextDouble();
		
		perimetro = 2 * 3.14159 * raio;
		areaCirculo = 3.14159 * raio * raio;
		
		System.out.printf("O per�metro � de %.2f e a �rea � de %.2f ", perimetro, areaCirculo);
		
	}

}
