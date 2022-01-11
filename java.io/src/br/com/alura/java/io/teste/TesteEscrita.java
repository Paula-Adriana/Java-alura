package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) throws IOException { //o java.io est� repleto de exce��es checked .
		
		// Fluxo de sa�da de arquivos
		OutputStream fos = new FileOutputStream("lorem2.txt"); //pra n�o sobrescrever o arquivo lorem
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("teste");
		
		
		bw.close();
	}
}

