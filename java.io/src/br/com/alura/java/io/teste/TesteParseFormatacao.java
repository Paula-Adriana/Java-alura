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
																		// recebem como argumento qual charset ser�
																		// utilizado para fazer a transforma��o dos
																		// bytes em strings

		while (entrada.hasNext()) {
			String linha = entrada.nextLine();

			// Objeto criado para setorizar cada uma das linhas
			Scanner linhaScanner = new Scanner(linha);

			/*
			 * alguns lugares convencionam o ponto, enquanto outros utilizam a v�rgula (,)
			 * para separa��o de milhares. O que determina se a m�quina virtual seguir� um
			 * padr�o ou outro � o sistema operacional da m�quina, ela seguir� o padr�o do
			 * idioma da m�quina em que o c�digo est� sendo escrito. Para evitar esta regra
			 * autom�tica, podemos especificar no c�digo a regra que queremos seguir
			 * utilizando o m�todo useLocale().
			 */
			linhaScanner.useLocale(Locale.US);

			/*
			 * precisamos indicar para o linhaScanner que a an�lise da linha deve ser feita
			 * respeitando determinando crit�rio de separa��o das informa��es, que em nosso
			 * caso � a v�rgula (,). Em programa��o, chamamos este crit�rio de delimitador,
			 * mais especificamente Delimiter.
			 * 
			 * Sendo assim, utilizaremos o m�todo useDelimiter(), que receber� nosso padr�o,
			 * que como j� foi discutido, � a v�rgula (,)
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
		 * METODO SPLIT O m�todo split() recebe como par�metro uma String do tipo regex,
		 * que � um conjunto de caracteres que define regras de como analisar, ou
		 * separar, uma String maior.
		 */
//		String[] valores = linha.split(",");
//      System.out.println(valores[1]);

		entrada.close();

	}

}
