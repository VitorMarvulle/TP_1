package br.edu.fatecpg.aula2;

public class Ex02 {

	public static void main(String[] args) {
		int[][] matriz1 = new int[6][2];
		int[][] matriz2 = new int[6][2];
		int[][] mult = new int[6][2];

		
		OperacoesMatriz.addMatriz(matriz1, 1);
		OperacoesMatriz.addMatriz(matriz2, 2);
		OperacoesMatriz.multMatriz(matriz1,matriz2,mult);
		
	}

}
