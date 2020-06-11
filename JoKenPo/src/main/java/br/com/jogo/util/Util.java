package br.com.jogo.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

import br.com.jogo.model.Login;

public class Util {
	
    static public int randomizar() {
        Random rd = new Random();
        int valor = 0;
        for (int i = 0; i < 10; i++) {
           valor = rd.nextInt(3);
        }
        return valor;
    }
    
    static public Login deserializacao() {
		
		Login log = new Login();
		try {
			FileInputStream fileInp = new FileInputStream("Pessoas.ser");
			ObjectInputStream in = new ObjectInputStream(fileInp);
			log = (Login) in.readObject();
			in.close();
			fileInp.close();
		} catch (IOException e) {
			e.printStackTrace(); 
		}catch(ClassNotFoundException c) {
			System.out.println("Pessoa class nou found");
			c.printStackTrace();
		}
		
		return log;
	}
    
    static public void serializacao(Login log) {
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
