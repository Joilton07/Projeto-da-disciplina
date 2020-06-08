package aluno.com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import aluno.com.JoKenPo.App;
import aluno.com.model.Armazenar;
import aluno.com.model.Jogador;
import aluno.com.model.Login;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
import javafx.fxml.FXML;
// import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
// import javafx.scene.control.Alert.AlertType;

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
    /* 
        colocar o id do usario para armazenar a informação inserida
        colocar o id do senha para armazenar a informação inserida
    */
    @FXML
    public void ControllerDoLogin() throws IOException {
        if(login_user.getText().equals("admin") && login_senha.getText().equals("admin")){
            login.setNome(login_user.getText()).setSenha(login_senha.getText());
            j1 = new Jogador.Builder().setLogin(login).criarJogador();
            t1.add(j1);
            salvar.setJogadores(t1);
            // System.out.println("Entrou no Jogo");
            App.setRoot("telaHome");
        }else{
            System.out.println("Você não informou a senha certa ou você não pode entra ainda!");
        }
    }
    /**
     * Esta tentando colocar um notificação para o button
     */
    // public void voltaParaTelaHome()  {
	// 	entrar.setOnAction(new EventHandler<ActionEvent>(){
        
    //         @Override
    //         public void handle(ActionEvent event) {
    //             Alert alert = new Alert(AlertType.INFORMATION);
    //             alert.setTitle("Informação");
    //             alert.setHeaderText(null);
    //             alert.setContentText("Entrou no Jogo!");
    //             alert.showAndWait();
    //         }
    //     });
	// }
}