package br.edu.fatecpg.aula1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nomes = new String[5];
		 
        Scanner ler = new Scanner(System.in);
        
        for(int i=0; i<5; i++) {
        	System.out.println("Digite o "+(i+1)+"º nome: ");
    		nomes[i] = ler.nextLine();
        }
        
        
        System.out.println(Arrays.toString(nomes));    
		
        System.out.println("Digite o último nome: ");
        String ult_nome = ler.nextLine();
		
        for(int i=0; i<nomes.length;) {
        	if (nomes[i].equals((ult_nome))) {
        		System.out.println("O nome "+nomes[i]+ " é igual a " +ult_nome);
        	}
        	else  {
        		System.out.println("Não possui nomes iguais");
        		
        	}
        break;
        }ler.close();
        
	}

}
