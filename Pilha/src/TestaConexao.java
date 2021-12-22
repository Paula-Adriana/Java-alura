
public class TestaConexao {

	public static void main(String[] args) {
		// C�digo simplificado============

		try (Conexao con = new Conexao()) {
			con.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conex�o");
		}
		// N�o precisamos mais escrever explicitamente o bloco finally, pois o novo try
		// j� nos garante que o recurso que est� sendo aberto dessa forma ser� fechado
		// automaticamente, desde que ele implemente a interface AutoCloseable.

		// A IllegalArgumentException e IllegalStateException s�o duas exce��es
		// importantes, que o desenvolvedor Java deve usar. Em geral, quando faz
		// sentido, use uma exce��o padr�o em vez de criar uma pr�pria.

		// ====C�digo anterior=======
		/*
		 * Conexao con = null; try { con = new Conexao(); con.leDados(); // con.fecha();
		 * } catch (IllegalStateException e) {
		 * System.out.println("Deu erro na conex�o"); // con.fecha(); } finally {
		 * System.out.println("finally"); if (con != null) { con.close(); // metodo
		 * close } con.fecha(); }
		 */
	}

}
/*
 * finally � um bloco opcional que podemos colocar no final e que sempre ser�
 * executado, com ou sem erro. Dessa forma, n�o ser� mais necess�rio repetir o
 * c�digo (con.fecha();) para fechar a conex�o. Um try sozinho nunca � v�lido.
 * Ele exige pelo menos um catch ou um finally!
 */
/*
 * Quando trabalhamos com recursos de abrir conex�es com servidores, �
 * importante se preocupar com o fechamento desse recurso, ou seja, o recurso
 * que voc� abre, voc� deve fechar! Se n�o tratarmos bem esse recurso do sistema
 * operacional, todo o sistema pode ser afetado.
 * 
 * Esse � um conceito muito importante: Se abrimos uma conex�o com o banco de
 * dados, temos que fech�-la.
 */
