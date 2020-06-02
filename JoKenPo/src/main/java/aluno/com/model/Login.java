package aluno.com.model;

import java.util.List;
import java.util.ArrayList;

public class Login {
    
    List <String> usuario = new ArrayList <> ();
    List <String> senha = new ArrayList <> ();

	public List<String> getUsuario() {
		return usuario;
    }
    
	public void setUsuario(List<String> usuario) {
        this.usuario = usuario;
    }
    
	public List<String> getSenha() {
		return senha;
    }
    
	public void setSenha(List<String> senha) {
        this.senha = senha;
	}

    


}