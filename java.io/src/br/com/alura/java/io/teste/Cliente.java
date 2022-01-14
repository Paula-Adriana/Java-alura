package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente no bytebank
 * 
 * @author Paula
 * @version 0.1
 *
 */
public class Cliente implements Serializable {
	/*
	 * Ao implementarmos Serializable, admitimos que estes objetos podem ser
	 * transformados em um fluxo de bits e bytes. Portanto, devemos refletir isso no
	 * atributo estático do serialVersionUID, e administra-lo.
	 */
	private static final long serialVersionUID = 9205117266306915548L;
	/*
	 * Foi adicionado um atributo estático, do tipo long, que é um valor inteiro
	 * grande. É uma identificação da própria Classe, já que não faz parte do
	 * objeto.
	 */
	private String nome;
	private String cpf;
	private String profissao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
