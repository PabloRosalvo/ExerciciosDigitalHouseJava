package ShowDoMilhao;

public class ShowDoMilhao {

    public static void main(String[] args) {

        // Variavel para verificar
        boolean estaNoJogo = true;

        Jogo jogador1 = new Jogo();

        jogador1.bemVindo();
        jogador1.jogandoShowDoMilhao(estaNoJogo);

    }
}
