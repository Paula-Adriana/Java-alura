
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
 * se chama composi��o; O relacionamento de composi��o difere do relacionamento
 * de heran�a, naquele, h� uma interdepend�ncia onde a exist�ncia de um depende
 * da do outro, j� na composi��o, cada classe existe independentemente.

 */