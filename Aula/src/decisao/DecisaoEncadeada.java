package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		String Disciplina;
		float nota1, nota2;
		float media;
		byte faltas;

		Disciplina=JOptionPane.showInputDialog("Entrar Disciplina");
		faltas=Byte.parseByte(JOptionPane.showInputDialog("entre faltas"));
		if(faltas<20) {
			nota1=Float.parseFloat(JOptionPane.showInputDialog("entre nota 1"));
			nota2=Float.parseFloat(JOptionPane.showInputDialog("entre nota 2"));
			media=(nota1+nota2)/2;
			System.out.println("Media="+ media);
			if(media>=6) {
				System.out.println("parabens voce passou em "+Disciplina);
			}      else if(media<6 && media>=4) {
				System.out.println("esta de exame");

			}else
				System.out.println("reprovado");
		}else
			System.out.println("Reprovado por faltas");

	}
}
