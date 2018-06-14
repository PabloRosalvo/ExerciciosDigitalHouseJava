package Collections;

import java.util.HashSet;
import java.util.Set;

public class TesteSetHashSet {

	public static void main(String[] args) {

		// Criação dos meus objetos Alunos

		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("José");
		Aluno a4 = new Aluno("Pedro");
		Aluno a5 = new Aluno("Pedro");

		/*
		 * -----------------------
		 * Criação de HashSet de Objetos de Alunos
		 * ------------------------
		 **/

		Set<Aluno> alunos = new HashSet<Aluno>();

		// Add elementos no ArrayList
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a4);
		alunos.add(a5);
		
		imprimirAlunos(alunos);

		// ----------------------------------------------

		// declaração de HashSet de string
		Set<String> hset = new HashSet<String>();

		// add elementos no hashset
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");

		// adicionando elementos iguais
		hset.add("Apple");
		hset.add("Mango");

		// adicionando elemento nullo
		hset.add(null);
		hset.add(null);

		// mostrando elemento de hash
		System.out.println(hset);
		imprimirString(hset);
	}
	
	public static void imprimirAlunos(Set<Aluno> alunos) {
		for (Aluno a : alunos) {
			System.out.println("Nome: " + a.getNome());
		}
	}

	public static void imprimirString(Set<String> hset) {
		for (String s : hset) {
			System.out.println(s);
		}
	}
}
