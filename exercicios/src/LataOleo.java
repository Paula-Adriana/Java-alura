

import java.util.Scanner;

/* Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A, em que as
 * variáveis: V, R e A representam respectivamente o volume, o raio e a altura.*/
public class LataOleo {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double volume, raio, altura;
		
		System.out.print("Digite o raio da lata: ");
		raio = entrada.nextDouble();
		
		System.out.print("Digite a altura da lata: ");
		altura = entrada.nextDouble();
		
		volume = 3.14159 * raio * raio * altura;
		System.out.printf("O volume da lata é de %.2f m³", volume);
		
		
		entrada.close();
	}
}
