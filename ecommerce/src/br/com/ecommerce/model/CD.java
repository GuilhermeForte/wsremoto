package br.com.ecommerce.model;

public class CD extends Produto{
	private String artista, gravadora;
	private byte totalFaixas;
	
	public CD(int id, int qtde, String descricao, float valorCompra, float valorVenda, String artista, String gravadora,
			byte totalFaixas) {
		super(id, qtde, descricao, valorCompra, valorVenda);
		this.artista = artista;
		this.gravadora = gravadora;
		this.totalFaixas = totalFaixas;
	}
	
	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "CD [artista=" + artista + ", gravadora=" + gravadora + ", totalFaixas=" + totalFaixas +", "+super.toString()+"]";
	}
	
	public void setAll(int id, int qtde, String descricao, float valorCompra, float valorVenda, String artista, String gravadora,
			byte totalFaixas) {
		super.setAll(id, qtde, descricao, valorCompra, valorVenda);
		this.artista = artista;
		this.gravadora = gravadora;
		this.totalFaixas = totalFaixas;
	}

	public String getArtista() {
		return artista;
	}
	
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	public String getGravadora() {
		return gravadora;
	}
	
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	
	public byte getTotalFaixas() {
		return totalFaixas;
	}
	
	public void setTotalFaixas(byte totalFaixas) {
		this.totalFaixas = totalFaixas;
	}
	
	

}
