package aluno.com.controller;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import aluno.com.model.Login;

public class Serializacao {
    public void serializacao(Login log) {
        try {
            FileOutputStream fileOut = new FileOutputStream("Jogadores.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(log);
            out.close();
            fileOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}