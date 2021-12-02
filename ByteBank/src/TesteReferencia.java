
public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		/* A princípio, podemos pensar que esta declaração gera uma cópia da primeiraConta para a segundaConta e teríamos
		 * uma espécie de "clone de objeto".
		   Lembrem-se = o Java copia o que está na direita e cola na esquerda.
		   A questão é que não há um objeto Conta à direita, e sim uma referência. O que copiamos é a referência
		   para um mesmo objeto.
		   O que temos são duas referências para o mesmo objeto. É como se duas cartas fossem endereçadas ao mesmo local.
		   Embora sejam cartas diferentes, possuem o mesmo destino.*/
		
		if (primeiraConta == segundaConta) { //== compara referencia e não objeto!
			System.out.println("são a mesmíssima coisa");
		}
		
		System.out.println(primeiraConta); 
		System.out.println(segundaConta);
		/*resultado: Conta@3ac42916
		Conta: referencia a um objeto do tipo conta e que este objeto está dentro de uma "gaveta de memória"
		identificada por essa sequência numérica. Mesmo endereço, mesma referencia para o UM mesmo objeto*/
	}
}
