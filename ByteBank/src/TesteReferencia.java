
public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		/* A princ�pio, podemos pensar que esta declara��o gera uma c�pia da primeiraConta para a segundaConta e ter�amos
		 * uma esp�cie de "clone de objeto".
		   Lembrem-se = o Java copia o que est� na direita e cola na esquerda.
		   A quest�o � que n�o h� um objeto Conta � direita, e sim uma refer�ncia. O que copiamos � a refer�ncia
		   para um mesmo objeto.
		   O que temos s�o duas refer�ncias para o mesmo objeto. � como se duas cartas fossem endere�adas ao mesmo local.
		   Embora sejam cartas diferentes, possuem o mesmo destino.*/
		
		if (primeiraConta == segundaConta) { //== compara referencia e n�o objeto!
			System.out.println("s�o a mesm�ssima coisa");
		}
		
		System.out.println(primeiraConta); 
		System.out.println(segundaConta);
		/*resultado: Conta@3ac42916
		Conta: referencia a um objeto do tipo conta e que este objeto est� dentro de uma "gaveta de mem�ria"
		identificada por essa sequ�ncia num�rica. Mesmo endere�o, mesma referencia para o UM mesmo objeto*/
	}
}
