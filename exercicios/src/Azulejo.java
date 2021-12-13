package exercicios;

import java.util.Scanner;

/* Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) precisa ser
 * coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do
 * azulejo). Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima quantos azulejos com as 
 * medidas dadas são necessários para cobrir a parede dada.**/
public class Azulejo {

	public static void main(String[] args) {
		double alturaParede, larguraParede, alturaAzulejo, larguraAzulejo, totalAzulejos;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a altura da parede: ");
		alturaParede = entrada.nextDouble();
		
		System.out.print("Digite a largura da parede: ");
		larguraParede = entrada.nextDouble();
		
		System.out.print("Digite a altura do azulejo: ");
		alturaAzulejo = entrada.nextDouble();
		
		System.out.print("Digite a largura do azulejo: ");
		larguraAzulejo = entrada.nextDouble();
		
		
		totalAzulejos = (alturaParede * larguraParede) / (alturaAzulejo * larguraAzulejo);
		System.out.printf("Você precisará de %.2f azulejos.", totalAzulejos);
		
		entrada.close();

	}

}
