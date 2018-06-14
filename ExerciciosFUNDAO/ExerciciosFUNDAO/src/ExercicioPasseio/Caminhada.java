package ExercicioPasseio;

public class Caminhada {

	public void andar(Pessoa pessoa) {
		System.out.println("Eu  " + pessoa.nome + " " + " estou andando com o  " + pessoa.cachorro.nome + " ");

		// COM ASPAS <3
		System.out.println("Eu \"" + pessoa.nome + "\"" + " estou andando com o \"" + pessoa.cachorro.nome + "\"");
	}
}
