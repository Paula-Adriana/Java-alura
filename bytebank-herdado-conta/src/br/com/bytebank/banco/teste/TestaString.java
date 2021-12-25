package br.com.bytebank.banco.teste;

public class TestaString {

	public static void main(String[] args) {

		String nome = "paula";
		/*
		 * Objeto Literal! nome � uma referencia j� que String � uma classe. Por isso
		 * podemos fazer nome.executar_m�todos
		 * Sendo String uma classe, para facilitar a vida do desenvolvedor, n�o
		 * precisamos utilizar o new todas as vezes que formos trabalhar com Strings,
		 * mas nada impede que voc� o fa�a. As duas formas s�o funcionais,
		 * embora o segundo caso seja considerado uma m� pr�tica. A partir da primeira
		 * forma a m�quina virtual consegue executar algumas otimiza��es, o que �
		 * imposs�vel no segundo caso.
		 */

		String outra = nome.replace("a", "A");
		//ou nome = nome.replace("a", "A");
		//replace retorna uma String, ou toUpperCase ou LowerCase etc 
		//Para trocar qualquer coisa em uma string somente com um metodo que retorne outra string
		//pois � imut�vel.
		System.out.println(nome);
		System.out.println(outra);
		
		
		//CharAt 
		char c = nome.charAt(2);
		System.out.println(c);
		
		//IndexOf String s (mesmo m�todo variando nos parametros = sobrecarga)
		int pos = nome.indexOf("ul"); //substring
		System.out.println(pos);
		
		//Substring beginIndex (come�ando por qual posi��o)
		String sub = nome.substring(1);
		System.out.println(sub);
		
		
		//Comprimento da string
		System.out.println(nome.length());
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
			
		}
		
		//String vazio. Empty devolve booleano
		String vazio = " "; //com espa�o n�o � vazio
		System.out.println(vazio.isEmpty());
		
		//Trim tira os espa�os vazios de uma string
		String outroVazio = vazio.trim();
		System.out.println(outroVazio);
		System.out.println(outroVazio.isEmpty());
		
		//Contains String ou subString, retorna boolenao
		String teste = "* teste *";
		System.out.println(teste.contains("st"));
		
	}

}
