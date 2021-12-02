package exercicios;

import java.util.Scanner;

/*Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários,
 *e devolvendo a média salarial.*/
public class TestaSalario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		double salario1, salario2, salario3, salario4, mediaSalarial;
		
		System.out.print("Digite o primeiro salario: ");
		salario1 = entrada.nextDouble();
		
		System.out.print("Digite o primeiro salario: ");
		salario2 = entrada.nextDouble();
		
		System.out.print("Digite o primeiro salario: ");
		salario3 = entrada.nextDouble();
		
		System.out.print("Digite o primeiro salario: ");
		salario4 = entrada.nextDouble();
		
		mediaSalarial = (salario1 + salario2 + salario3 + salario4) / 4;
		System.out.printf("A média salarial da empresa é: %.2f", mediaSalarial);
		
		
		
		entrada.close();
		
		

	}

}
