package br.fatec.minhaloja.main;

import br.fatec.minhaloja.model.Endereco;
import br.fatec.minhaloja.model.Pessoa;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		var scan = new Scanner(System.in);
		
		//populando objeto Pessoa e Enedereco//
		System.out.print("Digite seu Nome: ");
		String nome = scan.nextLine();
		System.out.print("Digite seu Documento: ");
		String doc = scan.nextLine();
		System.out.print("Digite sua rua: ");
		String rua = scan.nextLine();
		System.out.print("Digite o número da residência : ");
		int num = scan.nextInt();
		scan.nextLine();
;		System.out.println("Digite seu CEP: ");
		String cep = scan.nextLine();
		
		//instanciando Objeto Pessoa//
		var sua_rua = new Endereco(cep, rua, num);
		var pessoa1 = new Pessoa(nome, doc, sua_rua);
		
		System.out.println(pessoa1.toString());
		
		
	}

}
