package enuns;

public enum Prioridade {
	MIN(1), NORMAL(5), MAX(10);// São como instancias da classe prioridade

//Voce pode atribuir valores aos objetos Enum com um construtor
	private int valor;
	
	Prioridade(int valor) {
		this.valor = valor;
	}
	//Outros construtores também podem ser construídos
	public int getValor() {
		return this.valor;
	}
}