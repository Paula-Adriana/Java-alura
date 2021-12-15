

import java.util.Scanner;
import java.lang.Math;

/* Escreva um programa para determinar a quantidade de cavalos necessários para se levantar uma massa de m quilogramas a uma
 * altura de h metros em t segundos. Considere cavalos = (m * h / t) / 745,6999*/
public class Cavalos {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		double cavalos, massa, altura, segundos;
		
		System.out.print("Digite a massa em quilogramas: ");
		massa = entrada.nextDouble();
		
		System.out.print("Digite a altura em metros: ");
		altura = entrada.nextDouble();
		
		System.out.print("Digite o tempo em segundos: ");
		segundos = entrada.nextDouble();
		
		cavalos = (massa * altura * segundos) / 745.6999;
		cavalos = (Math.round(cavalos));
		System.out.println("A quantidade de cavalos necessária é: " + cavalos);
		
		entrada.close();
	}
}
