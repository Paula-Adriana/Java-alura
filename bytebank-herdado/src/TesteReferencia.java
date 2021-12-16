
public class TesteReferencia {

	public static void main(String[] args) {

		/*
		 * Gerente g1 = new Gerente(); ou: Funcionario g1 = new Gerente() tbm
		 * funcionaria; Lado esquerdo (func) refer�ncia mais generica do outro lado ref
		 * mais especifica. Gerente � um func. No entanto, Mas para que serve, ent�o,
		 * colocar uma refer�ncia mais gen�rica?
		 * 
		 * A refer�ncia g1 �, portanto, do tipo Funcionario. Agora, queremos chamar, por
		 * exemplo, g1.Autentica(2222) e passar uma senha:
		 */

		/*
		 * ================================== public class TesteReferencias {
		 * 
		 * public static void main(String[] args) {
		 * 
		 * Funcionario g1 = new Gerente(); g1.setNome("Marcos"); String nome =
		 * g1.getNome();
		 * 
		 * g1.autentica(2222);
		 * 
		 * System.out.println(nome); =================================== O compilador
		 * indica que isso n�o funciona, mas por qu�? Se criamos um objeto do tipo
		 * Gerente? Isso n�o importa para o compilador. O que ele faz � analisar o tipo
		 * da refer�ncia, ou seja, g1 - que � do tipo Funcionario. Como esta classe n�o
		 * tem o m�todo autentica, o compilador indica a presen�a de um erro.
		 * 
		 * Qual � ent�o a vantagem em termos esta refer�ncia mais gen�rica? Ela n�o est�
		 * clara neste c�digo, e por isso veremos um outro c�digo nas pr�ximas aulas.
		 * 
		 * Como podemos ver, o new Gerente() causa a cria��o de um objeto do tipo
		 * Gerente. Uma vez criado, o objeto sempre ter� o mesmo tipo - digamos que na
		 * vida real, um gerente possa ser promovido, aqui, n�o h� essa possibilidade,
		 * um objeto sempre manter� seu tipo.
		 * 
		 * O que pode variar, � o tipo da refer�ncia, aquilo que est� localizado �
		 * esquerda do nome do objeto, no caso � Funcionario, mas como vimos, poder�amos
		 * ter definido como Gerente tamb�m, sem problemas.
		 * 
		 * A isso, damos o nome de POLIMORFISMO. Temos um mesmo objeto, do tipo Gerente,
		 * mas h� duas formas poss�veis de chegarmos a este objeto, dois tipos
		 * diferentes de refer�ncia.
		 */
		Funcionario g1 = new Gerente(); // ref generica. gerente � um funcionario! O metodo registra aceita funcionarios
		g1.setNome("Paula");
		g1.setSalario(5000.0);
		
		Funcionario ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Funcionario d = new Designer();
		d.setSalario(2000);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		// Chamando o m�todo de bonificacao do Gerente
		// Chamando o m�todo de bonificacao do EV
		//Chamando o m�todo de bonifica��o do Designer
		/*
		 * As tres mensagens foram impressas, o que significa que, para um destes tipos
		 * de Funcionario foi utilizado o m�todo getBonificacao() espec�fico de sua
		 * respectiva classe. Ao executarmos o c�digo, sempre ser� chamado o m�todo
		 * espec�fico, � esta a real vantagem do polimorfismo.
		
		 */

	}

}
