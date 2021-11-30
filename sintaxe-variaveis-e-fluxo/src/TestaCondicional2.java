
public class TestaCondicional2 {

	public static void main(String[] args) {

		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas > 2; //devolve true ou false

		System.out.println("Valor de acompanhado = " + acompanhado);
		if (idade >= 18 || acompanhado) { //expressão booleana pois devolve true ou false
			System.out.println("Seja bem-vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar!");
		}
	}

}
