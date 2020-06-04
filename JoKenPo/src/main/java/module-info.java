module aluno.com.JoKenPo {
    requires javafx.controls;
    requires javafx.fxml;

    opens aluno.com.JoKenPo to javafx.fxml;
    exports aluno.com.JoKenPo;
    
    opens aluno.com.controller to javafx.fxml;
    exports aluno.com.controller;
}