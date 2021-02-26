package br.com.concessionaria.pricipal;

import br.com.concessionaria.modelo.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		Carro objeto=new Carro();
		objeto.setCor("azul");
		objeto.setModelo("Focus");
		objeto.setValor(26300);
		objeto.ligar();
		objeto.setAcelerar((short) 20);
		objeto.setAcelerar((short) 30);
		System.out.println("R$ "+objeto.getValor());
		System.out.println(objeto.getCor());
		System.out.println(objeto.getResumo());

	}

}
