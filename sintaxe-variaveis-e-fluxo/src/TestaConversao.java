
public class TestaConversao {

	public static void main(String[] args) {
		
		double salario = 1270.50;
		int valor = (int) salario; //() cast
		System.out.println(valor);
		
		float pontoFlutuante = 3.14f;
		// para o Java, 3.14 é um double. Usar f ou fazer o casting, colocando (float) na frente de 3.14
		//double = 64bits | float = 32 bits.
		
		//inteiros primitivos
		long numeroGrande = 25369854785l; // > que isso usar bibliotecas/objetos
		short numeroPequeno = 2131;
		byte b = 127;
		
		
		double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
        // seria 0.3, mas obtemos um número completamente diferente. Devido essa inconsistência, double não seria a melhor
        // escolha para guardarmos salário.
		
		

	}

}
