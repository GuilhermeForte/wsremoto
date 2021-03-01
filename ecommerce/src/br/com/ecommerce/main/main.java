package br.com.ecommerce.main;

import javax.swing.JOptionPane;

import br.com.ecommerce.model.CD;
import br.com.ecommerce.model.Cliente;
import br.com.ecommerce.model.Endereco;
import br.com.ecommerce.model.Livro;
import br.com.ecommerce.model.Pagamento;
import br.com.ecommerce.model.Produto;
import br.com.ecommerce.model.Venda;
import util.Magica;

public class main {
	

	public static void main(String[] args) {
		Produto produto;
		Produto p1=new Produto();
		Produto p2=new Produto(01,12,"Teste",(float) 15,(float)26);
		Cliente c1=new Cliente();
		Cliente c2=new Cliente(06,"Cleberson","regina@gama.com.br","1111-2222",new Endereco("Av. Itaquera","11","","Itaquera","Sao Paulo","SP","12345-000"));
		Venda v1=new Venda(1,(float)2453.03,c1,p2,new Pagamento((float)2453.03,"xx/xx/xx","a vista"));
		c1.setId(5);
		c1.setEmail("cleberson@gama.com.br");
		c1.setFone("1234-5678");
		c1.setNome("Regina da Silva");
		Endereco endereco=new Endereco();
		endereco.setLogradouro("Av. Itaquera");
		endereco.setNumero("777");
		endereco.setBairro("Itaquera");
		endereco.setCidade("Sao Paulo");
		endereco.setUf("SP");
		endereco.setCep("12345-000");
		c1.setEndereco(endereco);
		String resp= Magica.s("Digite L para livro ou qualquer coisa para CD");
		if(resp.equals("L")) {
			produto=new Livro(Magica.i("ID"),Magica.i("Quantidade"),Magica.s("Descrição"),Magica.f("Valor da compra"), Magica.f("Valor da compra"),Magica.s("Gramatura"),Magica.s("Autor"),Magica.s("Editora"));
		}else
			produto=new CD(Magica.i("ID"),Magica.i("Quantidade"),Magica.s("Descrição"),Magica.f("Valor da compra"), Magica.f("Valor da compra"),Magica.s("Artista"),Magica.s("Gravadora"),Magica.b("Faixas"));
		/*
		p1.setAll(01,
				  Magica.i("Digite Quantidade"),
				  JOptionPane.showInputDialog("Entre descrição"),
				  Float.parseFloat(JOptionPane.showInputDialog("Digite valor da compra")),
				  Float.parseFloat(JOptionPane.showInputDialog("Digite preço de venda")));
		System.out.println(p1.getResumo());
		System.out.println("Desconto: "+p1.getDesconto());
		p1.ajustarValores((float)0.15);
		System.out.println("\nvalores ajustados");
		System.out.println(p1.getResumo());
		System.out.println("toatl compra: "+p1.getTotalCompra());
		System.out.println("Situação do estoque: "+p1.verificarEstoque());
		*/
		//System.out.println(c1.toString());
		//System.out.println("Usuario:"+c1.getUsuario());
		//System.out.println(c2);
		//System.out.println("forma de pagamento: "+v1.getPagamento().getForma()+"\ncliente: "+v1.getCliente().getNome()+"");
	}

}
