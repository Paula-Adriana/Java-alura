
public class TestaValores {

	public static void main(String[] args) {
		
		int primeiro = 5, segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		System.out.println(segundo);
		// vari�vel guarda um valor, e n�o uma refer�ncia! O 'primeiro = 10' n�o surte efeito para 'segundo'. 

	}

}
