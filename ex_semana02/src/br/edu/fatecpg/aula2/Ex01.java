package br.edu.fatecpg.aula2;

public class Ex01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz1 = new int[3][3];
		int[][] matriz2 = new int[3][3];
		int[][] soma = new int[3][3];
		
		OperacoesMatriz.addMatriz(matriz1, 1);
		OperacoesMatriz.addMatriz(matriz2, 2);
		OperacoesMatriz.somaMatriz(matriz1,matriz2,soma);
	}

}