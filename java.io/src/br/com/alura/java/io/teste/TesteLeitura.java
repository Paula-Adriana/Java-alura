package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException { //o java.io est� repleto de exce��es checked .

		// Fluxo de entrada de arquivos
		InputStream fis = new FileInputStream("lorem.txt");
		/*
		 * InputStream � uma classe (abstrata) que representa o fluxo de dados bin�rios.
		 * 
		 */

		Reader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		/*
		 * Reader � uma classe (abstrata) que possui dois filhos concretos a
		 * InputStreamReader e BufferedReader. O que ambas t�m em comum � que s�o
		 * Readers, ou seja, compete � elas a LEITURA de caracteres.
		 */

		String linha = br.readLine();
		/*
		 * Ao utilizarmos o m�todo br.readLine(), pedimos primeiro ao BufferedLine, ele
		 * por sua vez faz o pedido ao (InputStream)Reader que, seguindo a ordem, pede
		 * ao FileStreamReader (InputStream) que fa�a a leitura dos dados do arquivo,
		 * que no caso � lorem.txt.
		 * 
		 * Visualmente: BufferedReader> Reader > InputStream > lorem.txt
		 * 
		 * Isso que fizemos � um padr�o de projeto chamado decorator, ou seja, um objeto
		 * est� decorando a funcionalidade de outro, sucessivamente. Em geral, o java.io
		 * � repleto de padr�es de projeto.
		 */
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		/*
		 * O m�todo readLine() nos d� um retorno null quando n�o h� mais nenhum
		 * conte�do, portanto, criaremos um while, indicando que, enquanto a linha n�o
		 * for nula (null), teremos a impress�o desta e leremos a pr�xima
		 */
		
		br.close();
		//Isso faz com que tanto o FileInputStream quanto o InputStreamReader sejam fechados automaticamente.
	}
}

/*
 * STREAM e READER. Existem tanto para entrada quanto sa�da!!!.
 * 
 * Stream: faz uma leitura de bits e bytes, um "input stream of bytes".
 * P.S: Se precisamos ler uma imagem ou um PDF, por exemplo, utilizamos sempre o Stream.
 * 
 * Reader: tamb�m faz uma leitura, s� que esta � focada nos caracteres, "reading character streams".
 * 	- InputStreamReader: transforma bytes em caracteres
 * 	- BufferedReader: representa o conjunto de caracteres. 
 * 
 * 


 * 
 */