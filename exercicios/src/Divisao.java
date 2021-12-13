import java.text.DecimalFormat;
import java.util.Scanner;

/*desenvolva um programa que calcule o quociente e o resto da divisão de dois números inteiros*/
public class Divisao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#.##");
		int num1, num2;
		
		System.out.print("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		
		do {
			System.out.print("Digite o segundo número: ");
			num2 = entrada.nextInt();
			if (num2 == 0) {
			System.out.println("Digite um número diferente de zero.");
			}
		} while (num2 == 0);
		
		int quociente = num1 / num2;
		int resto = num1 % num2;
		System.out.println("O quociente da divisão entre " + num1 + " e " + num2 + " é "+  formatador.format(quociente)
		+ ". E o resto é " + formatador.format(resto) + ".");
		
		
		
		
		
		
		
		
		
		entrada.close();
	}
}
