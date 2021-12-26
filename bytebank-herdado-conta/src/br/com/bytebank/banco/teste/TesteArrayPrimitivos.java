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
		
		//Declaração literal de um array já com o conteúdo:
		//int[] refs = {1,2,3,4,5};
	}

}
