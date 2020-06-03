package aluno.com.JoKenPo;

import java.io.IOException;

import javafx.fxml.FXML;

public class TelaHomeController {

	@FXML
	private void trocarParaTelaP1vsCPU1() throws IOException {
		App.setRoot("telaP1vsCPU1");
	}
	
	@FXML
	private void trocarParaTelaP1vsP2() throws IOException {
		App.setRoot("telaP1vsP2");
	}
	
	@FXML
	private void voltaParaTelaHome() throws IOException {
		App.setRoot("telaHome");
	}
	
	@FXML
	private void trocaParaLogin() throws IOException {
		App.setRoot("TelaLogin");
	}
	
	
}
