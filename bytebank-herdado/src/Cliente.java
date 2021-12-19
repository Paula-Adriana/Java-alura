
public class Cliente implements Autenticavel {
//Quando vc "assina" um contrato voce -implementa- e não mais usa extends.
//Toda a lógica da autenticacao fica somente 
	private AutenticacaoUtil autenticador;

	/*
	 * Para resolvermos o problema dos metodos, teremos um atributo AtenticacaoUtile
	 * criaremos um construtor padrão para, dentro dele, termos uma instância da
	 * AutenticacaoUtil
	 */
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {// manter somente a assinatura do método pois a classe cliente é obrigada a
										// implementar os metodos da interface. O metodo delega a chamada. 
		this.autenticador.setSenha(senha);

	}
	/*
	 * Assim, quando o Cliente chamar a senha, quem guardará esta informação não
	 * será diretamente a própria classe, e sim a AutenticacaoUtil. No autenticador,
	 * chamaremos o util, desta forma, utilizamos o seu setSenha. Isso significa que
	 * delegamos a chamada - o método não foi embora, mas a implementação, que era
	 * concreta, agora foi delegada:
	 */

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
