package br.com.concessionaria.modelo;

public class Carro {
	private float valor;
	private String cor;
	private boolean status;
	private short velocidadeAtual;
	private String modelo;

	public void setCor(String param) {
		cor=param;
	}
	public void setValor(float param) {
		valor=param;
	}
	public void setModelo(String arg) {
		modelo=arg;
	}
	public void ligar() {
		status=true;
	}
	public void desligar() {
		status=false;
		velocidadeAtual=0;
	}
	public void setAcelerar(short velocidade) {
		if(status==true) {
			velocidadeAtual=(short)(velocidadeAtual+velocidade);
		}
	}
	public void setBrecar(short velocidade) {
		if(status==true&&velocidadeAtual>=velocidade) {
			velocidadeAtual=(short)(velocidadeAtual-velocidade);
		}
	}

	public String getCor() {
		return cor;
	}
	public float getValor() {
		return valor;
	}
	public String getModelo() {
		return modelo;
	}
	public String getResumo() {
		String str="Ligado";
		if(status==false) {
			str="Desligado";
		}
		return "Modelo: "+modelo+"\nStatus: "+str+"\nVelocidade: "+velocidadeAtual;
	}
}
