package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class TesteEscritaPrint {
	public static void main(String[] args) throws IOException { //o java.io está repleto de exceções checked .
		
		PrintStream ps = new PrintStream("lorem2.txt");
		
		//Ou PrintWriter pw = new PrintWriter("lorem2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("mais um teste");

		ps.close();
	}
}

