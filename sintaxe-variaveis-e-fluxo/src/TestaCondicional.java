
public class TestaCondicional {

	public static void main(String[] args) {

		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos.");
			System.out.println("Seja bem-vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� n�o tem 18 anos, mas pode entrar," 
						+ "pois est� acompanhado!");
				/*frase muito longa dentro da string com um enter a IDE quebra a linha corretamente*/
			} else {
				System.out.println("Infelizmente voc� n�o pode entrar!");
			}
		}

	}
}