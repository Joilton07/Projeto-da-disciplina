package aluno.com.controller;

import java.util.ArrayList;
import java.util.List;

import aluno.com.model.Armazenar;
import aluno.com.model.Jogador;
import aluno.com.model.Login;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {
    private List<Jogador> t1 = new ArrayList<>();
    private Login login = new Login();
    private Jogador j1;
    private Armazenar salvar = new Armazenar();
    @FXML
    private TextField login_user;
    @FXML
    private TextField login_senha;
    /* 
        colocar o id do usario para armazenar a informação inserida
        colocar o id do senha para armazenar a informação inserida
    */
    @FXML
    public void ControllerDoLogin() {
        if(login_user.getText().equals("admin") && login_senha.getText().equals("admin")){
            login.setNome(login_user.getText()).setSenha(login_senha.getText());
            j1 = new Jogador.Builder().setLogin(login).criarJogador();
            t1.add(j1);
            salvar.setJogadores(t1);
            System.out.println("Entrou no Jogo");
        }else{
            System.out.println("Você não informou a senha certa ou você não pode entra ainda!");
        }

    } 
    

}