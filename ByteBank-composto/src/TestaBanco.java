
public class TestaBanco {
	public static void main(String[] args) {
		
		Cliente paula = new Cliente(); //Criei um cliente chamado paula
		paula.nome = "Paula Costa"; //popular este objeto, criando seus atributos.
		paula.cpf = "222.222.222-22";
		paula.profissao = "Programadora";
		
		Conta contaDaPaula = new Conta(); //Criei uma conta chamada contaDaPaula
		contaDaPaula.deposita(100);
		
		//Associa o cliente com a conta
		contaDaPaula.titular = paula; //Composição! 
		System.out.println(contaDaPaula.titular.nome);
		//Paula Costa
		
		System.out.println(contaDaPaula.titular);
		//Cliente@3ac42916 - possui o mesmo valor, afinal, trata-se da referência para um mesmo objeto.
			
		System.out.println(paula);
		//Cliente@3ac42916 - possui o mesmo valor, afinal, trata-se da referência para um mesmo objeto.
	}
}
