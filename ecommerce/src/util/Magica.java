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

}
