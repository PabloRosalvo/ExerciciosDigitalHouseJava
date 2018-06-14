package Sobrecarga;

public class Principal {
    public static void main(String[] args) {
        Matematica professor = new Matematica();

        System.out.println("Inteiro 2 ao quadrado: " + professor.quadrado(2));
        System.out.println("Double PI ao quadrado: " + professor.quadrado( Math.PI ));
    }
}
