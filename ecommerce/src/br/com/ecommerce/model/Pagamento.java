package br.com.ecommerce.model;

public class Pagamento {
	private float valor;
	private String data, forma;
	public Pagamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pagamento(float valor, String data, String forma) {
		super();
		this.valor = valor;
		this.data = data;
		this.forma = forma;
	}

	public void setAll(float valor, String data, String forma) {
		this.valor = valor;
		this.data = data;
		this.forma = forma;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	@Override
	public String toString() {
		return "Pagamento [valor=" + valor + ", data=" + data + ", forma=" + forma + "]";
	}
	
	
}
