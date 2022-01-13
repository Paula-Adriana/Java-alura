package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Scanner;

public class TesteParseFormatacao {

	public static void main(String[] args) throws Exception {
		// Objeto criado para ler linha a linha
		Scanner entrada = new Scanner(new File("contas.csv"), "UTF-8"); // As classes Scanner e InputStreamReader
																		// possuem sobrecargas de construtores que
																		// recebem como argumento qual charset será
																		// utilizado para fazer a transformação dos
																		// bytes em strings

		while (entrada.hasNext()) {
			String linha = entrada.nextLine();

			// Objeto criado para setorizar cada uma das linhas
			Scanner linhaScanner = new Scanner(linha);

			/*
			 * alguns lugares convencionam o ponto, enquanto outros utilizam a vírgula (,)
			 * para separação de milhares. O que determina se a máquina virtual seguirá um
			 * padrão ou outro é o sistema operacional da máquina, ela seguirá o padrão do
			 * idioma da máquina em que o código está sendo escrito. Para evitar esta regra
			 * automática, podemos especificar no código a regra que queremos seguir
			 * utilizando o método useLocale().
			 */
			linhaScanner.useLocale(Locale.US);

			/*
			 * precisamos indicar para o linhaScanner que a análise da linha deve ser feita
			 * respeitando determinando critério de separação das informações, que em nosso
			 * caso é a vírgula (,). Em programação, chamamos este critério de delimitador,
			 * mais especificamente Delimiter.
			 * 
			 * Sendo assim, utilizaremos o método useDelimiter(), que receberá nosso padrão,
			 * que como já foi discutido, é a vírgula (,)
			 */
			linhaScanner.useDelimiter(",");

			// Parseando para int e double
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();

			System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %08.2f%n", tipoConta, agencia, numero,
					titular, saldo);
		}

		/*
		 * METODO SPLIT O método split() recebe como parâmetro uma String do tipo regex,
		 * que é um conjunto de caracteres que define regras de como analisar, ou
		 * separar, uma String maior.
		 */
//		String[] valores = linha.split(",");
//      System.out.println(valores[1]);

		entrada.close();

	}

}
