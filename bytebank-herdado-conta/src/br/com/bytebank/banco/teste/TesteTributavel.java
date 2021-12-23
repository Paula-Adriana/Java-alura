package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(2222, 333);
		cc.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		System.out.println(calc.getTotalImposto());
		//resultado 43 ( 42 do seguro de vida e 1 real do 0.01 * o saldo depositado que foi de 100). 

	}

}
