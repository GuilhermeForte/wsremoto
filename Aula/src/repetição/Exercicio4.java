package repeti��o;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		String nome, nomev="", nomen="";
		short idade, idadev=0, idaden=999;
		double idades=0, media=0;
		int count=0,count1=0;
		do {
			nome=JOptionPane.showInputDialog("Digite nome").toUpperCase();
			idade=Short.parseShort(JOptionPane.showInputDialog("digite idade"));
			if(idade>=18) {
					count++;
				}
			if(idade>idadev) {
				idadev=idade;
				nomev=nome;
			}else if(idade<idaden) {
				idaden=idade;
				nomen=nome;
			}
			count1++;
			idades=idades+idade;
			media=idades/count1;
			
	    }while(JOptionPane.showConfirmDialog(null,"Sair","Sair",JOptionPane.YES_NO_OPTION)==1);
		System.out.println("Pessoa mais velha:"+nomev+" idade:"+idadev+"\nPessoa mais nova: "+nomen+" idade:"+idaden+"\nMaiores de idade: "+count+"\nMedia="+media);
	}
	}


