package br.com.colecoes.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.colecoes.model.Cargo;

public class Main {

	public static void main(String[] args) {

		//List<String> lista =new ArrayList<String>();
		//lista.add("DBA");
		//lista.add("Suporte");
		//lista.add("DEV");
		//lista.add("DBA");
		//System.out.println(lista);
		//System.out.println("Segundo elemento: "+lista.get(1));
		//lista.remove(3);
		//System.out.println("Sem o quarto elemento"+lista);
	//	Collections.sort(lista);
	//	System.out.println("ordena: "+lista);

		//Set<String> lista2=new<String> HashSet();
		//lista2.add("DBA");
		//lista2.add("Suporte");
		//lista2.add("estagiario");
		//lista2.add("DEV");
		//lista2.add("DBA");
		//System.out.println("Original: "+lista2);
		//System.out.println("segundo elemento: "+ lista2.get(1));
		//lista2.remove(3);
		//System.out.println("Sem o quarto elemento: "+lista2);
		//Collections.sort(lista2);
		//System.out.println(" exibindo os dados");
		//for(String cargo:lista) {
		//	System.out.println("Nome: "+cargo);
		//}
		
		List <Cargo> lista = new ArrayList <Cargo>();
		lista.add(new Cargo("DBA","JR",10000));
		lista.add(new Cargo("DEV","PL",15000));
		lista.add(new Cargo("ESTAGIARIO","SR",3000));
		lista.add(new Cargo("DBA","PL",16000));
		float total=0;
		int dbas=0;
		double tot=0;
		for(Cargo cargo:lista) {
			tot+=cargo.getSalario();
		}
		for(Cargo cargo :lista) {
			if(cargo.getSalario()>=5000) {
				System.out.println("Salario: "+cargo.getSalario());
			}
			if(cargo.getNome().equals("DBA")) {
				dbas++;
				System.out.println("quantidade de DBA: "+dbas);
			}
			if(cargo.getNivel().equals("PL")) {
				 tot+=cargo.getSalario();
				System.out.println("Salario total: "+tot);
			}
		}
	}

}
