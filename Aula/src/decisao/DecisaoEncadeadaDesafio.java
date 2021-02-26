package decisao;
import javax.swing.JOptionPane;
public class DecisaoEncadeadaDesafio {

	public static void main(String[] args) {
		String nome, cat;//categoria cat=string cat1=string to char.
		char cat1;
		int quant;
		double vu, imp;//vu - valor unitario; imp - imposto

		do  {
			nome=JOptionPane.showInputDialog("Digite nome do produto");
			vu=Double.parseDouble(JOptionPane.showInputDialog("Digite valor do produto"));
			quant=Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade"));
			cat=JOptionPane.showInputDialog("a- Alimenticio\nb- Eletronico\ne -Sair");
			cat1=cat.charAt(0);

			switch(cat1){
			case 'a':
				if(quant>100) {
					imp=vu*0.4;
				}else if(quant<50) {
					imp=vu*0.5;
				}else {
					imp=vu*0.45;
				}JOptionPane.showMessageDialog(null,"valor unitario: R$ "+vu+"\nImposto: R$"+imp);
				break;
			case 'b':
				if(quant>100) {
					imp=vu*0.6;
				}else if(quant<50) {
					imp=vu*0.7;
				}else {
					imp=vu*0.65;
				}JOptionPane.showMessageDialog(null,"valor unitario: R$ "+vu+"\nImposto: R$"+imp);
				break;
			default:
				if(cat1== 'e') {
				}else
					JOptionPane.showMessageDialog(null,"opção inexistente");
				break;
			}

		} while(cat1!='e');
	}
}
