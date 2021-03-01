package br.com.universidadeXPTO.model;

public class Aluno extends Pessoa {
	private int rm;
	private boolean bolsista;
	public Aluno(String nome, String email, int rm, boolean bolsista) {
		super(nome, email);
		this.rm = rm;
		this.bolsista = bolsista;
	}
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public boolean isBolsista() {
		return bolsista;
	}
	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}
	public void setAll(String nome, String email, int rm, boolean bolsista) {
		super.setAll(nome, email);
		this.rm = rm;
		this.bolsista = bolsista;
	}
	@Override
	public String toString() {
		return "Aluno [rm=" + rm + ", bolsista=" + bolsista +", "+super.toString()+"]";
	}
	
	

}
