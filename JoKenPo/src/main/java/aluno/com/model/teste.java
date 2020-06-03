package aluno.com.model;



public class teste {
    public static void main(String[] args) {
        
        
        // Login log = new Login();
        // log.setNome("Gilberto").setSenha("13214");
        // Jogador jogador = new Jogador.Builder().setPontuacao(10).setLogin(log).criarJogador();
        // List <Jogador> jogadores = new ArrayList<>();

        // jogadores.add(jogador);
        // Armazenar a = new Armazenar();
        // a.jogadores.add(jogador);
        // String P1Jogada = "Pedra";
        // Jogador jogador1 = null;
        // Jogador jogador2 = null;
        // String P2Jogada = "Tesora";

        // System.out.println(jogador1.getLogin());
    //     if (P1Jogada.equals("Pedra") && P2Jogada.equals("Tesora")) {
    //     System.out.println("P1");
      
    // }

        // System.out.println(jogador);
        Armazenar a = new Armazenar();
        String nome1 = "Joilton";
        String nome2 = "Gilberto";
        int p1 = 0;
        int p2 = 0;
        Login l = new Login();
        l.setNome("gilberto");
        Jogador j1 = new Jogador.Builder().setLogin(l).criarJogador();

        System.out.println(j1.getLogin().getNome());

        Jogador j2 = new Jogador.Builder().setNome("Joilton").criarJogador();
        String P1Jogada = "Pedra";
        String P2Jogada = "Tesora";

        if(P1Jogada.equals("Pedra") && P2Jogada.equals("Tesora")){
            System.out.println("Jogador 1");
            p1++;
        }

        j1 = new Jogador.Builder().setNome(nome1).setPontuacao(p1).criarJogador();
        j2 = new Jogador.Builder().setNome(nome2).setPontuacao(p2).criarJogador();

        
        a.jogadores.add(j1);
        a.jogadores.add(j2);

    }
}