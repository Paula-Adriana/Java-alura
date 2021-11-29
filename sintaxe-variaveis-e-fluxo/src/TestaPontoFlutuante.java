
public class TestaPontoFlutuante {
		
	public static void main(String[] args) {
		
		double salario = 1250.70, idade = 37; 
		System.out.println("Meu salario é " + salario);
		//inteiro cabe em double o contrário não é verdadeiro
		// Esta propriedade se dá porque o Java faz conversão implícita de um tipo menor para os tipos "maiores".
		// De inteiro para double, por exemplo. O contrário não é verdade por que existe perda de dados quando é feita a
		// conversão. Acarretando em um "type mismatch" mostrando que esta instrução é de tipos incompatíveis.
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2; //resultado de inteiro será sempre inteiro
		System.out.println(outraDivisao);
		
		double novaTentativa = 5.0 / 2;
		System.out.println(novaTentativa);
		
		// Para fazer uma conversão onde pode haver perda de informações é necessário fazer um type casting. 
		// int idade = (int) 30.0;
		// está explícito que será feito o cast de double para inteiro
		
	}

}
