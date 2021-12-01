package exercicios;
/*Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), R�aumur (Re),
 *Rankine (Ra) e Fahrenheit (F), seguindo as f�rmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8;
 * Ra = C * 1.8 + 32 + 459.67*/
public class TestaCelsius {
	
	public static void main(String[] args) {
		double celsius, kelvin, r�amur, rankine, fahrenheit;
		celsius = 25;
		kelvin = celsius + 273.15;
		r�amur = celsius * 0.8;
		rankine = celsius * 1.8 + 32 + 459.67;
		fahrenheit = (celsius * 1.8) +32;
		System.out.printf("A temperatura de %.2f graus Celsius � equivalente a %.2f Kelvin, "
				+  "%.2f R�amur, %.2f Rankine e %.2f Fahrenheit.", celsius, kelvin, r�amur, rankine, fahrenheit);
		
	}
}
