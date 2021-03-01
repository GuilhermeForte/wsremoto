package br.com.ecommerce.model;

public class Livro extends Produto {
	private String gramatura, autor, editora;

	public Livro(int id, int qtde, String descricao, float valorCompra, float valorVenda, String gramatura,
			String autor, String editora) {
		super(id, qtde, descricao, valorCompra, valorVenda);
		this.gramatura = gramatura;
		this.autor = autor;
		this.editora = editora;
	}

	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setAll(int id, int qtde, String descricao, float valorCompra, float valorVenda, String gramatura,
			String autor, String editora) {
		super.setAll(id, qtde, descricao, valorCompra, valorVenda);
		this.gramatura = gramatura;
		this.autor = autor;
		this.editora = editora;
	}

	public String getGramatura() {
		return gramatura;
	}

	public void setGramatura(String gramatura) {
		this.gramatura = gramatura;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "Livro [gramatura=" + gramatura + ", autor=" + autor + ", editora=" + editora +", "+super.toString()+ "]";
	}
	
	
}
