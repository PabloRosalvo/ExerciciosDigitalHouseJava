package Collections;

public class Aluno {

	private String nome;
	private int idade;
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/*
	  Dica!!!
	  get e set nada mais são que métodos, que freqüentemente vemos em classes de Java.
	  Eles servem para pegarmos informações  de variáveis da classe que são definidas como 'private',
	  porém esses método são definidos como 'public'.

	  Daí surge uma pergunta natural: por que criar métodos para acessar variáveis, se
	  podemos acessar elas diretamente?
	  Simples: questão de segurança.

	  As variáveis 'private' só podem ser acessadas de dentro da Classe. É como se elas fossem
	  invisíveis foram do escopo da classe/objeto. Assim, evitamos que outros métodos, classes ou hackers
	  tenham acesso aos dados de determinada classe.
	 */
}
