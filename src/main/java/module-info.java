module br.com.jogo {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.jogo.JoKenPo to javafx.fxml;
    exports br.com.jogo.JoKenPo;
    
    opens br.com.jogo.controller to javafx.fxml;
    exports br.com.jogo.controller;

    exports br.com.jogo.model;
    exports br.com.jogo.util;
}