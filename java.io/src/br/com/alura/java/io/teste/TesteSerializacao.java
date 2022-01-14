package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		String nome = "Paula Adriana";

		/*
		 * Objeto -> Bits e Bytes = Serialização!!!!
		 * O construtor precisa receber um OutputStream, que é o
		 * que está no HD, no caso, o FileOutputStream("objeto.bin"). Trata-se de um
		 * arquivo binário. A extensão do arquivo é opcional aqui
		 */

//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));

		/*
		 * o método writeObject(), responsável por receber o objeto e transforma-lo em
		 * um fluxo de bits e bytes, passar para o FileOutputStream, que então grava no
		 * HD
		 */
//		oos.writeObject(nome);
//		oos.close();
		/*
		 * precisamos verificar se um arquivo objeto.bin foi criado, visualizando o
		 * diretório de pastas na lateral esquerda da tela.
		 */
		// ("==================================================");

		// Contrario

		// Bits e Bytes -> Objeto = Desserialização!!!!
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));

		/*
		 * Com o ois chamaremos o método readObject(), e ele lerá o fluxo e nos
		 * retornará uma ClassNotFoundException, já que o objeto pode estar baseado em
		 * uma classe ainda não definida, ou que foi apagada.
		 * 
		 * Teremos portanto um objeto String, que nos retornará também uma String, e
		 * faremos um cast, para especificarmos - uma vez que o readObject(), por
		 * padrão, nos dá o retorno mais genérico possível. Por fim, fecharemos o ois
		 */
		String nome = (String) ois.readObject();
		ois.close();
		System.out.println(nome);

	}

}
