package aluno.com.model;

/**
 * Jogador
 */
public class Jogador {

    private String nome;
    private Integer pontuacao;

    private Jogador(Builder builder) {
        this.nome = builder.nome;
        this.pontuacao = builder.pontuacao;
    }

    public static class Builder{
        
        private String nome;
        private Integer pontuacao;

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }
        
        public Builder setPontuacao(Integer pontuacao) {
            this.pontuacao = pontuacao;
            return this;
        }

        public Jogador ContruirJogador() {
            return new Jogador(this);
        }

    }


    public String getNome() {
        return nome;
    }

    

    public Integer getPontuacao() {
        return pontuacao;
    }

    @Override
    public String toString() {
        return "Jogador [nome=" + nome + ", pontuacao=" + pontuacao + "]";
    }

    
    

    
    
    

}