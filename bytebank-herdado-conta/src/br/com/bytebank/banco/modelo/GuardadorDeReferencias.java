package br.com.bytebank.banco.modelo;

//classe que esconde o acesso ao array, utilizando-o internamente, e as demais classes a utilizarão
public class GuardadorDeReferencias {
	// Código omitido

	private Object[] referencias;
	private int posicaoLivre;

	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}

	public void adiciona(Object ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}

}