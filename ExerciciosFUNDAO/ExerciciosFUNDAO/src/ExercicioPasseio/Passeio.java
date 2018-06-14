package ExercicioPasseio;

public class Passeio {

	public static void main(String[] args) {
		Pessoa victor = new Pessoa();
		victor.nome = "Victor";

		victor.cachorro = new Cachorro();
		
		victor.cachorro.nome = "Lara";
		victor.cachorro.idade = 3;
		victor.cachorro.raca = "Bulldog Frances";
		victor.cachorro.sexo = "F";

		Caminhada noIbira = new Caminhada();
		noIbira.andar(victor);
	}
}
