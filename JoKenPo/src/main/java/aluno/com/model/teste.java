package aluno.com.model;

public class teste {
    public static void main(String[] args) {
        Jogador jogador = new Jogador.Builder().setNome("Willian").setPontuacao(17).ContruirJogador();
        Jogador jogador = new Jogador.Builder().setNome("Joilton").setPontuacao(17).ContruirJogador();

        System.out.println(jogador);

    }
}