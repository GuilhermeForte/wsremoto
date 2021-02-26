package variaveis;

public class variavel_string {
	public static void main(String[] args) {
	      String email = "humBerTo@fiAp.cOm.br";
	      System.out.println("Original: "+email);
	      System.out.println("Minusculo:"+email.toLowerCase());
	      System.out.println("Quant Caract:"+email.length());
	      System.out.println("Tem @?:"+email.contains("@"));
	      System.out.println("posição do @:"+email.indexOf("@"));
	      System.out.println("exibir do 3º ao 5º:"+email.substring(2,5));
	      System.out.println("exibir do 5º para o fim:"+email.substring(4));
	      System.out.println("primeira metade:"+email.substring(0,email.length()/2));
	      System.out.println("segunda metade:"+email.substring(email.length()/2));
	      System.out.println("User name: "+email.substring(0,email.indexOf("@")));
	      System.out.println("comparando primitivas:" +(7==8));
	      System.out.println("comparando String:"+email.equals("abc"));
		}
}
