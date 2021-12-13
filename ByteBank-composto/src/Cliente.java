
public class Cliente {
	String nome;
	String cpf;
	String profissao;

}
/*
 * Os atributos referentes ao titular poderiam estar na classe Conta do projeto
 * ByteBank, mas perceba que essas informaçoes nao dizem respeito à conta em si
 * e sim ao seu cliente. Por isso separamos os projetos. Iremos estabelecer uma
 * relação entre Conta e Cliente, ou seja, toda Conta faz uma referência a um
 * Cliente.
 */
