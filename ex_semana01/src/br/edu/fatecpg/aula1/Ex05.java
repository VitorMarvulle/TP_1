package br.edu.fatecpg.aula1;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int num;
        Scanner ler = new Scanner(System.in);
        
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		
		if (num%2==0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número ímpar");
		}ler.close();
	}

}
