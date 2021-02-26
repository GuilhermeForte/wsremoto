package br.com.ecommerce.model;

public class Cliente {
	private int id;
	private String nome, email, fone;
	public Cliente() {
		super();
	}
	public Cliente(int id,String nome,String email,String fone) {
		this.id=id;
		this.nome=nome.toUpperCase();
		this.email=email.toLowerCase();
		this.fone=fone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public void setAll(int id,String nome,String email,String fone) {
		this.id=id;
		this.nome=nome.toUpperCase();
		this.email=email.toLowerCase();
		this.fone=fone;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", fone=" + fone + "]";
	}
	public String getAll() {
		return "ID: "+id+"\nNome: "+nome+"\ne-mail: "+email+"\nFone: "+fone;
	}
	public String getUsuario() {
		if(email.contains("@")) {
			return "User: "+email.substring(0,email.indexOf('@')).toUpperCase();
		}
		return email;
	}
	
}
