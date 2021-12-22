public class Conexao implements AutoCloseable{

	public Conexao() {
		System.out.println("Abrindo conexao");
		throw new IllegalStateException();
	}

	public void leDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException();
		// Essa � uma exce��o padr�o do mundo Java que j� existe e indica que o
		// objeto utilizado tem um estado inconsistente.
	}

	@Override //da interface closeable
	public void close() {
		System.out.println("Fechando conexao");		
	}
}
