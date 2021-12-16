
public class TesteReferencia {

	public static void main(String[] args) {

		/*
		 * Gerente g1 = new Gerente(); ou: Funcionario g1 = new Gerente() tbm
		 * funcionaria; Lado esquerdo (func) referência mais generica do outro lado ref
		 * mais especifica. Gerente é um func. No entanto, Mas para que serve, então,
		 * colocar uma referência mais genérica?
		 * 
		 * A referência g1 é, portanto, do tipo Funcionario. Agora, queremos chamar, por
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
		 * indica que isso não funciona, mas por quê? Se criamos um objeto do tipo
		 * Gerente? Isso não importa para o compilador. O que ele faz é analisar o tipo
		 * da referência, ou seja, g1 - que é do tipo Funcionario. Como esta classe não
		 * tem o método autentica, o compilador indica a presença de um erro.
		 * 
		 * Qual é então a vantagem em termos esta referência mais genérica? Ela não está
		 * clara neste código, e por isso veremos um outro código nas próximas aulas.
		 * 
		 * Como podemos ver, o new Gerente() causa a criação de um objeto do tipo
		 * Gerente. Uma vez criado, o objeto sempre terá o mesmo tipo - digamos que na
		 * vida real, um gerente possa ser promovido, aqui, não há essa possibilidade,
		 * um objeto sempre manterá seu tipo.
		 * 
		 * O que pode variar, é o tipo da referência, aquilo que está localizado à
		 * esquerda do nome do objeto, no caso é Funcionario, mas como vimos, poderíamos
		 * ter definido como Gerente também, sem problemas.
		 * 
		 * A isso, damos o nome de POLIMORFISMO. Temos um mesmo objeto, do tipo Gerente,
		 * mas há duas formas possíveis de chegarmos a este objeto, dois tipos
		 * diferentes de referência.
		 */
		Funcionario g1 = new Gerente(); // ref generica. gerente é um funcionario! O metodo registra aceita funcionarios
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
		
		// Chamando o método de bonificacao do Gerente
		// Chamando o método de bonificacao do EV
		//Chamando o método de bonificação do Designer
		/*
		 * As tres mensagens foram impressas, o que significa que, para um destes tipos
		 * de Funcionario foi utilizado o método getBonificacao() específico de sua
		 * respectiva classe. Ao executarmos o código, sempre será chamado o método
		 * específico, é esta a real vantagem do polimorfismo.
		
		 */

	}

}
