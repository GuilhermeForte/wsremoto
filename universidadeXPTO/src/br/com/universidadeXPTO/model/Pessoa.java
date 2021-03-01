package br.com.universidadeXPTO.model;

public class Pessoa {
	private String nome, email;

	public Pessoa(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
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

	public void setAll(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", email=" + email + "]";
	}
	
	

}
