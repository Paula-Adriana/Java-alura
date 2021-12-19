
public class Cliente implements Autenticavel {
//Quando vc "assina" um contrato voce -implementa- e n�o mais usa extends.
//Toda a l�gica da autenticacao fica somente 
	private AutenticacaoUtil autenticador;

	/*
	 * Para resolvermos o problema dos metodos, teremos um atributo AtenticacaoUtile
	 * criaremos um construtor padr�o para, dentro dele, termos uma inst�ncia da
	 * AutenticacaoUtil
	 */
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {// manter somente a assinatura do m�todo pois a classe cliente � obrigada a
										// implementar os metodos da interface. O metodo delega a chamada. 
		this.autenticador.setSenha(senha);

	}
	/*
	 * Assim, quando o Cliente chamar a senha, quem guardar� esta informa��o n�o
	 * ser� diretamente a pr�pria classe, e sim a AutenticacaoUtil. No autenticador,
	 * chamaremos o util, desta forma, utilizamos o seu setSenha. Isso significa que
	 * delegamos a chamada - o m�todo n�o foi embora, mas a implementa��o, que era
	 * concreta, agora foi delegada:
	 */

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
