
public class TestaConexao {

	public static void main(String[] args) {
		// Código simplificado============

		try (Conexao con = new Conexao()) {
			con.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		}
		// Não precisamos mais escrever explicitamente o bloco finally, pois o novo try
		// já nos garante que o recurso que está sendo aberto dessa forma será fechado
		// automaticamente, desde que ele implemente a interface AutoCloseable.

		// A IllegalArgumentException e IllegalStateException são duas exceções
		// importantes, que o desenvolvedor Java deve usar. Em geral, quando faz
		// sentido, use uma exceção padrão em vez de criar uma própria.

		// ====Código anterior=======
		/*
		 * Conexao con = null; try { con = new Conexao(); con.leDados(); // con.fecha();
		 * } catch (IllegalStateException e) {
		 * System.out.println("Deu erro na conexão"); // con.fecha(); } finally {
		 * System.out.println("finally"); if (con != null) { con.close(); // metodo
		 * close } con.fecha(); }
		 */
	}

}
/*
 * finally é um bloco opcional que podemos colocar no final e que sempre será
 * executado, com ou sem erro. Dessa forma, não será mais necessário repetir o
 * código (con.fecha();) para fechar a conexão. Um try sozinho nunca é válido.
 * Ele exige pelo menos um catch ou um finally!
 */
/*
 * Quando trabalhamos com recursos de abrir conexões com servidores, é
 * importante se preocupar com o fechamento desse recurso, ou seja, o recurso
 * que você abre, você deve fechar! Se não tratarmos bem esse recurso do sistema
 * operacional, todo o sistema pode ser afetado.
 * 
 * Esse é um conceito muito importante: Se abrimos uma conexão com o banco de
 * dados, temos que fechá-la.
 */
