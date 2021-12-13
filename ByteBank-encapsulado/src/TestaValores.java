
public class TestaValores {
	public static void main(String[] args) {
		// Conta conta = new Conta();
		// esse construtor padrao sem parametros para de
		// funcionar assim que um contrutor é escrito. 
		
		/*
		 * O new Conta() executa uma rotina padrão que quando não é escrita
		 * explicitamente, vem por padrao zero para objetos e null para atributos do
		 * tipo referencia. Assim, mesmo adicionando nos metodos uma regra que numero e
		 * agencia não podem ser zero, por padrao, o objeto conta "já nasce" assim. ou
		 * seja, já estão em um estado inconsistente com relação à regra de negócio. (Se
		 * imprimir conta.getAgencia() o resultado é zero por padrao.) Existe uma forma
		 * de restringirmos dados: toda a vez que criamos um objeto somos obrigados a
		 * passar informações específicas, fazemos isso através de um construtor.
		 */
		
		Conta conta = new Conta(1137,24226);
		//Construtor criado com parametros aceita compilação. 
		System.out.println(conta.getAgencia());
		
		
		//Para saber o total de contas criadas, perguntar para classe Conta.
		System.out.println("O total de contas é: " + Conta.getTotal());
		
		
		
		
		
	}
}
