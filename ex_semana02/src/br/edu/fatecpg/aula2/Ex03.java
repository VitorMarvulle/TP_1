package br.edu.fatecpg.aula2;

public class Ex03 {

	public static void main(String[] args) {
		int[][] matriz1 = new int[4][4];
		int[][] transp = new int[4][4];

		
		OperacoesMatriz.addMatriz(matriz1, 1);
		OperacoesMatriz.transpMatriz(matriz1, transp);
		OperacoesMatriz.printTranspMatriz(transp);
		
	}	

}
