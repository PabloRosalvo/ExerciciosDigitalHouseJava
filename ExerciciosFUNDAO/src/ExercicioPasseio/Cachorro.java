package ExercicioPasseio;

public class Cachorro extends Animal {

	String nome;
	String raca;
	String sexo;
	int idade;

	@Override
	public void gritar() {
		super.gritar();
		System.out.println("au au au");
	}
}
