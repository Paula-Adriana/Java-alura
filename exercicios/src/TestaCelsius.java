package exercicios;
/*Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re),
 *Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8;
 * Ra = C * 1.8 + 32 + 459.67*/
public class TestaCelsius {
	
	public static void main(String[] args) {
		double celsius, kelvin, réamur, rankine, fahrenheit;
		celsius = 25;
		kelvin = celsius + 273.15;
		réamur = celsius * 0.8;
		rankine = celsius * 1.8 + 32 + 459.67;
		fahrenheit = (celsius * 1.8) +32;
		System.out.printf("A temperatura de %.2f graus Celsius é equivalente a %.2f Kelvin, "
				+  "%.2f Réamur, %.2f Rankine e %.2f Fahrenheit.", celsius, kelvin, réamur, rankine, fahrenheit);
		
	}
}
