package br.com.bytebank.banco.teste;

public class TestaString {

	public static void main(String[] args) {

		String nome = "paula";
		/*
		 * Objeto Literal! nome é uma referencia já que String é uma classe. Por isso
		 * podemos fazer nome.executar_métodos
		 * Sendo String uma classe, para facilitar a vida do desenvolvedor, não
		 * precisamos utilizar o new todas as vezes que formos trabalhar com Strings,
		 * mas nada impede que você o faça. As duas formas são funcionais,
		 * embora o segundo caso seja considerado uma má prática. A partir da primeira
		 * forma a máquina virtual consegue executar algumas otimizações, o que é
		 * impossível no segundo caso.
		 */

		String outra = nome.replace("a", "A");
		//ou nome = nome.replace("a", "A");
		//replace retorna uma String, ou toUpperCase ou LowerCase etc 
		//Para trocar qualquer coisa em uma string somente com um metodo que retorne outra string
		//pois é imutável.
		System.out.println(nome);
		System.out.println(outra);
		
		
		//CharAt 
		char c = nome.charAt(2);
		System.out.println(c);
		
		//IndexOf String s (mesmo método variando nos parametros = sobrecarga)
		int pos = nome.indexOf("ul"); //substring
		System.out.println(pos);
		
		//Substring beginIndex (começando por qual posição)
		String sub = nome.substring(1);
		System.out.println(sub);
		
		
		//Comprimento da string
		System.out.println(nome.length());
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
			
		}
		
		//String vazio. Empty devolve booleano
		String vazio = " "; //com espaço não é vazio
		System.out.println(vazio.isEmpty());
		
		//Trim tira os espaços vazios de uma string
		String outroVazio = vazio.trim();
		System.out.println(outroVazio);
		System.out.println(outroVazio.isEmpty());
		
		//Contains String ou subString, retorna boolenao
		String teste = "* teste *";
		System.out.println(teste.contains("st"));
		
	}

}
