package decisao;
import javax.swing.JOptionPane;
public class DecisaoSimplesDesafio {

	public static void main(String[] args) {
		String nome;
		short idade;
		
		nome=JOptionPane.showInputDialog("Digite nome");
		idade=Short.parseShort(JOptionPane.showInputDialog("Digite idade"));
		
		if(idade==16 ||idade==17 || idade>70) {
			JOptionPane.showMessageDialog(null, nome+ " seu voto � facultativo");
		}else if(idade>=18 && idade<=70) {
			JOptionPane.showMessageDialog(null, nome+ " seu voto � Obrigatorio");
		}else
			JOptionPane.showMessageDialog(null, nome+ " Proibido votar");
	}

}
