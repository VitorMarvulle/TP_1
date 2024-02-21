package br.edu.fatecpg.aula1;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int num, res=1;
        Scanner ler = new Scanner(System.in);
        
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		
		for (int i=num-1; i>0; i--) {
			res=res+res*i;
			System.out.println(i);
		}
		System.out.println("O fatorial de "+num+" é: "+res);

	}

}
