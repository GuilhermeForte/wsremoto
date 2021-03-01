package br.com.universidadeXPTO.main;

import javax.swing.JOptionPane;

import br.com.universidadeXPTO.model.Aluno;
import br.com.universidadeXPTO.model.Curso;
import br.com.universidadeXPTO.model.Professor;
import br.com.universidadeXPTO.model.Turma;
import util.Magica;

public class Main {

	public static void main(String[] args) {
		Turma tTeste= new Turma(Magica.i("Numero da Turma"),
				Magica.s("Entre com periodo"),
				new Curso(Magica.s("Entre curso"),Magica.s("Entre Sigla"),Magica.i("Carga horaria")),
				new Professor(Magica.s("Nome professor"),Magica.s("Entre e-mail"),Magica.s("Formação"),Magica.s("Area"),Magica.s("Sub-Area")),
				new Aluno(Magica.s("Nome aluno"),Magica.s("Entre e-mail"),Magica.i("RM"),Magica.bool("Aluno é bolsista?","Confirmação")));
		System.out.println(tTeste);

	}

}
