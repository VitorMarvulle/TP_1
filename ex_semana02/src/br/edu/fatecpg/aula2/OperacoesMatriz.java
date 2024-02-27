package br.edu.fatecpg.aula2;

import java.util.Scanner;

public class OperacoesMatriz {
static Scanner scan = new Scanner(System.in);

	//Função para adicionar dados nas matrizes e printar
	public static void addMatriz(int M[][], int c){
		
		for (int i=0; i<M.length; i++){
			for(int j=0; j<M.length; j++){
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
			for (int j=0;j<M.length;j++){
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

	public static void multMatriz(int M[][], int N[][], int S[][]) {
		
		for (int i=0;i<M.length;i++){
			for (int j=0;j<M.length;j++){
				S[i][j]=M[i][j]* N[i][j];
			}	
		}
		System.out.println("MULTIPLICAÇÃO DAS MATRIZES");
		for (int[]dadosMatriz : S){
			for(int dado : dadosMatriz){
				System.out.print(dado+" | ");
			}
			System.out.println("\n");
		}
	}
	
	
}