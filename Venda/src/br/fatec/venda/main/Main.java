package br.fatec.venda.main;

import java.util.Scanner;

import br.fatec.venda.model.Cupom;
import br.fatec.venda.model.Compra;

public class Main {

	public static void main(String[] args) {
		
		var scan = new Scanner(System.in);
		
		//populando objeto Compra e Cupom//
		System.out.print("Digite o nome do produto: ");
		String nome_prod = scan.nextLine();
		System.out.print("Digite o valor do produto: ");
		double valor_prod = scan.nextDouble();
		System.out.print("Digite a data da compra: ");
		String data = scan.nextLine();

		System.out.print("Código do cupom para desconto: ");
		int cod_cupom = scan.nextInt();
		
		System.out.print("Qual a % de desconto que esse cupom oferece? ");
		double desc_cupom = scan.nextDouble();

		//instanciando Objeto Cupom//
		var cupom = new Cupom(cod_cupom, desc_cupom);
		
		//instanciando Objeto Compra//
		var compra = new Compra(data, nome_prod, valor_prod, cupom);
		
		
		System.out.println("O valor final de sua compra foi: ");
		System.out.println(compra.calcDesconto(cupom));
		
	}

}