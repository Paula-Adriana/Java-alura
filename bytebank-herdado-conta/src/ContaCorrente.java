
//new ContaCorrente()
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	/*
	 * O super significa que subimos na hierarquia, para chamar um método ou
	 * atributo da classe mãe. Mas existe um construtor padrão na classe mãe, neste
	 * caso? não, porque criamos um construtor específico. (Conta agencia,numero) Ou
	 * seja, podemos utilizar o super para chamar um construtor específico, passando
	 * os parâmetros específicos para ele. O construtor implícito, aquele criado
	 * pelo Java (e corresponde ao construtor padrão), não está definido na classe
	 * Conta (public Conta() {
	 * 
	 * }). Passando os parâmetros do construtor específico, para que possamos
	 * chamá-lo. Assim, é possível reaproveitá-lo ainda que não seja herdado
	 * automaticamente
	 */

	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	/*
	 * Na classe mãe, Conta, já temos um método saca(), iremos redefinir o
	 * comportamento deste método, na classe ContaCorrente.
	 * 
	 * Como o Eclipse sabe que estamos estendendo a classe Conta, ao escrevermos
	 * saca e utilizarmos o atalho "Ctrl + Espaço", ele nos dá a opção de
	 * sobrescrever, ou reescrever, o método, isso é expressado pela palavra
	 * override.
	 */
}