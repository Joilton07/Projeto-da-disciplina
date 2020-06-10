package aluno.com.JoKenPo;

import java.io.IOException;

import aluno.com.controller.App;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}