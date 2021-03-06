package br.com.caicai.model;

public class Elevador {
	private String nome;
	private short andarMaximo, andarAtual=0, andarMinimo;
	private byte capacidadeMaxima, qtdePessoas;
	
	public void configurar(short maximo, short minimo, byte capacidade) {
		if(maximo>=1) {
			andarMaximo=maximo;
		}
		if(minimo<=0) {
			andarMinimo=minimo;
		}
		if(capacidade>1) {
			capacidadeMaxima=capacidade;
		}
	}
	public void setNome(String arg) {
		if(!arg.equals(" ")) {
			nome=arg;
		}
	}
	public String getNome() {
		return nome;
	}
	public void subir() {
		if(andarAtual<andarMaximo) {
			andarAtual++;
		}
	}
	public void descer() {
		if(andarAtual>andarMinimo) {
			andarAtual--;
		}
	}
	public String entrar(byte arg) {
		if((qtdePessoas+arg)<capacidadeMaxima) {
			qtdePessoas=(byte)(qtdePessoas+arg);
			System.out.println("Sucesso");
			return "Sucesso";
		}else
			System.out.println("Erro");
			return "Erro";
	}
	public String sair(byte arg) {
		if((qtdePessoas-arg)>=0) {
			qtdePessoas=(byte)(qtdePessoas-arg);
			System.out.println("Sucesso");
			return "Sucesso";
		}else
			System.out.println("Erro");
			return "Erro";
	}
	public void subir(byte andar) {
		if((andarAtual+andar)<andarMaximo) {
			andarAtual=(short)(andarAtual+andar);
		}
	}
	public String getResumo() {
		return "Andar: "+andarAtual+"\nLota��o: "+qtdePessoas+"\nNome: "+nome;
	}
}
