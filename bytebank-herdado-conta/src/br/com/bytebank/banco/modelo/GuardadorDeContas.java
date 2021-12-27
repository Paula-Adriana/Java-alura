package br.com.bytebank.banco.modelo;

//classe que esconde o acesso ao array, utilizando-o internamente, e as demais classes a utilizarão
public class GuardadorDeContas {
	// Código omitido

	private Conta[] referencias;
	private int posicaoLivre;

	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}

	public void adiciona(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}

}