package exercicios;

import java.util.Scanner;

/* Fa�a um algoritmo para ler um n�mero que � um c�digo de usu�rio. Caso este c�digo seja diferente de um c�digo armazenado
 * internamente no algoritmo (igual a 1234) deve ser apresentada a mensagem �Usu�rio inv�lido!�. Caso o C�digo seja correto,
 * deve ser lido outro valor que � a senha. Se esta senha estiver incorreta (a certa � 9999) deve ser mostrada a mensagem
 * �senha incorreta�. Caso a senha esteja correta, deve ser mostrada a mensagem �Acesso permitido�*/
public class CodigoUsuario {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigoUsuario, codigoInterno = 1234, senha, senhaCorreta = 9999;
		
		System.out.print("Digite seu c�digo de usu�rio: ");
		codigoUsuario = entrada.nextInt();
		if (codigoUsuario != codigoInterno) {
			System.out.println("Usu�rio Inv�lido!");
		} else {
			System.out.println("Digite sua senha: ");
		}
		
		senha = entrada.nextInt();
		if (senha != senhaCorreta) {
			System.out.println("Senha Incorreta");
		} else {
			System.out.println("Acesso Permitido!");
		}
		
		
		entrada.close();
		
	}
}
