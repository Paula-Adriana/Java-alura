
public class TestaPontoFlutuante {
		
	public static void main(String[] args) {
		
		double salario = 1250.70, idade = 37; 
		System.out.println("Meu salario � " + salario);
		//inteiro cabe em double o contr�rio n�o � verdadeiro
		// Esta propriedade se d� porque o Java faz convers�o impl�cita de um tipo menor para os tipos "maiores".
		// De inteiro para double, por exemplo. O contr�rio n�o � verdade por que existe perda de dados quando � feita a
		// convers�o. Acarretando em um "type mismatch" mostrando que esta instru��o � de tipos incompat�veis.
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2; //resultado de inteiro ser� sempre inteiro
		System.out.println(outraDivisao);
		
		double novaTentativa = 5.0 / 2;
		System.out.println(novaTentativa);
		
		// Para fazer uma convers�o onde pode haver perda de informa��es � necess�rio fazer um type casting. 
		// int idade = (int) 30.0;
		// est� expl�cito que ser� feito o cast de double para inteiro
		
	}

}
