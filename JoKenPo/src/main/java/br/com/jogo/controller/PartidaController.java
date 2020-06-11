package br.com.jogo.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

import br.com.jogo.JoKenPo.App;
import br.com.jogo.model.Jogador;
import br.com.jogo.model.Login;
import br.com.jogo.util.Util;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
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
	private void voltaParaTelaHome() throws IOException {
		App.setRoot("TelaHome");
	}
    
    @FXML
    void imgem() {
   
      ArrayList<String> objetos = new ArrayList<String>();
      objetos.add("Papel");
      objetos.add("Tesoura");
      objetos.add("Pedra");

      String valorPlayer = objetos.get(Util.randomizar());
      String valorCPU = objetos.get(Util.randomizar());

      espacoMaoPlayer.setText(valorPlayer);
      espacoMaoCPU.setText(valorCPU);

      if (valorPlayer.equals("Pedra") && valorCPU.equals("Pedra")) {
    	  alertEmpate();
    	  
      } else if (valorPlayer.equals("Pedra") && valorCPU.equals("Papel")) {
    	  alertCPU();
    	  
      } else if (valorPlayer.equals("Pedra") && valorCPU.equals("Tesoura")) {
    	  alertPlayer();
    	  
      } else if (valorPlayer.equals("Papel") && valorCPU.equals("Papel")) {
    	  alertEmpate();
    	  
      } else if (valorPlayer.equals("Papel") && valorCPU.equals("Pedra")) {
    	  alertPlayer();
    	  
      } else if (valorPlayer.equals("Papel") && valorCPU.equals("Tesoura")) {
    	  alertCPU();
    	  
      } else if (valorPlayer.equals("Tesoura") && valorCPU.equals("Tesoura")) {
    	  alertEmpate();
    	  
      } else if (valorPlayer.equals("Tesoura") && valorCPU.equals("Papel")) {
    	  alertPlayer();
    	  
      } else if (valorPlayer.equals("Tesoura") && valorCPU.equals("Pedra")) {
    	  alertCPU();
    	  
      }	
      
    }
    
    void alertPlayer () {
    	Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Resultado");
		alert.setHeaderText(null);
		alert.setContentText("Player Ganhou");
		
		alert.showAndWait();
    }
    
    void alertCPU () {
    	Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Resultado");
		alert.setHeaderText(null);
		alert.setContentText("CPU Ganhou");
		
		alert.showAndWait();
    }
    
    void alertEmpate () {
    	Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Resultado");
		alert.setHeaderText(null);
		alert.setContentText("Empatou");
		
		alert.showAndWait();
    }

}