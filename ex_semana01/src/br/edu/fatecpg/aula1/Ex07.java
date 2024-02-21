package br.edu.fatecpg.aula1;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int num;
        Scanner ler = new Scanner(System.in);
        
		System.out.println("Digite a idade: ");
		num = ler.nextInt();
		
		if (num<18) {
			System.out.println("Menor de idade");
		} 
		
		else if(num>=18 && num<=60) {
			System.out.println("Pessoa adulta");
		}
		
		else {
			System.out.println("Pessoa idosa");
		}
		
	}

}
