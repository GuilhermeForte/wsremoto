package repeti��o;

import javax.swing.JOptionPane;

public class WhileDesafio {

	public static void main(String[] args) {
		String nome;
		byte idade;
		
		nome=JOptionPane.showInputDialog("Digite nome").toUpperCase();
		idade=Byte.parseByte(JOptionPane.showInputDialog("digite idade"));
		while(nome.length()<5||nome.length()>15||nome.indexOf(' ')==-1) {
			nome=JOptionPane.showInputDialog("Nome deve tere entre 5 e 15 chars e deve conter pelomenos 1 espa�o").toUpperCase();
		}
		while(idade<18||idade>70) {
				idade=Byte.parseByte(JOptionPane.showInputDialog("Idade deve estar entre 18 e 70"));
			}
		System.out.println("Nome: "+nome+"/t"+"Idade: "+idade);
		}
		
}
	


