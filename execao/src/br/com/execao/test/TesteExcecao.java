package br.com.execao.test;

public class TesteExcecao {

	public static void main(String[] args) {
		try {
		int numero = Integer.parseInt("7");
		System.out.println("Numero: "+ numero);
		
		if (numero>10) {
			throw new RuntimeException();
		}
		
		String palavra=" ";
		System.out.println("Qtde Caracteres: "+palavra.length());
		
		int[]numeros= new int[2];
		numeros[0]=15;
		numeros[1]=7;
		numeros[2]=510;
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("vetor fora dos limites");
		}catch(NullPointerException e) {
			System.out.println("objeto nulo");
		}catch(NumberFormatException e) {
			System.out.println("Numero invalido");
		}catch(Exception e) {
			System.out.println("Deu ruim"+e);
		}finally {
			System.out.println("Ate logo");
		}
	}

}
