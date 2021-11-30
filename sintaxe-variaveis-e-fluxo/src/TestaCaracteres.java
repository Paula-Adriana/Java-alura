
public class TestaCaracteres {

	public static void main(String[] args) {
		
		char letra = 'A';
		System.out.println(letra);
		//char cabe em um inteiro, o contrário não é verdade. 
		
		char valor = 66;
		System.out.println(valor);
		//obteremos B. Isto ocorre pois na tabela Unicode o 66 refere-se a b
		
		/*	valor = valor + 1;
			System.out.println(valor);
			
		Há um erro de compilação em valor + 1, por conta da regra do Java quando se trabalha com dois tipos distintos
		 em uma mesma operação, de dar o resultado no maior deles. Neste caso, o valor é do tipo char, e 1 é um int, que 
		 é maior. O resultado desta operação, portanto, será dado em int. No entanto, um inteiro cabe em um char? Não!
		 Porém, novamente, o inverso é possível. Se queremos que isto seja válido, devemos informar que a resposta disso
		 passará pelo casting, moldando-se para o char:
		 
			valor = (char) (valor + 1);
			System.out.println(valor); */
		
		String palavra = "alura cursos online";
		System.out.println(palavra);
		
		palavra = palavra + " " + 2020;
		System.out.println(palavra);
	}

}
