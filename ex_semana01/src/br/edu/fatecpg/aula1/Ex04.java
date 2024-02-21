package br.edu.fatecpg.aula1;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int num1;
        Scanner ler = new Scanner(System.in);
        
		System.out.println("Digite o número que deseja a tabuada: ");
		num1 = ler.nextInt();
		
		for (int i=1; i<11;i++) {
			System.out.println(num1 + " x " + i + " = " +num1*i);
			}	
	}

}
