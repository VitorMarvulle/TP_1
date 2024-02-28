package br.edu.fatecpg.aula2;

public class Ex02 {

	public static void main(String[] args) {
		String[][] matriz1 = new String[6][2];
		String login = "Vitor";
		String senha = "java123";
		
		OperacoesMatriz.addMatriz_stg(matriz1, 1);
		OperacoesMatriz.verificaMatriz(matriz1, login, senha);
		
	}

}
