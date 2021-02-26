package repetição;

import javax.swing.JOptionPane;

public class ForExemplo {

	public static void main(String[] args) {
		int tabuada=Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
		for(int contador=1;contador<11;contador++) {
			System.out.println(tabuada+" x "+contador+" = "+(tabuada*contador));
		}

	}

}
