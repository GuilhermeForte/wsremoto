package br.com.universidadeXPTO.model;

public class Curso {
	private String nome, sigla;
	private int cargaHoraria;
	public Curso(String nome, String sigla, int cargaHoraria) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.cargaHoraria = cargaHoraria;
	}
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public void setAll(String nome, String sigla, int cargaHoraria) {
		this.nome = nome;
		this.sigla = sigla;
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", sigla=" + sigla + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	

}
