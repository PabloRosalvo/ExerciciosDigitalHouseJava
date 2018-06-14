package Projeto1;

public class ProfessoAdjunto extends Professor {
    private int qnthoras;

    public ProfessoAdjunto(String nome, String sobrenome, int tempoDeCasa, int codigo,int qnthoras) {
        super(nome, sobrenome, 0, 0);
        this.qnthoras = qnthoras;
    }

    public int getQnthoras() {
        return qnthoras;
    }

    public void setQnthoras(int qnthoras) {
        this.qnthoras = qnthoras;
    }
}
