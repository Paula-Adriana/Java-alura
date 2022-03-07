package br.com.java8.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		//API de datas é imutavel
		//classe que representa uma data: LocalDate
		LocalDate hoje = LocalDate.now();
		System.out.println("Hoje é: " + hoje);
		
		//Diferenças de datas
		LocalDate olimpiadasRio = LocalDate.of(2030, Month.JUNE, 25);
		Period periodo = Period.between(hoje, olimpiadasRio);
		System.out.println("Faltam " + periodo.getYears() + " anos para as olimpiadas");
		
		//proximas datas de um evento
		//pela imutabilidade guardar em outra variavel. local date devolve local date
		LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		System.out.println("As proximas olimpiadas serão em: " + proximasOlimpiadas);
		
		//formatador de datas
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = proximasOlimpiadas.format(formatador);
		System.out.println("Data formatada" + dataFormatada);
		
		//Com horas
		DateTimeFormatter formatadorComHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHora));
	
	}
}
