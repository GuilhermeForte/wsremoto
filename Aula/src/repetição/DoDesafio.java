package repeti��o;

import javax.swing.JOptionPane;

public class DoDesafio {

	public static void main(String[] args) {
		int jogador1, jogador2;
		int count=1;
		jogador1=Integer.parseInt(JOptionPane.showInputDialog("Jogador1 digite numero"));
		do {
			jogador2=Integer.parseInt(JOptionPane.showInputDialog("Jogador 2 tente adivinhar o numero"));
			if(jogador2>jogador1) {
				count++;
				JOptionPane.showMessageDialog(null, "numero digirado foi maior que o correto");			
			}else if(jogador2<jogador1) {
				count++;
				JOptionPane.showMessageDialog(null,"Numero digitado foi menor que o correto");			
			}			
		}while(jogador2!=jogador1);
		System.out.println("Parabens\nTentativas: "+count);
	}
}
