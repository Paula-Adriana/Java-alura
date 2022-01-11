package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {
	public static void main(String[] args) throws IOException {
		
		
		//Entrada
		InputStream fis = new FileInputStream("lorem.txt"); //Para entrada no console: System.in; 
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		//Saida
		OutputStream fos = new FileOutputStream("lorem2.txt"); //Para saída no console: System.out; bw.flush()
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		while (linha != null) {
			bw.write(linha); //copiando arquivo lorem para lorem2
			bw.newLine();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
	}
}

