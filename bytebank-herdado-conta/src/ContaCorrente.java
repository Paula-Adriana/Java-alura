
//new ContaCorrente()
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	/*
	 * O super significa que subimos na hierarquia, para chamar um m�todo ou
	 * atributo da classe m�e. Mas existe um construtor padr�o na classe m�e, neste
	 * caso? n�o, porque criamos um construtor espec�fico. (Conta agencia,numero) Ou
	 * seja, podemos utilizar o super para chamar um construtor espec�fico, passando
	 * os par�metros espec�ficos para ele. O construtor impl�cito, aquele criado
	 * pelo Java (e corresponde ao construtor padr�o), n�o est� definido na classe
	 * Conta (public Conta() {
	 * 
	 * }). Passando os par�metros do construtor espec�fico, para que possamos
	 * cham�-lo. Assim, � poss�vel reaproveit�-lo ainda que n�o seja herdado
	 * automaticamente
	 */

	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	/*
	 * Na classe m�e, Conta, j� temos um m�todo saca(), iremos redefinir o
	 * comportamento deste m�todo, na classe ContaCorrente.
	 * 
	 * Como o Eclipse sabe que estamos estendendo a classe Conta, ao escrevermos
	 * saca e utilizarmos o atalho "Ctrl + Espa�o", ele nos d� a op��o de
	 * sobrescrever, ou reescrever, o m�todo, isso � expressado pela palavra
	 * override.
	 */
}