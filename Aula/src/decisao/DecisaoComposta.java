package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		String Disciplina;
		float nota1, nota2;
		float media; 
		
		Disciplina=JOptionPane.showInputDialog("Entrar Disciplina");
		nota1=Float.parseFloat(JOptionPane.showInputDialog("entre nota 1"));
		nota2=Float.parseFloat(JOptionPane.showInputDialog("entre nota 2"));
		media=(nota1+nota2)/2;
		System.out.println("Media="+ media);
		if(media>=6) {
			System.out.println("parabens voce passou em "+Disciplina);
		}else if(media<6 && media>=4) {
			System.out.println("esta de exame");
			
		}else
			System.out.println("Reprovado");

	}

}
