import java.util.Scanner;

/* dada uma linha de texto, indicar se ele cabe ou não cabe em um formulário com 80 caracteres. A saída é dada em uma única
 * linha. ela deve ser "YES" (sem as aspas) se a linha de texto L tem até 80 caracteres. Se L tem mais de 80 caracteres,
 * a saída deve ser "NO".*/
public class Formulario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu texto: ");
		String texto = entrada.nextLine(); //diferente do next() que lê até o espaço
											//nextLine() Lê a linha até a troca desta.
		
		System.out.println(texto.length() > 80 ? "NO" : "YES");

		entrada.close();
	}
}
