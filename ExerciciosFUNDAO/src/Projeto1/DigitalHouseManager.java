package Projeto1;

import javax.xml.crypto.Data;
import java.util.List;

public class DigitalHouseManager {
    List<Aluno> Listaaluno;
    List<Matricula> Listamatriculas;
    List<Professor> Listaprofessors;
    List<Curso> Listacursos;
    private Object Aluno;
    private Object Curso;


    public DigitalHouseManager(List<Aluno> listaaluno, List<Matricula> listamatriculas, List<Professor> listaprofessors, List<Curso> listacursos) {
        Listaaluno = listaaluno;
        Listamatriculas = listamatriculas;
        Listaprofessors = listaprofessors;
        Listacursos = listacursos;
    }


    public void registrarCurso(String nome, int codigoCurso, int quantidadeMaximaDeAlunos) {

        Curso Listcurso = new Curso(nome,codigoCurso, quantidadeMaximaDeAlunos);
        Listacursos.add(Listcurso);

    }
    public void excluirCurso(int codigoCurso) {
        Listacursos.remove(codigoCurso);
    }






    public void registrarProfessorAdjunto(String nome, String sobrenome, int codigoProfessor, int quantidadeDeHoras){

    ProfessoAdjunto reg = new ProfessoAdjunto(nome,sobrenome,0,0, quantidadeDeHoras);

    Listaprofessors.add(reg);




    }

    public void registrarProfessorTitular(String nome, String sobrenome, int codigoProfessor, String
                especialidade) {
        ProfessorTitular reg = new ProfessorTitular(nome, sobrenome,codigoProfessor,especialidade);
        Listaprofessors.add(reg);

}


    public void excluirProfessor(int codigoProfessor) {
        Listaprofessors.remove(codigoProfessor);
    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno) {

        Matricula matAluno = new Matricula();


    }



    public List<Aluno> getListaaluno() {
        return Listaaluno;
    }

    public void setListaaluno(List<Aluno> listaaluno) {
        Listaaluno = listaaluno;
    }

    public List<Matricula> getListamatriculas() {
        return Listamatriculas;
    }

    public void setListamatriculas(List<Matricula> listamatriculas) {
        Listamatriculas = listamatriculas;
    }

    public List<Professor> getListaprofessors() {
        return Listaprofessors;
    }

    public void setListaprofessors(List<Professor> listaprofessors) {
        Listaprofessors = listaprofessors;
    }

    public List<Curso> getListacursos() {
        return Listacursos;
    }

    public void setListacursos(List<Curso> listacursos) {
        Listacursos = listacursos;
    }
}
