module aluno.com.JoKenPo {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.jogo.joKenPo to javafx.fxml;
    exports br.com.jogo.joKenPo;
    
    opens br.com.jogo.controller to javafx.fxml;
    exports br.com.jogo.controller;
}