module br.com.aluno.joKenPo {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.aluno.joKenPo to javafx.fxml;
    exports br.com.aluno.joKenPo;
    
    opens br.com.aluno.controller to javafx.fxml;
    exports br.com.aluno.controller;
    
    exports br.com.aluno.model;
    exports br.com.aluno.util;
}