package br.com.ecommerce.model;

public class Colaborador {
	private int id;
	private String nome, fone;
	private Cargo cargo;
	private Endereco endereco;
	public Colaborador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Colaborador(int id, String nome, String fone, Cargo cargo, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.fone = fone;
		this.cargo = cargo;
		this.endereco = endereco;
	}
	public void setAll(int id, String nome, String fone, Cargo cargo, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.fone = fone;
		this.cargo = cargo;
		this.endereco = endereco;
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
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Colaborador [id=" + id + ", nome=" + nome + ", fone=" + fone + ", cargo=" + cargo + ", endereco="
				+ endereco + "]";
	}
	
	

}
