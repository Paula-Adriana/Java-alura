
public class TestaCaracteres {

	public static void main(String[] args) {
		
		char letra = 'A';
		System.out.println(letra);
		//char cabe em um inteiro, o contr�rio n�o � verdade. 
		
		char valor = 66;
		System.out.println(valor);
		//obteremos B. Isto ocorre pois na tabela Unicode o 66 refere-se a b
		
		/*	valor = valor + 1;
			System.out.println(valor);
			
		H� um erro de compila��o em valor + 1, por conta da regra do Java quando se trabalha com dois tipos distintos
		 em uma mesma opera��o, de dar o resultado no maior deles. Neste caso, o valor � do tipo char, e 1 � um int, que 
		 � maior. O resultado desta opera��o, portanto, ser� dado em int. No entanto, um inteiro cabe em um char? N�o!
		 Por�m, novamente, o inverso � poss�vel. Se queremos que isto seja v�lido, devemos informar que a resposta disso
		 passar� pelo casting, moldando-se para o char:
		 
			valor = (char) (valor + 1);
			System.out.println(valor); */
		
		String palavra = "alura cursos online";
		System.out.println(palavra);
		
		palavra = palavra + " " + 2020;
		System.out.println(palavra);
	}

}
