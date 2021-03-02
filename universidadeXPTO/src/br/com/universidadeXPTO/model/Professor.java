package br.com.universidadeXPTO.model;

import util.PadraoPessoas;

public class Professor extends Pessoa implements PadraoPessoas {
	private String formacao, area, subarea;

	public Professor(String nome, String email, String formacao, String area, String subarea) {
		super(nome, email);
		this.formacao = formacao;
		this.area = area;
		this.subarea = subarea;
	}

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getSubarea() {
		return subarea;
	}

	public void setSubarea(String subarea) {
		this.subarea = subarea;
	}

	public void setAll(String nome, String email, String formacao, String area, String subarea) {
		super.setAll(nome, email);
		this.formacao = formacao;
		this.area = area;
		this.subarea = subarea;
	}

	@Override
	public String toString() {
		return "Professor [formacao=" + formacao + ", area=" + area + ", subarea=" + subarea +", "+super.toString()+"]";
	}

	@Override
	public String getResumo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
