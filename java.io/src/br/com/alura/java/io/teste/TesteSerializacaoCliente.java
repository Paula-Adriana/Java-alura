package br.com.alura.java.io.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * Nosso objetivo a partir de agora será fazer o mesmo processo de serialização,
		 * contudo, utilizando uma classe criada pelo próprio programador, ou seja, nós
		 * mesmos. Para isso, implementar a interface Serializable na classe cliente. (a
		 * classe String "assina o contrato" automaticamente enão precisa disso)
		 * interface Serializable não possui nenhum método. Por isso, é chamada de
		 * interface de marcação, ela só marca os objetos, sem definir um
		 * "contrato formal"..
		 */

		Cliente cliente = new Cliente();
		cliente.setNome("Paula");
		cliente.setProfissao("dev");
		cliente.setCpf("1245896584");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();

		// ======================================================================================

//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//		Cliente cliente = (Cliente) ois.readObject();
//		ois.close();
//		System.out.println(cliente.getNome());

	}

}
