
public class ControleBonificacao {
	private double soma;

	public void registra(Funcionario f) { // metodo generico que calcula bonificacao chamando o metodo especifico
											// getBonificacao quando necessario.
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}

	public double getSoma() {
		return soma;

	}

}
