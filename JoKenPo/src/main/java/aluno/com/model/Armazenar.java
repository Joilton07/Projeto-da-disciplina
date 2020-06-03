package aluno.com.model;

import java.util.ArrayList;
import java.util.List;

public class Armazenar {
    
    private List <Jogador> jogadores = new ArrayList<>();

    public Armazenar() { }

    public Armazenar(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    

    

    

    
}