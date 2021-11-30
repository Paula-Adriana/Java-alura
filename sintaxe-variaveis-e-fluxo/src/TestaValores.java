
public class TestaValores {

	public static void main(String[] args) {
		
		int primeiro = 5, segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		System.out.println(segundo);
		// variável guarda um valor, e não uma referência! O 'primeiro = 10' não surte efeito para 'segundo'. 

	}

}
