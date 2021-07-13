package br.com.jogo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.jogo.JoKenPo.App;
import br.com.jogo.model.Armazenar;
import br.com.jogo.model.Jogador;
import br.com.jogo.model.Login;
import br.com.jogo.util.Util;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    
    @FXML
    private Button entrar;
    
    @FXML
    public void ControllerDoLogin() throws IOException {

        Login log;
        if(login_user.getText().equals("admin") && login_senha.getText().equals("admin")){
            login.setNome(login_user.getText()).setSenha(login_senha.getText());
            j1 = new Jogador.Builder().setLogin(login).criarJogador();
            t1.add(j1);
            salvar.setJogadores(t1);
            log = new Login(login_user.getText(), login_senha.getText());
            Util.serializacao(log);            
            log = Util.deserializacao();
            App.setRoot("TelaHome");
        }else{
            System.out.println("Você não informou a senha certa ou você não pode entra ainda!");    
        }
    }
    
}