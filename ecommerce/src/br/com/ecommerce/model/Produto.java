package br.com.ecommerce.model;

public class Produto {
	private int id, qtde;
	private String descricao;
	private float valorCompra, valorVenda;
	
	public Produto() {
		
	}
	
	public Produto(int id, int qtde,String descricao,float valorCompra, float valorVenda) {
		this.id=id;
		this.qtde=qtde;
		this.descricao=descricao;
		this.valorCompra=valorCompra;
		this.valorVenda=valorVenda;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public float getTotalCompra() {
		return valorCompra*qtde;
		
	}
	public float getDesconto() {
		return (float)(valorVenda*0.9);
		
	}
	public String getResumo(){
		return "descri��o: "+descricao+"\nvalor da compra: R$"+valorVenda+"\nQuantidade: "+qtde;
	}
	public void setAll(int id, int qtde, String descricao, float valorCompra,float valorVenda){
		this.id = id;
		this.qtde = qtde;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
	}
	public String verificarEstoque() {
		if(qtde>=10) {
			return"Estoque Alto";
		}else if(qtde<10&&qtde>5) {
			return "Estoque Medio";
		}
		return "Estoque Baixo";
	}
	public void ajustarValores(float porcentagem) {
		valorCompra=(float)valorCompra+(valorCompra*porcentagem);
		valorVenda=(float)valorVenda+(valorVenda*porcentagem);
	}
}
