package aluno.com.JoKenPo;

import java.io.IOException;

import aluno.com.controller.App;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
