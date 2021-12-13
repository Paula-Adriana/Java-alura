import java.text.DecimalFormat;
import java.util.Scanner;

/* Leia quatro n�meros (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente �s quatro notas de um aluno.
 * Calcule a m�dia com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta m�dia acompanhada
 * pela mensagem "Media: ". Se esta m�dia for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a m�dia
 * calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". Se a m�dia calculada for um valor entre 5.0 e
 * 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.". No caso do aluno estar em exame, leia um 
 * valor correspondente � nota do exame obtida pelo aluno. Imprima ent�o a 
 * mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule a m�dia (some a pontua��o do exame com a m�dia
 * anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado." (caso a m�dia final seja 5.0 ou mais )
 * ou "Aluno reprovado.", (caso a m�dia tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado ap�s ter
 * pego exame) apresente na �ltima linha uma mensagem "Media final: " seguido da m�dia final para esse aluno.*/
public class Medias {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#.#");

		double nota, n1 = 0, n2 = 0, n3 = 0, n4 = 0, media = 0, exame;
		String situacao;

		for (int i = 0; i < 4; i++) {
			System.out.print("Digite a " + (i + 1) + "� nota: ");
			nota = entrada.nextDouble();

			if (i == 0) {
				n1 = nota * 0.2;
			} else if (i == 1) {
				n2 = nota * 0.3;
			} else if (i == 2) {
				n3 = nota * 0.4;
			} else {
				n4 = nota * 0.1;
			}
			media = n1 + n2 + n3 + n4;
		}

		if (media < 5) {
			situacao = "Aluno reprovado!";
		} else if (media < 6.9) {
			situacao = "Aluno em exame!";
		} else {
			situacao = "Aluno aprovado!";
		}
		
		System.out.println("M�dia final: " + formatador.format(media) + ". ");
		System.out.println(situacao);
	
		
		if (situacao == "Aluno em exame!") {
			System.out.print("Digite a nota do exame: ");
			exame = entrada.nextDouble();
			System.out.println("*******************");
			System.out.print("Nota do exame: " + formatador.format(exame));
			media = (media + exame) / 2;
			System.out.println();
			if (media >= 5) {
				situacao = "Aluno aprovado!";
			} else {
				situacao = "Aluno reprovado";
			}
			System.out.println("M�dia final: " + formatador.format(media) + ". ");
			System.out.println(situacao);
		}

		

		entrada.close();
	}
}
