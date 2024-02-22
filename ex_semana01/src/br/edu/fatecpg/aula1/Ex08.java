package br.edu.fatecpg.aula1;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num, res=0;
        Scanner ler = new Scanner(System.in);
        
		System.out.println("Digite um número inteiro: ");
		num = ler.nextInt();

	
		for(int i=1; i<num+num-1; i+=2) {
			System.out.println(i);
			res=res+i;
			
			}
		System.out.println("O resultado da soma dos ímpares é: "+res);
		ler.close();
		} 
	}

