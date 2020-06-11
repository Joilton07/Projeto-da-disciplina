package br.com.jogo.model;


public class Login {
    
    private String nome;
    private String senha;

    public Login() {}

    public Login(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public Login setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Login setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    

	

    


}