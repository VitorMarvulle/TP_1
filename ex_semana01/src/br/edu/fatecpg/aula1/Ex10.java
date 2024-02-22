package br.edu.fatecpg.aula1;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String senha = "Java123";			
		boolean run = true;
		Scanner ler = new Scanner(System.in);
		
		while (run) {
			System.out.println("Digite a senha: ");
			String attempt = ler.nextLine();
			if (attempt.equals(senha)) {
				run = false;
				System.out.println("Senha correta!");
			}
			
			else {
			
				System.out.println("Senha incorreta, tente novamente!");
				}ler.close();

			}
		}
	}


