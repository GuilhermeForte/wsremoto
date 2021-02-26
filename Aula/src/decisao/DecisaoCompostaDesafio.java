package decisao;
import javax.swing.JOptionPane;
public class DecisaoCompostaDesafio {

	public static void main(String[] args) {
		String T1, T2;//T1, T2 - times
		short p1, p2; //p1, p2 - placar
		
		T1=JOptionPane.showInputDialog("Time 1");
		T2=JOptionPane.showInputDialog("Time 2");
		p1=Short.parseShort(JOptionPane.showInputDialog("digite placar time 1"));
		p2=Short.parseShort(JOptionPane.showInputDialog("digite placar time 2"));
		
		if(p1>p2) {
			JOptionPane.showMessageDialog(null,T1+" venceu");
		}else if(p2>p1) {
			JOptionPane.showMessageDialog(null,T2+" venceu");
		}else
			JOptionPane.showMessageDialog(null, "empate");
	}

}
