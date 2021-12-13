import java.text.DecimalFormat;
import java.util.Scanner;

/*desenvolva um programa que calcule o quociente e o resto da divis�o de dois n�meros inteiros*/
public class Divisao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#.##");
		int num1, num2;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = entrada.nextInt();
		
		do {
			System.out.print("Digite o segundo n�mero: ");
			num2 = entrada.nextInt();
			if (num2 == 0) {
			System.out.println("Digite um n�mero diferente de zero.");
			}
		} while (num2 == 0);
		
		int quociente = num1 / num2;
		int resto = num1 % num2;
		System.out.println("O quociente da divis�o entre " + num1 + " e " + num2 + " � "+  formatador.format(quociente)
		+ ". E o resto � " + formatador.format(resto) + ".");
		
		
		
		
		
		
		
		
		
		entrada.close();
	}
}
