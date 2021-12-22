
public class TestaContaComExcecaoChecked {
	public static void main(String[] args) {
		Conta c = new Conta();
		try {
			c.deposita();
		} catch (MinhaExcecao ex) {
			System.out.println("Tratamento...");

		}
		/*
		 * A polêmica das exceções está relacionada ao Checked. Hoje, existem aplicações
		 * que simplesmente não usam exceções desse tipo, e é muito comum utilizar
		 * bibliotecas que só têm exceções Unchecked, nas quais o compilador não nos
		 * obriga a tomar alguma atitude.
		 */
	}
}
