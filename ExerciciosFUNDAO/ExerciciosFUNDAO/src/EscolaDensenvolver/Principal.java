package EscolaDensenvolver;


import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Disciplinas objetoMateria = new Disciplinas();
        Alunos victor = new Alunos("victor",27, objetoMateria);
        victor.Android.setNota(4.0);
        victor.Android.setNome("Matematica");
        System.out.println( victor.Android.getNome() + victor.Android.getNota());



        List <Alunos> aluno = new ArrayList<>();


        aluno.add(victor);

        Alunos.imprimirAlunos(aluno);


    }
}

