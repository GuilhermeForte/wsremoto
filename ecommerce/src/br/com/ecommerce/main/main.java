package br.com.ecommerce.main;

import javax.swing.JOptionPane;

import br.com.ecommerce.model.Cliente;
import br.com.ecommerce.model.Produto;

public class main {

	public static void main(String[] args) {
		Produto p1=new Produto();
		Produto p2=new Produto(01,12,"Teste",(float) 15,(float)26);
		Cliente c1=new Cliente();
		Cliente c2=new Cliente(02,"teste2","Teste2@xxxx.xx","5555-5555");
		/*p1.setAll(01,
				  Integer.parseInt(JOptionPane.showInputDialog("Digite Quantidade")),
				  JOptionPane.showInputDialog("Entre descri��o"),
				  Float.parseFloat(JOptionPane.showInputDialog("Digite valor da compra")),
				  Float.parseFloat(JOptionPane.showInputDialog("Digite pre�o de venda")));
		System.out.println(p1.getResumo());
		System.out.println("Desconto: "+p1.getDesconto());
		p1.ajustarValores((float)0.15);
		System.out.println("\nvalores ajustados");
		System.out.println(p1.getResumo());
		System.out.println("toatl compra: "+p1.getTotalCompra());
		System.out.println("Situa��o do estoque: "+p1.verificarEstoque());
		*/c1.setAll(01, "teste", "Teste@xxx.xx", "5555-5555");
		System.out.println(c1.getAll());
		System.out.println(c1.getUsuario());
		System.out.println(c2.getAll());
		System.out.println(c2.getUsuario());
	}

}
