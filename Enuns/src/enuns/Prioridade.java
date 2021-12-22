package enuns;

public enum Prioridade {
	MIN(1), NORMAL(5), MAX(10);// S�o como instancias da classe prioridade

//Voce pode atribuir valores aos objetos Enum com um construtor
	private int valor;
	
	Prioridade(int valor) {
		this.valor = valor;
	}
	//Outros construtores tamb�m podem ser constru�dos
	public int getValor() {
		return this.valor;
	}
}