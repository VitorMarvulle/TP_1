package br.edu.fatecpg.aula2;

import java.util.Arrays;
import java.util.Scanner;


public class OperacoesMatriz {
static Scanner scan = new Scanner(System.in);

	//Função para adicionar dados nas matrizes e printar
	public static void addMatriz(int M[][], int c){
		
		for (int i=0; i<M.length; i++){
			for(int j=0; j<M[0].length; j++){
				System.out.print("Digite a posição ["+i+"]"+"["+j+"] da MATRIZ " +c+":");
				M[i][j] = scan.nextInt();
			}		
		}	
		for (int[]dadosMatriz : M){
			for(int dado : dadosMatriz){
				System.out.print(dado+" | ");
			}
			System.out.println("\n");
		}
	}
	
	public static void somaMatriz(int M[][], int N[][], int S[][]) {
		
		for (int i=0;i<M.length;i++){
			for (int j=0;j<M[0].length;j++){
				S[i][j]=M[i][j]+N[i][j];
			}	
		}
		System.out.println("SOMA DAS MATRIZES");
		for (int[]dadosMatriz : S){
			for(int dado : dadosMatriz){
				System.out.print(dado+" | ");
			}
			System.out.println("\n");
		}
	}	

	public static void addMatriz_stg(String M[][], int c){
		
		for (int i=0; i<M.length; i++){
			for(int j=0; j<M[0].length; j++){
				System.out.print("Digite a posição ["+i+"]"+"["+j+"] da MATRIZ " +c+":");
				M[i][j] = scan.nextLine();
			}		
		}	
		for (String[]dadosMatriz : M){
			for(String dado : dadosMatriz){
				System.out.print(dado+" | ");
			}
			System.out.println("\n");
		}
	}
	
	public static void verificaMatriz(String M[][], String login, String senha) {
		int  pos1=0, pos2=0, i=0;

			for (i=0;i<M.length;i++){
				for (int j=0;j<M[0].length;j++){
					if((M[i].equals(login))&&(M[j].equals(senha))){
						pos1=i;
						pos2=j;
						break;
					} if(Arrays.asList(M).contains( {
						
					}
	
				}break;
			}
		
		
		System.out.println("VERIFICAÇÃO DE LOGIN/SENHA NA MATRIZ");
		for (String[]dadosMatriz : M){
			for(String dado : dadosMatriz){
				System.out.print(dado+" | ");
			}
			System.out.println("\n");
			
			
		}System.out.println("Login e senha corretos nas posições["+pos1+"]"+"["+pos2+"] da MATRIZ");
	}
	
	
	
}