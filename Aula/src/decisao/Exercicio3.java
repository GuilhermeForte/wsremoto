package decisao;
import javax.swing.JOptionPane;
public class Exercicio3 {

	public static void main(String[] args) {
		int num1, num2;
		String op;
		num1=Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
		num2= Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
		op=JOptionPane.showInputDialog("digite opera��o");
		
		if (op.contentEquals("soma")) {
			int res=num1+num2;
			JOptionPane.showMessageDialog(null,"resultado: "+res);
		}else if (op.contentEquals("subtra��o")){
			int res=num1-num2;
			JOptionPane.showMessageDialog(null,"resultado: "+res);
		}else if (op.contentEquals("multiplica��o")) {
			int res=num1*num2;
			JOptionPane.showMessageDialog(null,"resultado: "+res);
		}else if (op.contentEquals("Divis�o")) {
			if (num2>0) {
			int res=num1/num2;
			JOptionPane.showMessageDialog(null,"resultado: "+res);
		}else
		JOptionPane.showMessageDialog(null,"erro ");

	}

}}
