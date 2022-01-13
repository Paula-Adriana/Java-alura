package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String s = "ç";
		// revela o codepoint de determinado caractere a partir de sua posição na string
		System.out.println(s.codePointAt(0));

		// método estático para retornar uma referência com o charset default
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());

		// método para transformar os caracteres em bytes
		// Existem também duas sobrecargas para esse método (getBytes), onde você pode informar o
		// charset que deseja utilizar para a transformação.
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252, ");
		String sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);

		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16, ");
		sNovo = new String(bytes, "UTF-16");
		System.out.println(sNovo);
		
		
		//classe que possui constantes pra os principais charsets.
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", US-ASCII, ");
		sNovo = new String(bytes, "US-ASCII");
		System.out.println(sNovo);

	}
}
