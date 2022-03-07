package br.com.alura.modelo;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}
	
	//============================EQUALS=======================================
	@Override
	public boolean equals(Object obj) {
		// Definição do obj (quem será comparado): outro. Esse "outro" é o que será comparado com o this)
		Aluno outro = (Aluno) obj;

		// Definição da igualdade! será igual quando?
		// Aqui, quando tiver o mesmo nome. (cuidado nos casos em que o nome seja null, definir no construtor)
		return this.nome.equals(outro.nome);
	}
	
	/*
	 * uma implementação sofisticada do método equals pode ser bem trabalhosa, por
	 * essa razão que as IDE's fornecem recursos que implementam esse método para
	 * nós.
	 * No Eclipse você pode pressionar CTRL + 3 e digitar equals. generate....
	 * 
	 * Exemplo de uma implementação sofisticada pelo desenvolvedor: 
	 * @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (numeroMatricula != other.numeroMatricula)
            return false;
        return true;
    }
	 */
	//==========================FIM DO EQUALS=====================================
	
	//==========================HASHCODE=========================================
	@Override
	// Podemos por exemplo pegar o primeiro caractere do nome. Dessa maneira,
	// estaremos dividindo os grupos em grupos de alunos que começam com A, B,
	// C,...;
	// e José José tanto em a1 quanto em josé estarão no grupo J:
	// obs: char é um tipo de int entao todos da letra A por exemplo ficarão no
	// grupo 65 (tabela unicode 65 = a)
	public int hashCode() {
		// return this.nome.charAt(0);
		return this.nome.hashCode();// hashcode da classe string
	}
	
	/*Exemplo de implementação sofisticada do hashcode
	 *@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + numeroMatricula;
        return result;
    } */
	
	
	//==========================FIM DO HASHCODE=========================================
}
