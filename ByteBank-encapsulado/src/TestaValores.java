
public class TestaValores {
	public static void main(String[] args) {
		// Conta conta = new Conta();
		// esse construtor padrao sem parametros para de
		// funcionar assim que um contrutor � escrito. 
		
		/*
		 * O new Conta() executa uma rotina padr�o que quando n�o � escrita
		 * explicitamente, vem por padrao zero para objetos e null para atributos do
		 * tipo referencia. Assim, mesmo adicionando nos metodos uma regra que numero e
		 * agencia n�o podem ser zero, por padrao, o objeto conta "j� nasce" assim. ou
		 * seja, j� est�o em um estado inconsistente com rela��o � regra de neg�cio. (Se
		 * imprimir conta.getAgencia() o resultado � zero por padrao.) Existe uma forma
		 * de restringirmos dados: toda a vez que criamos um objeto somos obrigados a
		 * passar informa��es espec�ficas, fazemos isso atrav�s de um construtor.
		 */
		
		Conta conta = new Conta(1137,24226);
		//Construtor criado com parametros aceita compila��o. 
		System.out.println(conta.getAgencia());
		
		
		//Para saber o total de contas criadas, perguntar para classe Conta.
		System.out.println("O total de contas �: " + Conta.getTotal());
		
		
		
		
		
	}
}
