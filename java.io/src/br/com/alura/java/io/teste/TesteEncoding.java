package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String s = "ç";
		// revela o codepoint de determinado caractere a partir de sua posi��o na string
		System.out.println(s.codePointAt(0));

		// m�todo est�tico para retornar uma refer�ncia com o charset default
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());

		// m�todo para transformar os caracteres em bytes
		// Existem tamb�m duas sobrecargas para esse m�todo (getBytes), onde voc� pode informar o
		// charset que deseja utilizar para a transforma��o.
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
