package br.fatec.escola.main;

import br.fatec.escola.model.Aluno;
import br.fatec.escola.model.Disciplina;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		var scan = new Scanner(System.in);
		
		//populando objeto Aluno e Disciplina//
		System.out.print("Digite seu Nome: ");
		String nome = scan.nextLine();
		System.out.print("Digite seu Matricula: ");
		String matricula = scan.nextLine();

		System.out.print("Digite o nome da disciplina: ");
		String nome_dis = scan.nextLine();
		System.out.print("Digite a sigla da disciplina: ");
		String sigla_dis = scan.nextLine();
		System.out.print("Digite o código da disciplina: ");
		int cod_dis = scan.nextInt();

		//instanciando Objeto Aluno//
		var aluno = new Aluno(nome, matricula);
		
		//instanciando Objeto Disciplina//
		var dis = new Disciplina(nome_dis, sigla_dis, cod_dis);
		
		//Setando atributo aluno dentro do objeto disciplina
		
		dis.setAluno(aluno);  //opcional
				
		System.out.println(aluno.toString());
		System.out.println(dis.toString());
		
		
		
		
	}

}
