package repetição;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		String escolaridade;
		int count1=0, count2=0, count3=0;
		do {
			escolaridade=JOptionPane.showInputDialog("Digite escolaridade\ndigite e para sair").toLowerCase();
			if(escolaridade.equals("medio")) {
				count1++;
			}else if(escolaridade.equals("superior")) {
				count2++;
			}else if(escolaridade.equals("pos")) {
				count3++;
			}
		}while(escolaridade.equals("medio")||escolaridade.equals("superior")||escolaridade.equals("pos"));
		if(count1>count2&&count1>count3) {
			System.out.println("medio");
		}else if(count2>count1&&count2>count3) {
			System.out.println("superior");
		}else
			System.out.println("pos");
	}

}
