package ordena��o;
import javax.swing.JOptionPane;
public class Bubble {

	public static void main(String[] args) {
		int vetor[];
		int aux=0 , count=0;
		vetor = new int[3];
		for(count=0;count<3;count++) {
			vetor[count]=Integer.parseInt(JOptionPane.showInputDialog("entre numero inteiro"));	
		}
		for(count=0;count<3;count++) {
			for(int i=0;i<2;i++) {
				if(vetor[i]<vetor[i+1]) {
					aux=vetor[i];
					vetor[i]=vetor[i+1];
					vetor[i+1]=aux;
				}
			}
		}
		System.out.println("vetor decrescente:");
		for(count=0;count<3;count++) {
			System.out.println(""+vetor[count]);
		}
	}

}
