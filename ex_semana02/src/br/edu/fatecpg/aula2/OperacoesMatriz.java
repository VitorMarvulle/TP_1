package br.edu.fatecpg.aula2;

import java.util.Scanner;


public class OperacoesMatriz {
static Scanner scan = new Scanner(System.in);

	// Método para adicionar dados int nas matrizes e printar
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
	
	// Método para somar matrizes
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
	
	// Método para add elementos na matriz tipo String
	public static void addMatriz_stg(String M[][], int c){
		
		for (int i=0; i<M.length; i++){
			for(int j=0; j<M[0].length; j++){
				System.out.print("Digite a posição ["+i+"]"+"["+j+"] da MATRIZ " +c+":");
				M[i][j] = scan.nextLine();
			}		
		}	
	}
	
	// Método para verificar e comparar elementos na matriz String
	public static boolean verificaMatriz(String M[][], String login, String senha) {
		boolean check = false;
			for (int i=0;i<M.length;i++){
				for (int j=0;j<M[0].length;j++){
					if((M[i][0].equals(login))&&(M[i][1].equals(senha))){
					check = true;
					}

				}
			} return check;

			
		
	}
	// Printar matriz tipo String
	public static void printMatriz(String M[][]) {

		System.out.println("VERIFICAÇÃO DE LOGIN/SENHA NA MATRIZ");
		for (String[]dadosMatriz : M){
			for(String dado : dadosMatriz){

				System.out.print(dado+" | ");
			}
			System.out.println("\n");
		}
	
	}
	
	public static void transpMatriz(int M[][], int N[][]) {

		for (int i=0; i<M.length; i++){
			
			for(int j=0; j<M[0].length; j++){
			N[j][i]= M[i][j];
			}
			
		}
	}
	
	
	public static void printTranspMatriz(int N[][]) {

		System.out.println("TRANSPOSIÇÃO DA MATRIZ");
		for (int[]dadosMatriz : N){
			for(int dado : dadosMatriz){
				System.out.print(dado+" | ");
			}
			System.out.println("\n");
		}
	
	}
	
	
	
}

