package EscolaDensenvolver;

import Collections.Aluno;

import java.util.List;
import java.util.Scanner;

public class Alunos {

    Scanner input = new Scanner(System.in);

    public Disciplinas Android;
    public String nome;
    public int idade;

    public Alunos(String nome, int idade, Disciplinas materia) {
        this.nome = nome;
        this.idade = idade;
        this.Android = materia;

    }


    public int getIdade() {

        return idade;
    }

    public void setIdade() {

        this.idade = idade;
        System.out.println(" Digite a idade do aluno : ");
        idade = input.nextInt();
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        System.out.println(" Digite a nome do aluno : ");
        nome = input.next();
        this.nome = nome;
    }

    public static void imprimirAlunos(List<Alunos> aluno) {
        for (Alunos a : aluno) {
            System.out.println("Nome: " + a.getNome());
        }
    }

    }

