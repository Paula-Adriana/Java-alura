
public class TestaContaComExcecaoChecked {
	public static void main(String[] args) {
		Conta c = new Conta();
		try {
			c.deposita();
		} catch (MinhaExcecao ex) {
			System.out.println("Tratamento...");

		}
		/*
		 * A pol�mica das exce��es est� relacionada ao Checked. Hoje, existem aplica��es
		 * que simplesmente n�o usam exce��es desse tipo, e � muito comum utilizar
		 * bibliotecas que s� t�m exce��es Unchecked, nas quais o compilador n�o nos
		 * obriga a tomar alguma atitude.
		 */
	}
}
