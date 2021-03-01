package br.com.ecommerce.model;

public class Cargo {
	private int id;
	private String nome, nivel;
	private float teto;
	
	public Cargo(int id, String nome, String nivel, float teto) {
		super();
		this.id = id;
		this.nome = nome;
		this.nivel = nivel;
		this.teto = teto;
	}

	public Cargo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setAll(int id, String nome, String nivel, float teto) {
		this.id = id;
		this.nome = nome;
		this.nivel = nivel;
		this.teto = teto;
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

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public float getTeto() {
		return teto;
	}

	public void setTeto(float teto) {
		this.teto = teto;
	}

	@Override
	public String toString() {
		return "Cargo [id=" + id + ", nome=" + nome + ", nivel=" + nivel + ", teto=" + teto + "]";
	}
	
	
}
