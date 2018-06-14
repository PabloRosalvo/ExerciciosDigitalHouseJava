package Projeto1;

public class ProfessorTitular extends Professor {
     private String especialiade;



    public ProfessorTitular(String nome, String sobrenome, int codigoProfessor, String especialidade) {
        super(nome, sobrenome, 0, 0);
        this.especialiade = especialiade;
    }


    public String getEspecialiade() {
        return especialiade;
    }

    public void setEspecialiade(String especialiade) {
        this.especialiade = especialiade;
    }
}
