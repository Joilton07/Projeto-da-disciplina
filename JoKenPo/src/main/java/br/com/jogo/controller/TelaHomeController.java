package br.com.jogo.controller;

import java.io.IOException;

import br.com.jogo.JoKenPo.App;

// import aluno.com.JoKenPo.App;


import javafx.fxml.FXML;

public class TelaHomeController {

	@FXML
	private void trocarParaTelaP1vsCPU1() throws IOException {
		App.setRoot("TelaPartidaP1vsCPU");
	}
	
	@FXML
	private void voltaParaTelaHome() throws IOException {
		App.setRoot("telaHome");
	}
	
	@FXML
	private void SAIR() {
		System.exit(0);
	}
	
	
}
