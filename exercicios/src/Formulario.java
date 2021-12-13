import java.util.Scanner;

/* dada uma linha de texto, indicar se ele cabe ou n�o cabe em um formul�rio com 80 caracteres. A sa�da � dada em uma �nica
 * linha. ela deve ser "YES" (sem as aspas) se a linha de texto L tem at� 80 caracteres. Se L tem mais de 80 caracteres,
 * a sa�da deve ser "NO".*/
public class Formulario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu texto: ");
		String texto = entrada.nextLine(); //diferente do next() que l� at� o espa�o
											//nextLine() L� a linha at� a troca desta.
		
		System.out.println(texto.length() > 80 ? "NO" : "YES");

		entrada.close();
	}
}
