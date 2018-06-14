package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TesteListArrayList {

	public static void main(String[] args) {

	    // Criação dos meus objetos Alunos

		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("José");
		Aluno a4 = new Aluno("Pedro");

        /*
         * -----------------------
         * Criação de Arraylist de Objetos de Alunos
         * ------------------------
         **/
		
		List<Aluno> alunos = new ArrayList<Aluno>();

		// Add elementos no ArrayList
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a4);
		
		imprimirAlunos(alunos);

		/*
		 * -----------------------
		 * Criação de Arraylist de String
		 * ------------------------
		 **/

		List<String> obj = new ArrayList<String>();

		/*Add elementos de string no nosso arraylist*/
		obj.add("Ajeet");
		obj.add("Harry");
		obj.add("Chaitanya");
		obj.add("Steve");
		obj.add("Anuj");

		/* mostrando elementos */
		System.out.println("Elementos Atuais no Array: "+obj);

		/* Add elementos colocando elemento especifico*/
		obj.add(0, "Rahul");
		obj.add(1, "Justin");

		/* Removendo elementos */
		obj.remove("Chaitanya");
		obj.remove("Harry");

        /* Removendo Elementos com index*/
        obj.remove(1);

        /* mostrando elementos */
		System.out.println("Meu array Agora:"+obj);

		imprimirString(obj);
	}
	
	public static void imprimirAlunos(List<Aluno> alunos) {
		for (Aluno a : alunos) {
			System.out.println("Nome: " + a.getNome());
		}
	}


	public static void imprimirString(List<String> list) {
		for (String object: list) {
			System.out.println(object);
		}
	}
}
