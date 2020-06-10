package aluno.com.model;



/**
 * Jogador
 */
public class Jogador{

    private Integer pontuacao;
    private Login login;
    private String nome;

    // private Jogador () {}


    private Jogador(Builder builder) {
        this.pontuacao = builder.pontuacao;
        this.login = builder.login;
        this.nome = builder.nome;
    }
    
    public Integer getPontuacao() {
        return pontuacao;
    }

    public Login getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    
  
    public static class Builder{
        
        private Integer pontuacao;
        private Login login = new Login();
        private String nome;

        // public Builder() {}
        
        // public Builder(Integer pontuacao, Login login, String nome) {
        //     this.pontuacao = pontuacao;
        //     this.login = login;
        //     this.nome = nome;
        // }

        public Builder setPontuacao(Integer pontuacao) {
            this.pontuacao = pontuacao;
            return this;
        }
        
        public Builder setLogin(Login login) {
            this.login = login;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }
        
       

       public Jogador criarJogador () {
            return new Jogador(this);
       }

       

    }
    

    

    

}