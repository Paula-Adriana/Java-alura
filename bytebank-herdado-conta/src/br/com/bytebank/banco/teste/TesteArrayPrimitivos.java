package br.com.bytebank.banco.teste;

public class TesteArrayPrimitivos {

	public static void main(String[] args) {
		//Declaracao de um array
		int[] idades = new int[5];
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
			
		}
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
			
		}
		
		//Declara��o literal de um array j� com o conte�do:
		//int[] refs = {1,2,3,4,5};
	}

}
