package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {
	public static void main(String[] args) throws IOException { //o java.io est� repleto de exce��es checked .
		
		/*Somente com o FileWriter j� funciona
		FileWriter fw = new FileWriter("lorem2.txt");
		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
		fw.write("teste");
		*/
		
		
		//Mas fica melhor usando o Buffered junto (+alto n�vel - embrulhando tudo)
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.write("teste");
		
		
		
		bw.close();
	}
}

