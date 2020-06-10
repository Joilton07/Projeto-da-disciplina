package aluno.com.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import aluno.com.model.Login;

public class Deserializacao {

    public Login deserializacao() {
			
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
    
}