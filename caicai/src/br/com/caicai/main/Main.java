package br.com.caicai.main;

import javax.swing.JOptionPane;

import br.com.caicai.model.Elevador;

public class Main {

	public static void main(String[] args) {
		Elevador E1=new Elevador();
		E1.configurar((short)20,(short)-3,(byte)12);
		E1.setNome(JOptionPane.showInputDialog("Entrar nome").toUpperCase());
		E1.subir();
		E1.entrar((byte)Byte.parseByte(JOptionPane.showInputDialog("digite numero de passageiros")));
		E1.subir((byte)Byte.parseByte(JOptionPane.showInputDialog("digite andar")));
		E1.sair((byte)Byte.parseByte(JOptionPane.showInputDialog("digite numero de desembarque")));
		System.out.println(E1.getResumo());

	}

}
