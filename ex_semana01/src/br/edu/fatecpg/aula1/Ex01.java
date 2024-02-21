package br.edu.fatecpg.aula1;
import java.util.Scanner;
public class Ex01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

        int num;
        Scanner ler = new Scanner(System.in);
        
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		
		if (num>0) {
			System.out.println("Número positivo");
		} else {
			System.out.println("Número negativo");
		}
	}

}
