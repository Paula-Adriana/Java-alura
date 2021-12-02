package exercicios;

import java.util.Scanner;

/* Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja diferente de um código armazenado
 * internamente no algoritmo (igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’. Caso o Código seja correto,
 * deve ser lido outro valor que é a senha. Se esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem
 * ‘senha incorreta’. Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’*/
public class CodigoUsuario {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigoUsuario, codigoInterno = 1234, senha, senhaCorreta = 9999;
		
		System.out.print("Digite seu código de usuário: ");
		codigoUsuario = entrada.nextInt();
		if (codigoUsuario != codigoInterno) {
			System.out.println("Usuário Inválido!");
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
