package aluno.com.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;


import aluno.com.model.Jogador;
import aluno.com.model.Login;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class PartidaController {

    private Jogador jogador;
    private Login log;
    // private final static int Papel = 1;
    // private final static int Pedra = 2;
    // private final static int Tesoura = 3;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane s1;

    @FXML
    private TextField ResultadoP1, ResultadoCPU, textoVencedor ,textoVencedor1 , espacoMaoPlayer ,espacoMaoCPU;

    @FXML
    private Button btnPartidaResultado ,btnPartidaP1vsCPU , btnPartidaContinuar; 

    @FXML
    void imgem(){

      Random rd = new Random();
      int valor = 0;
      for (int i = 0; i < 10; i++) {
         valor = rd.nextInt(3);
      }

      if (valor == 0) {
        espacoMaoPlayer.setText("Papel");
      } else if (valor == 1){
        espacoMaoPlayer.setText("Tesoura");
      }else if(valor == 2){
        espacoMaoPlayer.setText("Pedra");
      }
      
    }
    @FXML
    void palavra(){

      Random rd = new Random();
      int valor = 0;
      for (int i = 0; i < 10; i++) {
         valor = rd.nextInt(3);
      }

      if (valor == 0) {
        espacoMaoCPU.setText("Papel");
      } else if (valor == 1){
        espacoMaoCPU.setText("Tesoura");
      }else if(valor == 2){
        espacoMaoCPU.setText("Pedra");
      }
      
    }

    @FXML
    public void comparacao() throws IOException{

      
      int pontoP1 = 0;
      int pontoCPU = 0;

      if(espacoMaoPlayer.getText() == "Papel" && espacoMaoCPU.getText() == "Papel"){
        ResultadoP1.setText("Papel");
        ResultadoCPU.setText("Papel");
        textoVencedor.setText("Deu Impate");
        // ResultadoP1.getText();
        // ResultadoCPU.getText();
        // textoVencedor.getText();
      }else if(espacoMaoPlayer.getText() == "Papel" && espacoMaoCPU.getText() == "Pedra"){
        ResultadoP1.setText("Papel");
        ResultadoCPU.setText("Pedra");
        textoVencedor.setText("Jogador 1");
        // ResultadoP1.getText();
        // ResultadoCPU.getText();
        // textoVencedor.getText();
        pontoP1++;
      }else if(espacoMaoPlayer.getText() == "Papel" && espacoMaoCPU.getText() == "Tesoura") {
        ResultadoP1.setText("Papel");
        ResultadoCPU.setText("Tesoura");
        textoVencedor.setText("CPU");
        // ResultadoP1.getText();
        // ResultadoCPU.getText();
        // textoVencedor.getText();
        pontoCPU++;
      }else if(espacoMaoPlayer.getText() == "Pedra" && espacoMaoCPU.getText() == "Pedra"){
        ResultadoP1.setText("Pedra");
        ResultadoCPU.setText("Pedra");
        textoVencedor.setText("Deu Impate");
        // ResultadoP1.getText();
        // ResultadoCPU.getText();
        // textoVencedor.getText();
      }else if(espacoMaoPlayer.getText() == "Pedra" && espacoMaoCPU.getText() == "Papel"){
        ResultadoP1.setText("Pedra");
        ResultadoCPU.setText("Papel");
        textoVencedor.setText("CPU");
        // ResultadoP1.getText();
        // ResultadoCPU.getText();
        // textoVencedor.getText();
        pontoCPU++;
      }else if(espacoMaoPlayer.getText() == "Pedra" && espacoMaoCPU.getText() == "Tesoura"){
        ResultadoP1.setText("Pedra");
        ResultadoCPU.setText("Tesoura");
        textoVencedor.setText("Jogador 1");
        // ResultadoP1.getText();
        // ResultadoCPU.getText();
        // textoVencedor.getText();
        pontoP1++;
      }else if(espacoMaoPlayer.getText() == "Tesoura" && espacoMaoCPU.getText() == "Tesoura"){
        ResultadoP1.setText("Tesoura");
        ResultadoCPU.setText("Tesoura");
        textoVencedor.setText("Deu Impate");
        // ResultadoP1.getText();
        // ResultadoCPU.getText();
        // textoVencedor.getText();
      }else if(espacoMaoPlayer.getText() == "Tesoura" && espacoMaoCPU.getText() == "Papel"){
        ResultadoP1.setText("Tesoura");
        ResultadoCPU.setText("Papel");
        textoVencedor.setText("Jogador 1");
        // ResultadoP1.getText();
        // ResultadoCPU.getText();
        // textoVencedor.getText();
        pontoP1++;
      }else if(espacoMaoPlayer.getText() == "Tesoura" && espacoMaoCPU.getText() == "Pedra"){
        ResultadoP1.setText("Tesoura");
        ResultadoCPU.setText("Pedra");
        textoVencedor.setText("CPU");
        // ResultadoP1.getText();
        // ResultadoCPU.getText();
        // textoVencedor.getText();
        pontoCPU++;
      }

      
      
      if(pontoP1 == 3){
        jogador = new Jogador.Builder().setPontuacao(pontoP1).criarJogador();
        App.setRoot("TelaPartidaP1vsCPU03");
        ganhador(0);
        
      }else if(pontoCPU == 3){
        App.setRoot("TelaPartidaP1vsCPU03");
        ganhador(3);
      }else{
        App.setRoot("TelaPartidaP1vsCPU02");
      }
    }


    
    public void ganhador(int ganhar) throws IOException {
      
      if(ganhar == 0){
        textoVencedor1.setText("Jogador 1");
      }else if(ganhar == 3){
        textoVencedor1.setText("CPU");
      }

    }
    @FXML
    public void Resultado() throws IOException{
      if(ResultadoP1.getText() == "Papel" && ResultadoCPU.getText() == "Papel"){
        ResultadoP1.getText();
        ResultadoCPU.getText();
        textoVencedor.getText();

      }else if(ResultadoP1.getText() == "Papel" && ResultadoCPU.getText() == "Pedra"){
        ResultadoP1.getText();
        ResultadoCPU.getText();
        textoVencedor.getText();
      }else if(ResultadoP1.getText() == "Papel" && ResultadoCPU.getText() == "Tesoura") {
        ResultadoP1.getText();
        ResultadoCPU.getText();
        textoVencedor.getText();
      }else if(ResultadoP1.getText() == "Pedra" && ResultadoCPU.getText() == "Pedra"){
        ResultadoP1.getText();
        ResultadoCPU.getText();
        textoVencedor.getText();
      }else if(ResultadoP1.getText() == "Pedra" && ResultadoCPU.getText() == "Papel"){
        ResultadoP1.getText();
        ResultadoCPU.getText();
        textoVencedor.getText();
      }else if(ResultadoP1.getText() == "Pedra" && ResultadoCPU.getText() == "Tesoura"){
        ResultadoP1.getText();
        ResultadoCPU.getText();
        textoVencedor.getText();
      }else if(ResultadoP1.getText() == "Tesoura" && ResultadoCPU.getText() == "Tesoura"){
       ResultadoP1.getText();
        ResultadoCPU.getText();
        textoVencedor.getText();
      }else if(ResultadoP1.getText() == "Tesoura" && ResultadoCPU.getText() == "Papel"){
        ResultadoP1.getText();
        ResultadoCPU.getText();
        textoVencedor.getText();
      }else if(ResultadoP1.getText() == "Tesoura" && ResultadoCPU.getText() == "Pedra"){
        ResultadoP1.getText();
        ResultadoCPU.getText();
        textoVencedor.getText();
      }
    }

    @FXML
    public void voltar() throws IOException {
      App.setRoot("TelaPartidaP1vsCPU02");
    }

    @FXML
    public void voltar1() throws IOException {
      App.setRoot("TelaPartidaP1vsCPU");
    }

    

    // @FXML
    // void initialize() {
    //   System.out.println("ola");
    //   Platform.runLater(new Runnable() {
    //     @Override
    //     public void run() {
    //       try {
    //         File img = new File(System.getProperty("user.dir") + "/img/paper.png");
    //         Image imagem = new Image(img.toURI().toString());
    //         espacoMao.setImage(imagem);
    //         paTeste.getChildren().setAll(espacoMao);
    //       } catch (Exception ex) {
    //           ex.printStackTrace();
    //       }
    //     }
    //   });

    //     Platform.runLater(new Runnable() {
    //       @Override
    //       public void run() {
    //         try {
    //           File img = new File(System.getProperty("user.dir") + "/img/paper.png");
    //           Image imagem = new Image(img.toURI().toString());
    //           espacoMao.setImage(imagem);
    //           paTeste.getChildren().setAll(espacoMao);
    //         } catch (Exception ex) {
    //             ex.printStackTrace();
    //         }
    //       }
    //     });
    //     assert s1 != null : "fx:id=\"s1\" was not injected: check your FXML file 'TelaPartidaP1vsCPU.fxml'.";
    //     assert paTeste != null : "fx:id=\"paTeste\" was not injected: check your FXML file 'TelaPartidaP1vsCPU.fxml'.";
    //     assert espacoMao != null : "fx:id=\"espacoMao\" was not injected: check your FXML file 'TelaPartidaP1vsCPU.fxml'.";
    //     assert btnPartidaP1vsCPU != null : "fx:id=\"btnPartidaP1vsCPU\" was not injected: check your FXML file 'TelaPartidaP1vsCPU.fxml'.";
    // }
    // try {
      //   AnchorPane root;
      //   root = (AnchorPane) FXMLLoader.load(getClass().getResource("TelaPartidaP1vsCPU.fxml"));
      //   File img = new File("src/main/img/paper.png");
      //   Image papel = new Image(img.toURI().toString());
      //   espacoMao = new ImageView(papel);
      //   root.getChildren().add(espacoMao);
      // } catch (IOException e) {
      //   e.printStackTrace();
      // }
    // File img = new File("src/main/img/paper.png");
      // Image papel = new Image(img.toURI().toString());
      // espacoMao = new ImageView(papel);
      // App.setRoot("TelaPartidaP1vsCPU");
    /**
     * StackPane sp = new StackPane();
        Image img = new Image("javafx.jpg");
        ImageView imgView = new ImageView(img);
        sp.getChildren().add(imgView);

        Scene scene = new Scene(sp);
        primaryStage.setScene(scene);
        primaryStage.show();
      */


}