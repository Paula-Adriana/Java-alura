
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337,24226);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		/*Estando privado eu não posso mais fazer conta.numero e sim invocar o método. */
		
		Cliente paula = new Cliente();
		paula.setNome("Paula");
		conta.setTitular(paula);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programadora");
		System.out.println(conta.getTitular().getProfissao());
		
		System.out.println(paula); //Cliente@3ac42916
		System.out.println(conta.getTitular()); //Cliente@3ac42916
		
	}
}
