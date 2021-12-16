
public class TesteFuncionario {

	public static void main(String[] args) {

		// Funcionario paula = new Funcionario();
		//Não posso criar (new - algo concreto) um funcionario pois funcionario é um conceito.
		//Classes abstratas NAO PODEM instanciar objetos.
		
		Gerente paula = new Gerente();
		paula.setNome("Paula");
		paula.setCpf("025632541-56");
		paula.setSalario(2500.0);
		
		System.out.println(paula.getBonificacao());
		System.out.println(paula.getNome());

	}
}
