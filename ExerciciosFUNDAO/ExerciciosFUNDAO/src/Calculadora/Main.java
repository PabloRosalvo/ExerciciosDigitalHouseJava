package Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora fazerCalculo = new Calculadora();


        System.out.println(fazerCalculo.soma(3,5));
        System.out.println( fazerCalculo.soma(3.563,5.76));
        System.out.println(fazerCalculo);

        System.out.println(fazerCalculo.toString());

    }
}
