package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException { //o java.io está repleto de exceções checked .

		// Fluxo de entrada de arquivos
		InputStream fis = new FileInputStream("lorem.txt");
		/*
		 * InputStream é uma classe (abstrata) que representa o fluxo de dados binários.
		 * 
		 */

		Reader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		/*
		 * Reader é uma classe (abstrata) que possui dois filhos concretos a
		 * InputStreamReader e BufferedReader. O que ambas têm em comum é que são
		 * Readers, ou seja, compete à elas a LEITURA de caracteres.
		 */

		String linha = br.readLine();
		/*
		 * Ao utilizarmos o método br.readLine(), pedimos primeiro ao BufferedLine, ele
		 * por sua vez faz o pedido ao (InputStream)Reader que, seguindo a ordem, pede
		 * ao FileStreamReader (InputStream) que faça a leitura dos dados do arquivo,
		 * que no caso é lorem.txt.
		 * 
		 * Visualmente: BufferedReader> Reader > InputStream > lorem.txt
		 * 
		 * Isso que fizemos é um padrão de projeto chamado decorator, ou seja, um objeto
		 * está decorando a funcionalidade de outro, sucessivamente. Em geral, o java.io
		 * é repleto de padrões de projeto.
		 */
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		/*
		 * O método readLine() nos dá um retorno null quando não há mais nenhum
		 * conteúdo, portanto, criaremos um while, indicando que, enquanto a linha não
		 * for nula (null), teremos a impressão desta e leremos a próxima
		 */
		
		br.close();
		//Isso faz com que tanto o FileInputStream quanto o InputStreamReader sejam fechados automaticamente.
	}
}

/*
 * STREAM e READER. Existem tanto para entrada quanto saída!!!.
 * 
 * Stream: faz uma leitura de bits e bytes, um "input stream of bytes".
 * P.S: Se precisamos ler uma imagem ou um PDF, por exemplo, utilizamos sempre o Stream.
 * 
 * Reader: também faz uma leitura, só que esta é focada nos caracteres, "reading character streams".
 * 	- InputStreamReader: transforma bytes em caracteres
 * 	- BufferedReader: representa o conjunto de caracteres. 
 * 
 * 


 * 
 */