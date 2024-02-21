package br.edu.fatecpg.aula1;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int num1, num2;
        Scanner ler = new Scanner(System.in);
        
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = ler.nextInt();
		
		if (num1==num2) {
			System.out.println("Números iguais");
		} else if(num1>num2) {
			System.out.println("Os números são diferentes e " + num1 + " é maior que " + num2);
		} else if(num1<num2) {
			System.out.println("Os números são diferentes e " + num2 + " é maior que " + num1);
		}
	}
		
	}

