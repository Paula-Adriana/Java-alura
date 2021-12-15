
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
			g1.setNome("Maria");
			g1.setCpf("1245879564-22");
			g1.setSalario(3000);
			
			g1.setSenha(2222);
			boolean autenticou = g1.autentica(2222);
			System.out.println(autenticou);
			
			System.out.println(g1.getBonificacao());
		
			
	}

}
