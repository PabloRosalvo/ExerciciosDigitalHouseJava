package Projeto1;

public class Professor {
     String nome;
     String sobrenome;
     int codigo;
     int temmpoDeCasa;

    public Professor(String nome, String sobrenome, int codigo, int temmpoDeCasa) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigo = codigo;
        this.temmpoDeCasa = temmpoDeCasa;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTemmpoDeCasa() {
        return temmpoDeCasa;
    }

    public void setTemmpoDeCasa(int temmpoDeCasa) {
        this.temmpoDeCasa = temmpoDeCasa;
    }
}
