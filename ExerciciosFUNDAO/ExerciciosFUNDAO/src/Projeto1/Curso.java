package Projeto1;

import java.util.List;

public class Curso {

    String nome;
    int codigo;
    public ProfessoAdjunto professoAdjunto;
    public ProfessorTitular professorTitular;
    private int qntMaxAlunos;
    List <Aluno> alunos;

    public Curso(String nome, int codigoCurso, int quantidadeMaximaDeAlunos) {
        this.nome = nome;
        this.codigo = codigoCurso;
        this.qntMaxAlunos = quantidadeMaximaDeAlunos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQntMaxAlunos() {
        return qntMaxAlunos;
    }

    public void setQntMaxAlunos(int qntMaxAlunos) {
        this.qntMaxAlunos = qntMaxAlunos;
    }

    public Boolean adicionarUmAluno(Aluno umAluno) {

        if (alunos.size() <   qntMaxAlunos ){
            alunos.add(umAluno);
            return true;
        }else {
            System.out.println(" Não há vagas.");
            return false;

        }


    }
    public void excluirAluno(Aluno umAluno) {
            alunos.remove(umAluno);

    }

}
