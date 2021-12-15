

import java.util.Scanner;

/* Escrever um programa que armazene um horário (hora, minuto e segundo) em variáveis, depois, determine e exiba
 * a quantidade de segundos que se passaram desde as 0h00min0s e a quantidade de segundos que
 * faltam para a meia-noite.*/
public class Segundos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int hora, minuto, segundo, passado, futuro;
		
		System.out.print("Digite a hora: ");
		hora = entrada.nextInt();
		
		System.out.print("Digite o minuto: ");
		minuto = entrada.nextInt();
		
		System.out.print("Digite o segundo: ");
		segundo = entrada.nextInt();
		
		passado = ((hora*3600) + (minuto*60) + segundo);
		futuro = 86400 - passado;
		System.out.println("Se passaram " + passado + " segundos desde o início do dia");
		System.out.println("Faltam " + futuro + " segundos para terminar o dia");
			
		
		
		
		
		entrada.close();
	}

}