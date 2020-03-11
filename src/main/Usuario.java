package main;

public class Usuario {
	String user;
	String pass;
	String email;
	
	
	public Usuario(String user, String pass, String email) {
			this.user= user;
			this.pass = pass;
			this.email = email;
		}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
		
	}


