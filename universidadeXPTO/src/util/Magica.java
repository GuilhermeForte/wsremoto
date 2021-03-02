package util;

import javax.swing.JOptionPane;

public class Magica {
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static int i(String msg){
		return Integer.parseInt(s(msg));
	}
	
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}
	
	public static byte b(String msg) {
		return Byte.parseByte(msg);
	}
	
	public static boolean bool(String msg, String titulo) {
		int n=JOptionPane.showConfirmDialog(null,msg, titulo,JOptionPane.YES_NO_OPTION);
		if(n==0) {
			return true;
		}else
			return false;
	}

}
