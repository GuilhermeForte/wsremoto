package repeti��o;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		byte dia, mes;
		int ano;
		do {
			mes=Byte.parseByte(JOptionPane.showInputDialog("digite mes"));
			if(mes<=0||mes>=12) {
				JOptionPane.showMessageDialog(null,"Mes incorreto");
			}
		}while(mes==0||mes>12);
		if(mes==2) {
			do {
			 dia=Byte.parseByte(JOptionPane.showInputDialog("digite dia"));
			}while(dia<1||dia>29);
		}else {
			do {
				dia=Byte.parseByte(JOptionPane.showInputDialog("digite dia"));
			}while(dia<1||dia>32);
		}
		do {
			ano=Integer.parseInt(JOptionPane.showInputDialog("digite Ano"));
		}while(ano<1);
		if(mes<10) {
			System.out.println("0"+mes+"/"+dia+"/"+ano);
		}else
			System.out.println(mes+"/"+dia+"/"+ano);


	}

}
