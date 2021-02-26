package decisao;
import javax.swing.JOptionPane;
public class Exercicio1 {

	public static void main(String[] args) {
		byte diarias = Byte.parseByte(JOptionPane.showInputDialog("digite quantia de diaria"));
	    
		if(diarias>15) {
			double conta=diarias*5.5;
			JOptionPane.showMessageDialog(null, "Conta:\nR$ "+conta);
		}else if(diarias==15) {
			double conta=diarias*6;
			JOptionPane.showMessageDialog(null, "Conta:\nR$ "+conta);
		}else {
			double conta=diarias*8;
		JOptionPane.showMessageDialog(null, "Conta:\nR$ "+conta);
		}
	}

}
