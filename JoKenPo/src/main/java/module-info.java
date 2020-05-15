module aluno.com.JoKenPo {
    requires javafx.controls;
    requires javafx.fxml;

    opens aluno.com.JoKenPo to javafx.fxml;
    exports aluno.com.JoKenPo;
}