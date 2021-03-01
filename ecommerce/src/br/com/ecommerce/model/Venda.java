package br.com.ecommerce.model;

public class Venda {
	private int numero;
	private float total;
	private Cliente cliente;
	private Produto produto;
	private Pagamento pagamento;
	
	public Venda() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	
	public Venda(int numero, float total, Cliente cliente, Produto produto, Pagamento pagamento) {
		super();
		this.numero = numero;
		this.total = total;
		this.cliente = cliente;
		this.produto = produto;
		this.pagamento = pagamento;
	}
	
	public void setAll(int numero, float total, Cliente cliente, Produto produto, Pagamento pagamento) {
		this.numero = numero;
		this.total = total;
		this.cliente = cliente;
		this.produto = produto;
		this.pagamento = pagamento;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public float getTotal() {
		return total;
	}
	
	public void setTotal(float total) {
		this.total = total;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Pagamento getPagamento() {
		return pagamento;
	}
	
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	@Override
	public String toString() {
		return "Venda [numero=" + numero + ", total=" + total + ", cliente=" + cliente + ", produto=" + produto
				+ ", pagamento=" + pagamento + "]";
	}

}
