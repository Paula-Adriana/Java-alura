
public class AutenticacaoUtil {
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;

	}

	public boolean autentica(int senha) {

		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}

	}
}
/*
 * As classes Cliente, Administrador e Gerente utilizam a classe AutenticacaoUtil, esse relacionamento
 * se chama composição; O relacionamento de composição difere do relacionamento
 * de herança, naquele, há uma interdependência onde a existência de um depende
 * da do outro, já na composição, cada classe existe independentemente.

 */